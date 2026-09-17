package models;
import java.util.concurrent.ThreadLocalRandom;

public class Cuckoo extends Bird{
    public Cuckoo(String name){
        super(name);
    }

    @Override 
    public void sing(){
        int count = ThreadLocalRandom.current().nextInt(1, 11);

        for (int i=0; i<count; i++){
            System.out.println("ку-ку");
        }
    }
}
