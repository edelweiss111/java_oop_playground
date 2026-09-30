package models;

public class ToyCat implements Meowable{
    private String name;

    public ToyCat(String name){
        this.name = name;
    }

    @Override 
    public void meow(){
        System.out.println("Мяу, я игрушка " + name);
    } 
}
