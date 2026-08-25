package models;

import java.util.Arrays;

public class City {
    private String name;
    private Path[] pathes;

    public City (String name, Path[] pathes){
        this.name = name;
        this.pathes = pathes;
    }

    public String getName(){
        return this.name;
    }

    public void setPath(Path[] paths){
        this.pathes = paths;
    }

    @Override
    public String toString(){
        return "%s, соседи: %s".formatted(name, Arrays.toString(pathes));
    }
}
