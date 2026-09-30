package tests;
import models.Cat;
import models.ToyCat;
import utils.MeowUtils;

public class MeowUtilsTest {
    public static void testMeowUtils(){
        Cat cat = new Cat("Барсик");
        ToyCat toyCat = new ToyCat("Мурзик");

        MeowUtils.meow(cat, toyCat);
    }
}
