package tests;
import models.Polyline;
import models.Point2D;

import models.Square;

public class SquareTest {
    public static void testSquare(){
        Square square = new Square(5, 3, 23);

        System.out.println(square.getSideLength());

        square.setSideLength(10);

        System.out.println(square.getSideLength());

        square.setSideLength(-10);


        // Polyline pl1 = square.getPolyline();

        // System.out.println(pl1.getLength());

        // Point[] points = pl1.getPoints();
        // Point lastPoint = points[points.length - 1];
        // lastPoint.setX(15);
        // lastPoint.setY(25);

        // System.out.println("Новая длина ломаной: " + pl1.getLength());
    }
}
