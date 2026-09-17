package models;

public class Triangle extends Shape{
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c){
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны должны быть больше 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override 
    public double getArea(){
        double p = (a + b + c)/2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
