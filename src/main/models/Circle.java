package models;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius){
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть больше 0");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
