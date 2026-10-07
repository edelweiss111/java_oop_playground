package tests;

import java.util.Arrays;
import java.util.List;

import exceptions.InvalidGradeException;
import models.Student;
import utils.BinaryGradeRule;
import utils.EvenGradeRule;
import utils.StudentUtil;

public class StudentTest {
    public static void testStudent(){
        Student vasya = new Student("Вася", new BinaryGradeRule(), 1,0,1,1);

        Student petya = new Student("Петя", new EvenGradeRule(), 2, 4, 6, 8);

        Student oleg = new Student("Олег",4, 4, 5, 3);

        Student denis = new Student("Денис",1, 2, 5, 3);

        Student vadim = new Student("Вадим",4, 7, 1, 8);


        System.out.println(StudentUtil.addGrades(vasya, petya, oleg));
        System.out.println(StudentUtil.addGrades(denis, vadim, oleg));
    }

    public static void testStudentUtil(){
        List<String> names1 = List.of("Иван", "Олег");
        List<String> names2 = List.of("", "Олег");
        List<String> grades1 = List.of("2", "3", "5", "10");
        List<String> grades2 = List.of("2", "3", "5");
 
        //Ошибка в оценке
        System.out.println("1 тест");
        try{
            List<Student> students = StudentUtil.convert(names1, grades1);
            System.out.println(students);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }catch (InvalidGradeException e){
            List<Student> recoveredStudents = StudentUtil.convert((names1), List.of());
            System.out.println("Произошла ошибка в оценках. Студенты созданы без них"); 
            System.out.println(recoveredStudents);
        }

        //Ошибка студента 
        System.out.println("2 тест");
        try{
            List<Student> students = StudentUtil.convert(names2, grades2);
            System.out.println(students);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }catch (InvalidGradeException e){
            List<Student> recoveredStudents = StudentUtil.convert((names2), List.of());
            System.out.println("Произошла ошибка в оценках. Студенты созданы без них"); 
            System.out.println(recoveredStudents);
        }

        //Все ок
        System.out.println("3 тест");
        try{
            List<Student> students = StudentUtil.convert(names1, grades2);
            System.out.println(students);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }catch (InvalidGradeException e){
            List<Student> recoveredStudents = StudentUtil.convert((names1), List.of());
            System.out.println("Произошла ошибка в оценках. Студенты созданы без них"); 
            System.out.println(recoveredStudents);
        }


    }
}
