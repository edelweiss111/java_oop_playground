package tests;

import models.ClosedPolyline;
import models.Point2D;
import models.Polyline;

public class PolylineTest {
    public static void testPolylines(){
        Point2D A = new Point2D(1, 5);
        Point2D B = new Point2D(2, 8);
        Point2D C = new Point2D(5, 3);
        Point2D D = new Point2D(5, 15);
        Point2D E = new Point2D(8, 10);

        Point2D points1[] = {A, B, C};
        Polyline ABC = new Polyline(points1);

        System.out.println(ABC.getLength());

        ABC.addPoints(D, E);

        System.out.println(ABC.getLength());
    }

    public static void testPolylinesEquals(){
        Point2D A = new Point2D(1, 2);
        Point2D B = new Point2D(3, 4);
        Point2D C = new Point2D(7, 8);

        Polyline ABC = new Polyline(A, B, C);
        System.out.println("ABC " + ABC.toString());
        ClosedPolyline closedABC = new ClosedPolyline(A, B, C);
        System.out.println("ABC замкнутая " + closedABC.toString());
        Polyline ABCA = new Polyline(A, B, C, A);
        System.out.println("ABCA " + ABCA.toString());

        System.out.println("ABC и АВС замкнутая " + ABC.equals(closedABC));
        System.out.println("ABC и АВСA " + ABC.equals(ABCA));
        System.out.println("ABCA и АВС замкнутая " + ABCA.equals(closedABC));
    }
}
