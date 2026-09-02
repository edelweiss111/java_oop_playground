package models;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;
    
    //конструктор с возможностью произвольного количества оценок
    public Student(String name, int ... grades){
        for (int i=0; i < grades.length; i++){
            if (grades[i] < 2 || grades[i] > 5) throw new IllegalArgumentException("Оценки могут быть в диапазоне от 2 до 5");
        }
    
        this.name = name;
        //Делаем клон массива оценок для обеспечения инкапсуляции
        this.grades = grades.clone();
    }

    //геттер оценок
    public int[] getGrades(){
        return this.grades.clone();
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
