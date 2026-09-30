package models;

public class Square implements Polylineable{
    private Point2D point;
    private int sideLength;

    public Square(Point2D point, int sideLength){
        this.point = point;
        //Можно вызвать сеттер для стороны, в котором уже прописана валидация
        setSideLength(sideLength);
    }

    public Square(int a, int b, int sideLength){
        this(new Point2D(a, b), sideLength);
    }

    //геттер для стороны
    public int getSideLength(){
        return sideLength;
    }

    //сеттер для стороны
    public void setSideLength(int sideLength){
        if (sideLength <= 0) throw new IllegalArgumentException("Сторона должна быть больше 0");
        this.sideLength = sideLength;
    }

    public Polyline getPolyline(){
       Point2D a = this.point;
       Point2D b = new Point2D(this.point.getX() + sideLength, this.point.getY());
       Point2D c = new Point2D(b.getX(), b.getY() - sideLength);
       Point2D d = new Point2D(c.getX() - sideLength, c.getY());
        
       //возвращаем ломанную линию, замыкающую контур квадрата
       return new ClosedPolyline(a, b, c, d, a);
    }

    @Override
    public String toString(){
        return "Квадрат в точке %s со стороной %d".formatted(point, sideLength);
    }
}
