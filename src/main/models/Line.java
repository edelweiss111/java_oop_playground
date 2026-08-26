package models;

public class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public int getLength(){
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
}
