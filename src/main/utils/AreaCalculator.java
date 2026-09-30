package utils;

import models.Shape;

public class AreaCalculator {
    public static double totalArea(Shape ... shapes){
        double result = 0.0;

        for (Shape shape : shapes){
            if (shape != null){
                result += shape.getArea();
            }
        }
        return result;
    }
}
