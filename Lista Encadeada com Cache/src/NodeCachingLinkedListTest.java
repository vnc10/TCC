import org.apache.commons.collections4.list.NodeCachingLinkedList;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class NodeCachingLinkedListTest {
    @Test(timeout = 4000)
    public void testEmpty() throws Throwable {
        NodeCachingLinkedList<Integer> node = new NodeCachingLinkedList<Integer>();
        node.add(4);
        assertFalse(node.isEmpty());
    }
    @Test(timeout = 4000)
    public void testFirst() throws Throwable {
        NodeCachingLinkedList<Integer> node = new NodeCachingLinkedList<Integer>();
        node.add(4);
        int aux = node.getFirst();
        assertEquals(4, aux);
    }
}
