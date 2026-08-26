package tests;

import models.Pistol;


public class PistolTest {
    public static void testPistol(){
        Pistol gun = new Pistol(3);

        System.out.println(gun.shoot());
        System.out.println(gun.shoot());
        System.out.println(gun.shoot());
        System.out.println(gun.shoot());
        System.out.println(gun.shoot());
    }
    
}
