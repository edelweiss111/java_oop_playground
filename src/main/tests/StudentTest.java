package tests;

import models.Student;

public class StudentTest {
    public static void testStudent(){
        int[] grades = {5, 5, 5, 5};

        Student vasya = new Student("Вася", 3, 4, 5, 4);
        // Student maksim = new Student("Максим");
        Student petya = new Student("Петя", grades );

        // //Меняем первую оценку у Пети
        // petya.getGrades()[0] = 5;

        // System.out.println(vasya.toString());
        // System.out.println(petya.toString());

        // Student andrey = new Student("Андрей", vasya.getGrades().clone());

        // //Меняем оценку у Васи
        // vasya.getGrades()[1] = 3;

        System.out.println(vasya.getMiddleGrade());
        System.out.println(vasya.isExcellent());

        System.out.println(petya.getMiddleGrade());
        System.out.println(petya.isExcellent());
    }
}
