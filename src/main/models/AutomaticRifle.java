package models;

public class AutomaticRifle extends Pistol {
    private final int fireRate;

    public AutomaticRifle(int cartridges, int maxCartridges, int fireRate){
        super(cartridges, maxCartridges);
        
        if (fireRate <= 0) throw new IllegalArgumentException("Скорострельность не может быть меньше 0");

        this.fireRate = fireRate;
    }

    public AutomaticRifle(){
        this(30, 30, 30);
    }

    public AutomaticRifle(int maxCartidges){
        this(maxCartidges, maxCartidges, maxCartidges/2);
    }

    //Переопределение метода одиночного выстрела
    @Override
    public void shoot(){
        shootForSeconds(1);
    }

    //Выстрелы за заданное количество секунд
    public void shootForSeconds(int seconds){
        int shots = fireRate * seconds;

        for (int i = 0; i < shots; i++){
            super.shoot();
        }
    }
}
