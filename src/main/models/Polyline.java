package models;
import java.util.Arrays;

public class Polyline {
    private Point[] points;

    public Polyline(Point[] points){
        this.points = points;
    }

    public Polyline(){}

    //Геттер точек
    public Point[] getPoint(){
        return this.points;
    }

    @Override
    public String toString(){
        return "Линия %s".formatted(Arrays.toString(points));
    }
}
