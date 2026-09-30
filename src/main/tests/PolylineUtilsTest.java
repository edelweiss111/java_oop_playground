package tests;

import models.Square;
import utils.PolylineUtils;

public class PolylineUtilsTest {
    public static void testPolylineUtils(){
        Square square1 = new Square(5, 3, 10);
        Square square2 = new Square(0, 0, 8);
        Square square3 = new Square(-4, -5, 20);

        System.out.println(PolylineUtils.totaPolyline(square1, square2, square3));
    }
}
