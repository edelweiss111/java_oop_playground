package models;

import java.util.List;

public class ClosedPolyline extends Polyline{

    public ClosedPolyline(Point2D ... points){
        super(points);
    }

    @Override
    public double getLength(){
        double result = super.getLength();
        if (result == 0) return 0;
        //Получаем список точек у родителя
        Point2D[] points = getPoints();

        //Замыкаем кривую линию
        Point2D end = points[points.length - 1];
        Point2D start = points[0];

        //Длины катетов
        double leg1 = start.getX() - end.getX();
        double leg2 = start.getY() - end.getY();

        //Длина расстояния
        result += Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        return result;
    }

    @Override
    protected List<Point2D> getFullPoints(){
        List<Point2D> full = super.getFullPoints();
        //Если список точек не пустой, добавляем в конец точку начала (замыкаем линию)
        if (!full.isEmpty()) {
            full.add(full.get(0));
        }
        return full;
    }
}
