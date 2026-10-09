package models;

import java.util.Objects;

public sealed class Point2D implements Cloneable permits Point3D{

    private int x;
    private int y;
    
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    //геттеры для координа
    public int getX() { return x; }
    public int getY() { return y; }

    //сеттеры для координат
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return "{%d;%d}".formatted(x, y);
    }

    @Override 
    public int hashCode(){
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        Point2D point = (Point2D) obj;
        if (point.x != this.x || point.y != this.y) return false;
        return true;
    }

    @Override
    public Point2D clone() throws CloneNotSupportedException{
        return (Point2D) super.clone();
    }
}
