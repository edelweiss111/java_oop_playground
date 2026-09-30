package models;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades = new int[0];
    private GradeRule rule;
    
    //конструктор с правилом для оценок
    public Student(String name, GradeRule rule, int ... grades){
        this.name = name;
        this.rule = rule;

        if (grades != null){
            for (int grade: grades){
                addGrade(grade);
            }
        } 
    }

    //Конструктор без правила обработки оценок
    public Student(String name, int ... grades){
        this(name, null, grades);
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

    public void addGrade(int grade){
        if(rule == null || rule.isValid(grade)){
            //инициализируем новый массив длиной +1
            int[] newGrades = new int[this.grades.length + 1];
            //копируем старый массив в новый
            System.arraycopy(this.grades, 0, newGrades, 0, this.grades.length);
            //добавляем новую оценку
            newGrades[newGrades.length - 1] = grade;
            //обновляем текущее поле
            this.grades = newGrades;
        }
        else throw new IllegalArgumentException("Некорректная оценка: " + grade);
    }

    @Override
    public String toString(){
        return "%s %s".formatted(name, Arrays.toString(grades));
    }
}
