package tests;

import models.Name;

public class NameTest {
    public static void testNames(){
    
    //1.1.3. сущности имён
    Name name1 = new Name("Клеопатра");
    Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
    Name name3 = new Name("Маяковский", "Владимир");

    System.out.println(name1.toString());
    System.out.println(name2.toString());
    System.out.println(name3.toString());
    }
}
