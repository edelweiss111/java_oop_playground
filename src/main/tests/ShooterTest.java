package tests;

import models.Shooter;
import models.AutomaticRifle;
import models.Pistol;

public class ShooterTest {
    public static void testShooter(){
        Pistol pistol = new Pistol(8, 8);
        AutomaticRifle automaticRifle = new AutomaticRifle(8);

        Shooter shooter1 = new Shooter("Олег");
        Shooter shooter2 = new Shooter("Андрей", pistol);
        Shooter shooter3 = new Shooter("Иван", automaticRifle);

        shooter1.shoot();
        System.out.println("Пистолет");
        shooter2.shoot();
        System.out.println("Автомат");
        shooter3.shoot();
    }
}
