import point.Point;

import human.Human;
import name.Name;
import time.Time;

public class Main {
    public static void main(String[] args) {


        //1.1.1 сущности точки
        Point A = new Point(10, 20);
        Point B = new Point(-10, 13);
        Point C = new Point(0, -9);

        System.out.println("A = " + A.toString());
        System.out.println("B = " + B.toString());
        System.out.println("C = " + C.toString());


        //1.1.2 сущности человека
        Human human1 = new Human("Клеопатра", 152 );
        Human human2 = new Human("Пушкин", 167);
        Human human3 = new Human("Александр", 189);

        System.out.println("Человек с именем " + human1.toString() );
        System.out.println("Человек с именем " + human2.toString() );
        System.out.println("Человек с именем " + human3.toString() );
        
        //1.1.3. сущности имён
        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name3.toString());

        //1.1.4 сущности времени
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());

    }
}