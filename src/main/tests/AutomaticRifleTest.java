package tests;
import models.AutomaticRifle;

public class AutomaticRifleTest {
    public static void TestAutomaticRifle(){
        AutomaticRifle rifle = new AutomaticRifle(10);

        rifle.shoot();
        System.out.println("Стреляем 2 секунды");
        rifle.shootForSeconds(2);
    }
}
