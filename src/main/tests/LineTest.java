package tests;

import models.*;

public class LineTest {
    //Метод для контрольной
    public static void testLines(){
        //Сущности линий
        Point2D A = new Point2D(1, 1);
        Point2D B = new Point2D(10, 15);

        //Инициализация точками
        Line AB = new Line(A, B);
        System.out.println("Первая " + AB.toString());

        //Инициализация координатами
        Line line1 = new Line(3, 5, 25, 6);
        System.out.println("Вторая " + line1.toString());
        
        //Расстояние от начала до конца
        System.out.println("Длина АВ: " + AB.getLength());
        System.out.println("Длина line1: " + line1.getLength());
        
        //Меняем координаты у исходных точек
        A.setX(3);
        B.setY(8);
        System.out.println("Новые координаты А" + A.toString());
        System.out.println("Новые координаты В" + B.toString());
        
        //Выводим координаты нашей прямой (соблюдение инкапсуляции)
        System.out.println("Координаты АВ " + AB);
        
        //Задаем значение начала и конца прямой, но уже точками с измененными координатами
        AB.setStart(A);
        AB.setEnd(B);
        
        //Выводим новые точки начала и конца
        System.out.println("Координаты АВ после изменения через сеттеры");
        System.out.println("Начало " + AB.getStart());
        System.out.println("Конец " + AB.getEnd());
    }
    public static void testLineEquals(){
        Point2D A = new Point2D(1, 1);
        Point2D B = new Point2D(10, 15);
        Point2D C = new Point2D(1, 1);
        Point2D D = new Point2D(10, 15);

        Line AB = new Line(A, B);
        System.out.println("AB " + AB.toString());
        Line BA = new Line(B, A);
        System.out.println("BA " + BA.toString());
        Line CD = new Line(C, D);
        System.out.println("CD " + CD.toString());
        Line line = new Line(3, 5, 25, 6);
        System.out.println("line " + line.toString());

        System.out.println("AB и BA " + AB.equals(BA));
        System.out.println("AB и CD " + AB.equals(CD));
        System.out.println("AB и line " + AB.equals(line));
    }
    public static void testLineClone(){
        Point2D A = new Point2D(1, 1);
        Point2D B = new Point2D(10, 15);

        Line AB = new Line(A, B);
        System.out.println("AB " + AB.toString());

        try{
            Line AB2 = AB.clone();
            System.out.println("Клон АВ " + AB2.toString());

            System.out.println("Меняем координаты точки А (2;2) ");
            A.setX(2);
            A.setY(2);
            AB.setStart(A);

            System.out.println("Новые координаты АВ " + AB.toString());
            System.out.println("Координаты клона " + AB2.toString());
        }catch (CloneNotSupportedException e){System.out.println(e);}
    }
}
