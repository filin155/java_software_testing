package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import org.testng.Assert;



public class PointTests {

    @Test
    public void tesDistanceZeroDistance() {
        Point p1 = new Point(0,1);
        Point p2 = new Point(0,1);
        Assert.assertEquals(p1.distance(p2), 00);
    }

    @Test
    public void tesDistanceOtherDistance() {
        Point p1 = new Point(-1,3);
        Point p2 = new Point(6,2);
        Assert.assertEquals(p1.distance(p2), 7.07);
    }
}
