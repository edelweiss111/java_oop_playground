package tests;

import models.*;

public class HumanTest {
    public static void testHumans(){
        //1.1.2, 1.2.2, 1.2.3 сущности человека

        // Name name1 = new Name(null, "Клеопатра", null);
        // Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        // Name name3 = new Name("Маяковский", "Владимир", null);

        // Name name4 = new Name("Чудов", "Иван", null);
        // Name name5 = new Name("Чудов", "Петр", null);
        // Name name6 = new Name(null, "Борис", null);

        Name name7 = new Name("Пушкин", "Сергей");

        // Human human1 = new Human(name1, 152 );
        // Human human2 = new Human(name2, 167);
        // Human human3 = new Human(name3, 189);

        // Human human4 = new Human(name4, null);
        // Human human5 = new Human(name5, human4);
        // Human human6 = new Human(name6, human5);

        Human human7 = new Human("Лев");
        Human human8 = new Human(name7, human7);
        Human human9 = new Human("Александр", human8);


        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
    }
}
