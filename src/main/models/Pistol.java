package models;

public class Pistol {
    private int cartridges;

    public Pistol(int cartridges){
        this.cartridges = cartridges;
    }

    public Pistol(){
        this(5);
    }

    public String shoot(){
        if (cartridges > 0){
            this.cartridges -= 1;
            return "Бах";
        }

        else return "Клац";
    }
}
