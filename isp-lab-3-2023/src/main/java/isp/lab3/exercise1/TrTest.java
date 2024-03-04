package isp.lab3.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrTest {
    @Test
    public void grow() {

        Tree Tree2 = new Tree();
        int actual = Tree2.add(0);
        //pentru cazul cand m=0
        assertEquals(15, actual);
        //pentru cazul cand m<0
        int actual2 = Tree2.add(-2);
        assertEquals(15, actual2);
        //pentru cazul m>=1
        int actual3 = Tree2.add(6);
        assertEquals(36, actual3);

    }

    @Test
    public void testToString() {
        Tree Tree3 = new Tree();
        assertEquals("Height of the tree is " + 15, Tree3.toString());
    }
}
