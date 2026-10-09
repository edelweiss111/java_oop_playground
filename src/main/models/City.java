package models;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public int hashCode(){
        if (pathes == null || pathes.length == 0) return 0;
        //проходимся циклом по массиву путей и сохраняем hash каждого пути в result
        int result = 0;
        for(Path path : pathes){
            result += Objects.hashCode(path);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        //instanceof позволяет сравнивать потомков (ReturnCity)
        if(!(obj instanceof City otherCity)) return false;
        //Если длины массивов не совпадают - false
        if (pathes.length != otherCity.pathes.length) return false;
        //идем циклом по исходному списку путей
        for(Path p1 : pathes){
            //Флаг - нашлось ли совпадение;
            boolean match = false;
            //проходимся циклом по сравниваемому списку путей, если находим совпадение меняем флаг на true и переходим к следующей итеррации
            for (Path p2 : otherCity.pathes){
                if (Objects.equals(p1, p2)){
                    match = true;
                    break;
                }
            }
            //Если не нашлось совпадения - false
            if (!match) return false;
        }
        return true;
    }
}
