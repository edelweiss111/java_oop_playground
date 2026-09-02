package models;

public class House {

    private final int floors;

    public House(int floors){
        if (floors <= 0) throw new IllegalArgumentException("Количество этажей не может быть меньше либо равным 0");
        this.floors = floors;
    }

    @Override
    public String toString(){
        
        String ending;

        if (floors%100==11) ending = "этажами";

        else if (floors%10==1) ending = "этажом";

        else ending = "этажами";

        return "Дом с %d %s".formatted(floors, ending);
    }
}
