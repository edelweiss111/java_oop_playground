package house;

public class House {

    private int n;

    public House(int n){
        this.n = n;
    }

    @Override
    public String toString(){
        
        String ending;

        if (n%100==11) ending = "этажами";

        else if (n%10==1) ending = "этажом";

        else ending = "этажами";

        return "Дом с %d %s".formatted(n, ending);
    }
}
