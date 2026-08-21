package models;

public class Department {
    
    private String name;
    private Employee boss;

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

    //сеттер начальника
    public void setBoss(Employee boss){
        this.boss = boss;
    }
}
