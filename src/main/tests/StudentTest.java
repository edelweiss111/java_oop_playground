package tests;

import models.Student;

public class StudentTest {
    public static void testStudent(){
        // int[] grades = {3, 4, 5};

        Student vasya = new Student("Вася", 3, 4, 5);
        Student maksim = new Student("Максим");

        // //Меняем первую оценку у Пети
        // petya.getGrades()[0] = 5;

        // System.out.println(vasya.toString());
        // System.out.println(petya.toString());

        // Student andrey = new Student("Андрей", vasya.getGrades().clone());

        // //Меняем оценку у Васи
        // vasya.getGrades()[1] = 3;

        System.out.println(vasya.toString());

        System.out.println(maksim.toString());
    }
}
