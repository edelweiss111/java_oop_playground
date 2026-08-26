package tests;

import models.Pistol;


public class PistolTest {
    public static void testPistol(){
        Pistol gun = new Pistol(3);

        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
    }
    
}
