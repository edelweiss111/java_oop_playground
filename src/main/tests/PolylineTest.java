package tests;

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

        // Polyline ADEC = new Polyline(new Point[] {ABC.getPoint()[0], D, E, ABC.getPoint()[2]});

        // //Линия без параметров
        // Polyline line3 = new Polyline();

        // System.out.println(ABC.toString());
        // System.out.println(ADEC.toString());

        // //Сдвигаем начало у первой линии
        // ABC.getPoint()[0].setX(0);
        // ABC.getPoint()[0].setY(0);

        // System.out.println(ADEC.toString());

        System.out.println(ABC.getLength());

        ABC.addPoints(D, E);

        System.out.println(ABC.getLength());
    }
}
