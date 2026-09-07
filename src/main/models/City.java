package models;

import java.util.Arrays;

public class City {
    private String name;
    private Path[] pathes;

    public City (String name, Path ... pathes){
        this.name = name;
        //Сначала инициализируем пустым массивом
        this.pathes = new Path[0];

        //Используя метод addPath заполняем pathes уникальными путями
        if (pathes != null){
            for (Path path : pathes){
                if (path != null){
                    addPath(path.getCity(), path.getCost());
                }
            }
        }   
    }

    public String getName(){
        return this.name;
    }

    public Path[] getPathes() {
        return this.pathes;
    }

    public void addPath(City cityDest, int cost){
        if (cityDest == null || cityDest == this) return;

        //Преверяем, нет ли уже этого маршрута в pathes
        for (Path path: pathes){
            //Обновляем стоимость
            if (path.getCity() == cityDest) {
                path.setCost(cost);
                return;
            }
        }
        //создаем новый массив из предыдущего, но длиной на 1 больше
        this.pathes = Arrays.copyOf(this.pathes, this.pathes.length + 1);
        //Добавляем новый путь в конец массива
        this.pathes[this.pathes.length - 1] = new Path(cityDest, cost);
    }

    public void removePath(City desCity){
        if(desCity == null) return;

        int index = -1;

        //Ищем индекс дороги на удаление
        for (int i = 0; i < pathes.length; i++){
            if (pathes[i].getCity() == desCity){
                index = i;
                break;
            }
        }
        if (index == -1) return;

        //Задаем размер нового массива путей [1,3,4,5]
        Path[] newPathes = new Path[pathes.length - 1];

        //Копируем в новый массив элементы до удаляемого
        System.arraycopy(pathes, 0, newPathes, 0, index);
        //Копируем в новый массив элементы после удаляемого
        System.arraycopy(pathes, index + 1, newPathes, index, pathes.length - index - 1);

        this.pathes = newPathes;
    }

    @Override
    public String toString(){
        return "%s, соседи: %s".formatted(name, Arrays.toString(pathes));
    }
}
