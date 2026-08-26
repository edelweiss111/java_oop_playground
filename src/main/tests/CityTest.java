package tests;

import models.*;

public class CityTest {
    public static void testCityes(){
        //Создаем сущности городов
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        //Создаем сущности путей
        Path AB = new Path(B, 5);
        Path BA = new Path(A, 5);
        Path BC = new Path(C, 3);
        Path CB = new Path(B, 3);
        Path DC = new Path(C, 4);
        Path CD = new Path(D, 4);
        Path AD = new Path(D, 6);
        Path DA = new Path(A, 6);
        Path AF = new Path(F, 1);
        Path FB = new Path(B, 1);
        Path FE = new Path(E, 2);
        Path EF = new Path(F, 2);
        Path DE = new Path(E, 2);

        //Создаем массивы путей для каждого города
        Path[] A_pathes = new Path[]{AB, AF, AD};
        Path[] B_pathes = new Path[]{BA, BC};
        Path[] C_pathes = new Path[]{CB, CD};
        Path[] D_pathes = new Path[]{DC, DE, DA};
        Path[] E_pathes = new Path[]{EF};
        Path[] F_pathes = new Path[]{FE, FB};

        //Вносим пути в поля городов
        A.setPath(A_pathes);
        B.setPath(B_pathes);
        C.setPath(C_pathes);
        D.setPath(D_pathes);
        E.setPath(E_pathes);
        F.setPath(F_pathes);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println(D.toString());
        System.out.println(E.toString());
        System.out.println(F.toString());
    }
}
