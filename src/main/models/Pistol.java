package models;

public class Pistol {
    private int cartridges;

    public Pistol(int cartridges){
        this.cartridges = cartridges;
    }

    public Pistol(){
        this(5);
    }

    public void shoot(){
        if (cartridges > 0){
            this.cartridges -= 1;
            System.out.println("БАХ");
        }

        else System.out.println("КЛАЦ");
    }
}
