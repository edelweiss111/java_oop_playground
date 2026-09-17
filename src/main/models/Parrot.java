package models;

import java.util.concurrent.ThreadLocalRandom;

public class Parrot extends Bird{

    private String text;

    public Parrot(String name, String text){
        super(name);
        this.text = text;
    }

    @Override 
    public void sing(){
        int count = ThreadLocalRandom.current().nextInt(1, text.length()+1);

        System.out.println(text.substring(0, count));
    }
}
