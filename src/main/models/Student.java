package models;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;
    
    //конструктор с возможностью произвольного количества оценок
    public Student(String name, int ... grades){
        this.name = name;
        this.grades = grades;
    }

    //геттер оценок
    public int[] getGrades(){
        return this.grades;
    }

    //Подсчет средней оценки
    public double getMiddleGrade(){
        if (grades == null || grades.length == 0) return 0;

        double sum = 0;
        for (int grade: grades){
            sum += grade;
        }

        return sum/grades.length;
    }

    //Проверка на отличника
    public boolean isExcellent(){
        if (grades == null || grades.length == 0) return false;

        for (int grade: grades){
            if (grade != 5) return false;
        }

        return true;
    }

    @Override
    public String toString(){
        return "%s %s".formatted(name, Arrays.toString(grades));
    }
}
