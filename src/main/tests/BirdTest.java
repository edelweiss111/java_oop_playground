package tests;
import models.*;

public class BirdTest {
    public static void TestBird(){

        Cuckoo cuckoo = new Cuckoo("Кукушка");
        cuckoo.sing();

        Parrot parrot = new Parrot("Попугай", "Я попугай Кеша");
        parrot.sing();

        Sparrow sparrow = new Sparrow("Воробей");
        sparrow.sing();
    }
    
}
