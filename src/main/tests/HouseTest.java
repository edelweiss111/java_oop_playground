package tests;

import models.House;

public class HouseTest {
    
    public static void testHouses(){
    //1.1.5 сущности домов
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);

        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString());
    }  
}
