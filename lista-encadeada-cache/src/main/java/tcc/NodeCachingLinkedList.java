/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tcc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;


public class NodeCachingLinkedList<E> extends AbstractLinkedList<E> implements Serializable {

    private static final long serialVersionUID = 6897789178562232073L;
    private static final int DEFAULT_MAXIMUM_CACHE_SIZE = 20;

    private transient Node<E> firstCachedNode;

    private transient int cacheSize;
    private int maximumCacheSize;

    public NodeCachingLinkedList() {
        this(DEFAULT_MAXIMUM_CACHE_SIZE);
    }

    public NodeCachingLinkedList(final Collection<? extends E> coll) {
        super(coll);
        this.maximumCacheSize = DEFAULT_MAXIMUM_CACHE_SIZE;

    }

    public NodeCachingLinkedList(final int maximumCacheSize) {
        this.maximumCacheSize = maximumCacheSize;
        init();  // must call init() as use super();
    }

    protected int getMaximumCacheSize() {
        return maximumCacheSize;
    }


    protected void setMaximumCacheSize(final int maximumCacheSize) {
        this.maximumCacheSize = maximumCacheSize;
        shrinkCacheToMaximumSize();
    }

    protected void shrinkCacheToMaximumSize() {
        while (cacheSize > maximumCacheSize) {
            getNodeFromCache();
        }
    }

    protected Node<E> getNodeFromCache() {
        if (cacheSize == 0) {
            return null;
        }
        final Node<E> cachedNode = firstCachedNode;
        firstCachedNode = cachedNode.next;
        cachedNode.next = null;
        cacheSize--;
        return cachedNode;
    }

    protected boolean isCacheFull() {
        return cacheSize >= maximumCacheSize;
    }

    protected void addNodeToCache(final Node<E> node) {
        if (isCacheFull()) {
            return;

        }
        final Node<E> nextCachedNode = firstCachedNode;
        node.previous = null;
        node.next = nextCachedNode;
        node.setValue(null);
        firstCachedNode = node;
        cacheSize++;

    }

    @Override
    protected Node<E> createNode(final E value) {
        final Node<E> cachedNode = getNodeFromCache();
        if (cachedNode == null) {
            return super.createNode(value);

        }
        cachedNode.setValue(value);
        return cachedNode;
    }

    @Override
    protected void removeNode(final Node<E> node) {
        super.removeNode(node);
        addNodeToCache(node);
    }

    @Override
    protected void removeAllNodes() {
        final int numberOfNodesToCache = Math.min(size, maximumCacheSize - cacheSize);
        Node<E> node = header.next;
        for (int currentIndex = 0; currentIndex < numberOfNodesToCache; currentIndex++) {
            final Node<E> oldNode = node;
            node = node.next;
            addNodeToCache(oldNode);

        }
        super.removeAllNodes();
    }

    private void writeObject(final ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        doWriteObject(out);
    }


    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        doReadObject(in);

    }

}