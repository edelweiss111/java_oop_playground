package tests;

import models.City;
import models.ReturnCity;

public class ReturnCityTest {
    public static void testReturnCity(){
        
        City A = new ReturnCity("A");
        City B = new ReturnCity("B");

        A.addPath(B, 5);

        System.out.println(A.toString());
        System.out.println(B.toString());
    }
}
