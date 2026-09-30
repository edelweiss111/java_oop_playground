package utils;
import models.Point2D;
import models.Polyline;
import models.Polylineable;

public class PolylineUtils {
    public static Polyline totaPolyline(Polylineable ... items){
        //задаем размер массива
        int totalSize = 0;
        for (Polylineable item : items){
            if (item != null && item.getPolyline() != null){
                totalSize += item.getPolyline().getPoints().length;
            }
        }

        //создаем список нужного размера
        Point2D[] totalArr = new Point2D[totalSize];

        //индекс для вставки точки
        int i = 0;
        //проходимся циклом по фигурам
        for (Polylineable item : items){
            if (item != null && item.getPolyline() != null){
                //Затем по списку точек ломанных
                for (Point2D p: item.getPolyline().getPoints()){
                    //добавляем точку в итоговый массив
                    totalArr[i++] = p;
                }
            }
        }
        return new Polyline(totalArr);
    }
}
