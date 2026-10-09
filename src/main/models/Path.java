package models;

import java.util.Objects;

public class Path {

    private City cityDest;
    private int cost;

    public Path(City cityDest, int cost){
        this.cityDest = cityDest;
        this.cost = cost;
    }

    //геттеры
    public City getCity(){
        return this.cityDest;
    }
    
    public int getCost(){
        return this.cost;
    }

    //сеттер
    public void setCost(int cost){
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "%s: %d".formatted(cityDest.getName(), cost);
    }

    @Override
    public int hashCode(){
        //Если есть город назначения, берем его имя, иначе null
        String cityName = (cityDest != null) ? cityDest.getName() : null;
        //За основу для hash берем имя города и стоимость пути
        return Objects.hash(cityName, cost);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Path path = (Path) obj;
        if (this.cost != path.cost) return false;
        //Если у обоих path поле dest - null, они равны, т.к. cost мы проверили выше
        if (cityDest == null && path.cityDest == null) return true;
        //Если только один dest - null, будет false
        if (cityDest == null || path.cityDest == null) return false;
        //Проверяем только name, т.к. cost уже равны
        return Objects.equals(cityDest.getName(), path.cityDest.getName());
    }
}
