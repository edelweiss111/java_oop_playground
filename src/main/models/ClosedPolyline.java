package models;

public class ClosedPolyline extends Polyline{

    public ClosedPolyline(Point ... points){
        super(points);
    }

    @Override
    public double getLength(){
        double result = super.getLength();
        if (result == 0) return 0;
        //Получаем список точек у родителя
        Point[] points = getPoints();

        //Замыкаем кривую линию
        Point end = points[points.length - 1];
        Point start = points[0];

        //Длины катетов
        double leg1 = start.getX() - end.getX();
        double leg2 = start.getY() - end.getY();

        //Длина расстояния
        result += Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        return result;
    }
}
