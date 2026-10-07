package tests;

import models.*;

public class LineTest {
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
}
