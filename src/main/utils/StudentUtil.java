package utils;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import exceptions.InvalidGradeException;
import models.Student;

public class StudentUtil {
    public static String addGrades(Student ... students){
        //список студентов у которых уже внесены изменения
        List<Student> editedStudents = new ArrayList<>();

        for (Student student : students){
            try{
                int grade = ThreadLocalRandom.current().nextInt(1, 11);
                student.addGrade(grade);
                editedStudents.add(student);
            }catch(InvalidGradeException e){
                //затираем добавленные оценки у всех студентов
                for(Student editedStudent : editedStudents){
                    editedStudent.removeLastGrade();
                }
                return e.getMessage();
            }
        }
        return "Добавление оценок прошло успешно";
    }
    
    public static List<Student> convert(List<String> constructorArgs, List<String> addArgs){
        List<Student> result = new ArrayList<>();

        if (constructorArgs == null) return result;

        for (String name : constructorArgs){
  
            // Проверка для вызова ошибки конструктора (если имя пустое или null)
            if (name == null || name.isBlank()) throw new IllegalArgumentException("Передано пустое имя");

            //Создаем студента с дефолтным правилом оценок (от 2 до 5)
            Student student = new Student(name, new DefaultGradeRule());

            //Если массив оценок не пустой
            if (addArgs != null && !addArgs.isEmpty()){
                //Переводим каждую оценку в int и добавляем ее к студенту
                for (String gradeStr : addArgs){
                    int grade = Integer.parseInt(gradeStr);
                    student.addGrade(grade);
                }
            }
            //Добавляем студента в результирующий список
            result.add(student);
        }
        return result;
    }
}
