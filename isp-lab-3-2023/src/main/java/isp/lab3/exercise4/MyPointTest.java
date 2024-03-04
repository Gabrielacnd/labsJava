package isp.lab3.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void testDistance() {
        MyPoint p1 = new MyPoint();
        p1.setXYZ(2, 2, 2);
        MyPoint p2 = new MyPoint();
        p2.setXYZ(1, -1, -3);
        double actual = p1.distance(p2);
        assertEquals(5, (int) actual);
        //////cand unul din puncte are coordonatele 0.
        MyPoint p3 = new MyPoint();
        p3.setXYZ(0, 0, 0);
        assertEquals(3, (int) p1.distance(p3));
        //Cand ambele puncte au coordonatele 0.
        MyPoint p4 = new MyPoint();
        p4.setXYZ(0, 0, 0);
        MyPoint p5 = new MyPoint();
        p5.setXYZ(0, 0, 0);
        assertEquals(0, (int) p4.distance(p5));


    }
}
