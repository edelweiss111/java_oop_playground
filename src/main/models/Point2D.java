package models;

public sealed class Point2D permits Point3D {

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
}
