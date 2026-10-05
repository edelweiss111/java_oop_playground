package models;

public class Pistol extends Weapon{
    private final int maxAmmo;
    
    public Pistol(int ammo, int maxAmmo){
        //Нельзя зарядить больше, чем maxAmmo
        super(Math.min(ammo, maxAmmo));
        this.maxAmmo = maxAmmo;
    }

    public Pistol(){
        this(5, 5);
    }

    public Pistol(int maxAmmo){
        this(0, maxAmmo);
    }

    //геттеры
    public int getMaxAmmo(){
        return maxAmmo;
    }

    public int getAmmoCount(){
        return ammo();
    }

    // Пистолет заряжен?
    public boolean isLoaded(){
        return this.ammo() > 0;
    }

    // Разрядить пистолет
    public int unload() {
        int currentAmmo = this.ammo;
        this.ammo = 0;              
        return currentAmmo;
    }

    @Override 
    public void shoot(){
        if (getAmmo()){
            System.out.println("БАХ");
        }
        else System.out.println("КЛАЦ");
    }
}

