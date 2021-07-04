import org.apache.commons.collections4.list.NodeCachingLinkedList;

public class NodeCaching extends NodeCachingLinkedList<Integer> {

    public NodeCaching() {
        NodeCachingLinkedList<Integer> node = new NodeCachingLinkedList<Integer>();
    }

    public int GetMaximumCacheSize(){
        return this.getMaximumCacheSize();
    }

    public void SetMaximumCacheSize(int maximumCacheSize){
        this.setMaximumCacheSize(maximumCacheSize);
    }

    public void CreateNode(int value){
        this.createNode(value);
    }

}
