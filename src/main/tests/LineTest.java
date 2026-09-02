package tests;

import models.*;

public class LineTest {
        public static void testLines(){
        //1.2.1 сущности линий
        Point A = new Point(1, 1);
        Point B = new Point(10, 15);
        Point C = new Point(5, 10);
        Point D = new Point(10, 10);

        Line AB = new Line(A, B);
        Line line1 = new Line(A, B);
        // Line CD = new Line(C, D);
        // Line AD = new Line(A, D);

        // //Инициализация координатами
        // Line line4 = new Line(3, 5, 25, 6);

        System.out.println(AB.getStart().toString());
        System.out.println(AB.getEnd().toString());
        System.out.println(line1.getStart().toString());
        System.out.println(line1.getEnd().toString());
        
        AB.setStart(C);
        AB.setEnd(D);

        System.out.println(AB.getStart().toString());
        System.out.println(AB.getEnd().toString());
        System.out.println(line1.getStart().toString());
        System.out.println(line1.getEnd().toString());
        // System.out.println(CD.toString());
        // System.out.println(AD.toString());
        // System.out.println(line4.toString());
        // System.out.println(AB.getLength());

    }
}
