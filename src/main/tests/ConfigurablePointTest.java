package tests;
import models.*;

public class ConfigurablePointTest {
    public static void TestConfigurablePoint(){
        Point point1d = new Point(3);

        Point2D point2d = new Point2D(7, 7);

        Point3D point3d = new Point3D(4, 2, 5);

        ConfigurablePoint point1 = new ConfigurablePoint(point1d, "Красный");

        ConfigurablePoint point2 = new ConfigurablePoint(point2d, "Желтый", 10);

        ConfigurablePoint point3 = new ConfigurablePoint(point3d, 20);

        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println(point3.toString());
    }
}
