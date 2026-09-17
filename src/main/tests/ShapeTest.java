package tests;

import models.Circle;
import models.Rectangle;
import models.SquareShape;
import models.Triangle;

public class ShapeTest {
    public static void TestShape(){

        Circle circle = new Circle(3);
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getArea());
        
        SquareShape square = new SquareShape(5);
        System.out.println(square.getArea());
    }
}
