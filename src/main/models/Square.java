package models;

public class Square {
    private Point point;
    private int sideLength;

    public Square(Point point, int sideLength){
        this.point = point;
        //Можно вызвать сеттер для стороны, в котором уже прописана валидация
        setSideLength(sideLength);
    }

    public Square(int a, int b, int sideLength){
        this(new Point(a, b), sideLength);
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
       Point a = this.point;
       Point b = new Point(this.point.getX() + sideLength, this.point.getY());
       Point c = new Point(b.getX(), b.getY() - sideLength);
       Point d = new Point(c.getX() - sideLength, c.getY());
        
       //возвращаем ломанную линию, замыкающую контур квадрата
       return new Polyline(a, b, c, d, a);
    }

    @Override
    public String toString(){
        return "Квадрат в точке %s со стороной %d".formatted(point, sideLength);
    }
}
