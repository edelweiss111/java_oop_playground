package tests;

import models.Cuckoo;
import models.Parrot;
import models.Sparrow;
import utils.BirdMarket;

public class BirdMarketTest {
    public static void testBirdMarket(){
        Parrot parrot1 = new Parrot("Кеша", "Меня зовут Кеша");
        Parrot parrot2 = new Parrot("Гоша", "Меня зовут Гоша");

        Sparrow sparrow1 = new Sparrow("Биба");
        Sparrow sparrow2 = new Sparrow("Боба");

        Cuckoo cuckoo1 = new Cuckoo("Клава");
        Cuckoo cuckoo2 = new Cuckoo("Маша");

        BirdMarket.sing(parrot1, parrot2, sparrow1, sparrow2, cuckoo1, cuckoo2);
    }
    
}
