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

    @Override
    public String toString(){
        return "%s %s".formatted(name, Arrays.toString(grades));
    }
}
