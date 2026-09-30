package tests;

import models.Point2D;

public class PointTest {
    public static void testPoints(){

    //1.1.1 сущности точки
    Point2D A = new Point2D(10, 20);
    Point2D B = new Point2D(-10, 13);
    Point2D C = new Point2D(0, -9);

    System.out.println("A = " + A.toString());
    System.out.println("B = " + B.toString());
    System.out.println("C = " + C.toString());
    }
}
