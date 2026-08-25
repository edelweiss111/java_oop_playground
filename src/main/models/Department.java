package models;

public class Department {
    
    private String name;
    private Employee boss;
    private Employee[] employees;

    public Department(String name, Employee boss){
        this.name = name;
        this.boss = boss;
    }

    //Геттеры
    public String getName(){
        return this.name;
    }
    
    public Employee getBoss(){
        return this.boss;
    }

    public Employee[] getEmployees(){
        return this.employees;
    }

    //сеттеры
    public void setBoss(Employee boss){
        this.boss = boss;
    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }
}
