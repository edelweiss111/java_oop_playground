package models;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public Shooter(String name){
        this(name, null);
    }
    
    //геттеры
    public String getName(){
        return name;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    //сеттеры
    public void setName(String name){
        this.name = name;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public void shoot(){
        if (weapon != null) weapon.shoot();
        else System.out.println("Не могу участвовать в перестрелке");
    }
}
