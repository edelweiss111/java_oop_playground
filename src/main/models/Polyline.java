package models;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Polyline implements Lengthable {
    private Point2D[] points;

    public Polyline(Point2D ... points){
        this.points = points;
    }

    public Polyline(){}

    //Геттер точек
    public Point2D[] getPoints(){
        return this.points;
    }

    //Сеттер для точек
    public void addPoints(Point2D ... points){
        if (this.points == null) {
            this.points = points;
            return; //Выход из метода, если условие сработало
        }

        Point2D[] result = new Point2D[points.length + this.points.length];

        for (int i=0; i < this.points.length; i++){
            result[i] = this.points[i];
        }

        for (int i=0; i < points.length; i++){
            result[i+this.points.length] = points[i];
        }

        this.points = result;
    }

    //Метод возвращает длину линии
    public double getLength(){
            if (points == null || points.length < 2) return 0;
            
            double result = 0;

            for (int i=0; i < points.length-1; i++){
                Point2D p1 = points[i];
                Point2D p2 = points[i+1];

                //Длины катетов
                double leg1 = p2.getX() - p1.getX();
                double leg2 = p2.getY() - p1.getY();
                
                //Длина расстояния
                result += Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
            }   
            return result;
        }
    //Метод, возвращающий список всех точек (нужен для hash)
    protected List<Point2D> getFullPoints(){
        if (points == null) return  new ArrayList<>();
        return new ArrayList<>(Arrays.asList(points));
    }

    @Override
    public String toString(){
        return "Линия %s".formatted(Arrays.toString(points));
    }

    //Вычисляем hash по массиву всех точек
    @Override
    public int hashCode(){
        return Objects.hashCode(getFullPoints());
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj) return true;
        //Проверяем является ли объект экземпляром или наследником класса Polyline и сразу приводим его к этому типу в переменной polyline, также проверяется != null
        if (!(obj instanceof Polyline polyline)) return false;
        //Сразу сравниваем списки точек у объектов
        return Objects.equals(getFullPoints(), polyline.getFullPoints());
    }
}
