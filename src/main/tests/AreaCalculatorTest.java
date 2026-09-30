package tests;

import models.Circle;
import models.Rectangle;
import models.SquareShape;
import models.Triangle;
import utils.AreaCalculator;

public class AreaCalculatorTest {
    public static void testAreaCalculator(){
        Circle circle = new Circle(3);
        SquareShape square = new SquareShape(3);
        Rectangle rectangle = new Rectangle(5, 2);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(AreaCalculator.totalArea(circle, square, rectangle, triangle));
    }
}
