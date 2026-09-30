package tests;

import java.util.Arrays;
import models.Student;
import utils.BinaryGradeRule;
import utils.EvenGradeRule;

public class StudentTest {
    public static void testStudent(){
        Student vasya = new Student("Вася", new BinaryGradeRule(), 1,0,1,1);
        System.out.println(vasya);

        Student petya = new Student("Петя", new EvenGradeRule(), 2, 4, 6, 8);
        System.out.println(petya);

        vasya.addGrade(3);
        petya.addGrade(3);
        // Student maksim = new Student("Максим");
        // Student petya = new Student("Петя", grades );

        // System.out.println(vasya.getMiddleGrade());
        // System.out.println(vasya.isExcellent());

        // System.out.println(petya.getMiddleGrade());
        // System.out.println(petya.isExcellent());

        System.out.println(Arrays.toString(vasya.getGrades()));
    }
}
