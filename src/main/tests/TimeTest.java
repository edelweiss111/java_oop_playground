package tests;

import models.Time;

public class TimeTest {
    public static void testTimes(){
    //1.1.4 сущности времени

    Time time1 = new Time(10);
    Time time2 = new Time(10000);
    Time time3 = new Time(100000);

    System.out.println(time1.toString());
    System.out.println(time2.toString());
    System.out.println(time3.toString());
    }
}
