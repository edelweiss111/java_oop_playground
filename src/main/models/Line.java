package models;

import java.util.Objects;

public class Line implements Lengthable, Cloneable{

    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end){
        this.start = new Point2D(start.getX(), start.getY());
        this.end = new Point2D(end.getX(),end.getY());
    }

    public Line(int x1, int y1, int x2, int y2){
        this.start = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    //геттеры без возможности изменять поля
    public Point2D getStart(){
        return new Point2D(this.start.getX(), this.start.getY());
    }

    public Point2D getEnd(){
        return new Point2D(this.end.getX(), this.end.getY());
    }

    //сеттеры
    public void setStart(Point2D start){
        this.start = new Point2D(start.getX(), start.getY());
    }

    public void setEnd(Point2D end){
        this.end = new Point2D(end.getX(),end.getY());
    }

    public double getLength(){
        //Длины катетов
        double leg1 = end.getX() - start.getX();
        double leg2 = end.getY() - start.getY();

        //Длина расстояния (с запятой)
        double d = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        //Округление
        int result = (int) Math.round(d);

        return result;
    }

    @Override
    public String toString(){
        return "Линия от %s до %s".formatted(start, end);
    }

    @Override
    public int hashCode(){
        //Делаем через сложение, чтобы у обратной линии hash был такой же (AB = BA)
        return Objects.hashCode(start) + Objects.hashCode(end);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        Line line = (Line) obj;
        if (line.start.equals(this.start) && line.end.equals(this.end)) return true;
        if (line.start.equals(this.end) && line.end.equals(this.start)) return true;
        return false;
    }

    @Override
    public Line clone() throws CloneNotSupportedException{
        Line copy = (Line) super.clone();
        //т.к. поля - это ссылки на объекты, нужно сделать их клоны
        copy.start = this.start.clone(); 
        copy.end = this.end.clone();
        return copy; 
    }
}
