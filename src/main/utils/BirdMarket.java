package utils;

import models.Bird;

public class BirdMarket {
    public static void sing(Bird ... birds){
        for (Bird bird : birds){
            if (bird != null){
                bird.sing();
            }
        }
    }   
}
