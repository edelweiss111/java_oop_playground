package tests;
import models.Line;
import models.Point2D;
import models.Polyline;
import utils.LengthCalculator;

public class TestLengthCalculator {
    public static void lengthCalculatorTest(){
        Point2D A = new Point2D(1, 5);
        Point2D B = new Point2D(2, 8);
        Point2D C = new Point2D(5, 3);

        Line line1 = new Line(3, 5, 25, 6);
        Polyline line2 = new Polyline(new Point2D[] {A, B, C});

        System.out.println(LengthCalculator.totalLength(line1, line2));
    }    
}
