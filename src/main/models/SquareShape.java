package models;

public class SquareShape extends Rectangle{

    public SquareShape(double side){
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    } 
}
