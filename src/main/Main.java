import models.*;
public class Main {
    public static void main(String[] args) {

        testPoints();
        testHumans();
        testNames();
        testTimes();
        testHouses();
        testLines();

    }   

    public static void testPoints(){
        //1.1.1 сущности точки

        Point A = new Point(10, 20);
        Point B = new Point(-10, 13);
        Point C = new Point(0, -9);

        System.out.println("A = " + A.toString());
        System.out.println("B = " + B.toString());
        System.out.println("C = " + C.toString());

    }

    public static void testHumans(){
        //1.1.2 сущности человека

        Human human1 = new Human("Клеопатра", 152 );
        Human human2 = new Human("Пушкин", 167);
        Human human3 = new Human("Александр", 189);

        System.out.println("Человек с именем " + human1.toString() );
        System.out.println("Человек с именем " + human2.toString() );
        System.out.println("Человек с именем " + human3.toString() );
        
    }

    public static void testNames(){
        //1.1.3. сущности имён

        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println(name1.toString());
        System.out.println(name2.toString());

        System.out.println(name3.toString());
    }

    public static void testTimes(){
        //1.1.4 сущности времени

        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());

    }

    public static void testHouses(){
        //1.1.5 сущности домов
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);

        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString());

    }

    public static void testLines(){
        //1.2.1 сущности линий
        Point A = new Point(3, 3);
        Point B = new Point(13, 8);
        Point C = new Point(5, 10);
        Point D = new Point(10, 10);

        Line AB = new Line(A, B);
        Line CD = new Line(C, D);
        Line AD = new Line(A, D);

        System.out.println(AB.toString());
        System.out.println(CD.toString());
        System.out.println(AD.toString());

    }
}