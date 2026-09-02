package models;

public class Pistol {
    private int cartridges;
    private final int maxCartridges;

    public Pistol(int cartridges, int maxCartridges){
        this.maxCartridges = maxCartridges;
        //Используем метод reload для зарядки пистолета, там уже прописана валидация
        reload(cartridges);
    }

    public Pistol(){
        this(5, 5);
    }

    public Pistol(int maxCartidges){
        this(0, maxCartidges);
    }

    //геттеры
    public int getMaxCartridges(){
        return maxCartridges;
    }

    public int getCartridges(){
        return this.cartridges;
    }

    //Пистолет заряжен?
    public boolean isLoaded(){
        return this.cartridges > 0;
    }

    //Метод для перезарядки патронов
    public int reload(int cartridges){
        if (cartridges < 0) throw new IllegalArgumentException("Количество патронов не может быть меньше 0");

        if (this.cartridges + cartridges > maxCartridges){
            int spase = maxCartridges - this.cartridges;
            this.cartridges = maxCartridges;
            return cartridges - spase;
        }

        this.cartridges += cartridges;
        return 0;
    }

    //Разрядить пистолет
    public int unload(){
        int result = this.cartridges;
        this.cartridges = 0;
        return result;
    }

    public void shoot(){
        if (cartridges > 0){
            this.cartridges -= 1;
            System.out.println("БАХ");
        }

        else System.out.println("КЛАЦ");
    }
}
