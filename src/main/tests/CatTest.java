package tests;

import models.Cat;

public class CatTest {
    public static void TestCats(){
        Cat barsik = new Cat("Барсик");

        System.out.println(barsik.toString());

        barsik.meow();
        barsik.meow(3);
    }
}
