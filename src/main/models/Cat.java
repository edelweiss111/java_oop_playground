package models;

public class Cat implements Meowable{
    private String name;

    public Cat(String name){
        this.name = name;
    }
    
    public void meow(int n){
        if (n <= 0) return;

        String repeated = "мяу-".repeat(n);

        String result = repeated.substring(0, repeated.length()-1);

        System.out.println("%s: %s!".formatted(name, result));
    }

    @Override 
    public void meow(){
        meow(1);
    }

    @Override
    public String toString(){
        return "Кот:" + name;
    }
}
