package models;

public class Path {

    private City city_dest;
    private int cost;

    public Path(City city_dest, int cost){
        this.city_dest = city_dest;
        this.cost = cost;
    }

    public City getCity(){
        return this.city_dest;
    }
    
    public int getCost(){
        return this.cost;
    }

    @Override
    public String toString(){
        return "%s: %d".formatted(city_dest.getName(), cost);
    }



    
}
