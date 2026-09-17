package tests;

import models.Pistol;


public class PistolTest {
    public static void testPistol(){
        Pistol gun = new Pistol(7);

        gun.load(3);
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.load(8);
        gun.shoot();
        gun.shoot();
        gun.unload();
        gun.shoot();
    }
    
}
