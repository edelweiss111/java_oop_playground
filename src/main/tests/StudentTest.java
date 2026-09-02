package tests;

import java.util.Arrays;
import models.Student;

public class StudentTest {
    public static void testStudent(){
        int[] grades = {5, 5, 5, 5};

        Student vasya = new Student("Вася", 2, 4, 5, 4);
        // Student maksim = new Student("Максим");
        // Student petya = new Student("Петя", grades );

        // System.out.println(vasya.getMiddleGrade());
        // System.out.println(vasya.isExcellent());

        // System.out.println(petya.getMiddleGrade());
        // System.out.println(petya.isExcellent());

        System.out.println(Arrays.toString(vasya.getGrades()));
    }
}
