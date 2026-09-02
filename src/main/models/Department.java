package models;

public class Department {
    
    private String name;
    private Employee boss;
    private Employee[] employees;

    public Department(String name, Employee boss){
        this.name = name;
        setBoss(boss);
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
        //Меняем отдел у начальника, если он не совпадает с текущим
        if(boss != null && boss.getDepartment() != this) boss.setDepartment(this);
    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }

    @Override
    public String toString(){
        return "Отдел %s, начальник %s".formatted(name, boss);
    }
}
