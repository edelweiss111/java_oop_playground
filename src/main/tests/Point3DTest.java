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

    public static void TestPointClone(){
        Point3D point1 = new Point3D(1, 0, 4);
        
        try{
            Point3D point2 = point1.clone();
            System.out.println("Точка 1 " + point1.toString());
            System.out.println("Точка 2 (ее клон) " + point2.toString());
        }catch (CloneNotSupportedException e){System.out.println(e);}   
    }
}
