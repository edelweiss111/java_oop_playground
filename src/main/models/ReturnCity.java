package models;


public class ReturnCity extends City{
    //Вызываем конструктор родителя через super
    public ReturnCity(String name, Path ... pathes){
        super(name, pathes);
    }

    @Override
    public void addPath(City cityDest, int cost){
        super.addPath(cityDest, cost);

        if (cityDest == null || cityDest == this) return;

        Path[] returnPathes = cityDest.getPathes();

        //проверяем, нет ли у города назначение обратного пути
        for (Path path : returnPathes){
            if (path.getCity() == this) return;
        }

        //добавляем обратную дорогу в город назначения
        cityDest.addPath(this, cost);
    }
}
