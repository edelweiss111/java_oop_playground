package tests;

import models.Point;

public class PointTest {
    public static void testPoints(){

    //1.1.1 сущности точки
    Point A = new Point(10, 20);
    Point B = new Point(-10, 13);
    Point C = new Point(0, -9);

    System.out.println("A = " + A.toString());
    System.out.println("B = " + B.toString());
    System.out.println("C = " + C.toString());
    }
}
