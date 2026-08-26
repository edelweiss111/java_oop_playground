package models;

public class Path {

    private City cityDest;
    private int cost;

    public Path(City cityDest, int cost){
        this.cityDest = cityDest;
        this.cost = cost;
    }

    public City getCity(){
        return this.cityDest;
    }
    
    public int getCost(){
        return this.cost;
    }

    @Override
    public String toString(){
        return "%s: %d".formatted(cityDest.getName(), cost);
    }



    
}
