package tests;

import models.Point3D;

public class Point3DTest {
    public static void TestPoint3D(){
        Point3D A = new Point3D(1, 2, 3);
        System.out.println(A);
     }

    public static void TestPointEquals(){
        Point3D A = new Point3D(1, 2, 3);
        Point3D B = new Point3D(1, 1, 1);
        Point3D C = new Point3D(1, 2, 3);

        System.out.println(A.toString() + B.toString());
        System.out.println(A.equals(B));

        System.out.println(A.toString() + C.toString());
        System.out.println(A.equals(C));
    }
}
