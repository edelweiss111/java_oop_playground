package models;

public class ConfigurablePoint {

    private Object coordinates;
    private String color;
    private int size;

    //Конструкторы для каждого вида точки
    public  ConfigurablePoint(Point point, String color, int size){
        this.coordinates = point;
        this.color = color;
        this.size = size;
    }

    public  ConfigurablePoint(Point point, String color){
        this(point, color, 0);
    }

    public  ConfigurablePoint(Point point){
        this(point, null, 0);
    }

    public  ConfigurablePoint(Point2D point, String color, int size){
        this.coordinates = point;
        this.color = color;
        this.size = size;
    }

    public  ConfigurablePoint(Point2D point, String color){
        this(point, color, 0);
    }

    public  ConfigurablePoint(Point2D point){
        this(point, null, 0);
    }

    public ConfigurablePoint(Point point, int size) {
    this(point, null, size);
    }

    public ConfigurablePoint(Point2D point, int size) {
        this(point, null, size);
    }

    //сеттеры
    public void setColor(String color){
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }

    //геттеры
    public String getColor(){
        return color;
    }

    public int getSize(){
        return size;
    }

    public Object getCoordinates(){
        return coordinates;
    }

    @Override
    public String toString() {
        String result = "Точка в координате " + coordinates.toString() + "\n";
        if (color != null) result += "Цвет: " + color + "\n";
        if (size != 0) result += "Размер: " + size + "\n";
        return result;
    }       
}
