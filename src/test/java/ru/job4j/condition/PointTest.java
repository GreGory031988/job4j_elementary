package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to34then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to22then1() {
        double expected = 1;
        Point a = new Point(2, 3);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10To70Then6() {
        double expected = 6;
        Point a = new Point(1, 0);
        Point b = new Point(7, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To004Then4() {
        double expected = 4;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}