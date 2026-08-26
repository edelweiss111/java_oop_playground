package tests;

import models.Point;
import models.Polyline;

public class PolylineTest {
    public static void testPolylines(){
        Point A = new Point(1, 5);
        Point B = new Point(2, 8);
        Point C = new Point(5, 3);
        Point D = new Point(2, -5);
        Point E = new Point(4, -8);

        Point points1[] = {A, B, C};
        Polyline ABC = new Polyline(points1);

        Polyline ADEC = new Polyline(new Point[] {ABC.getPoint()[0], D, E, ABC.getPoint()[2]});

        //Линия без параметров
        Polyline line3 = new Polyline();

        System.out.println(ABC.toString());
        System.out.println(ADEC.toString());

        //Сдвигаем начало у первой линии
        ABC.getPoint()[0].setX(0);
        ABC.getPoint()[0].setY(0);

        System.out.println(ADEC.toString());

        System.out.println(line3.toString());
    }
}
