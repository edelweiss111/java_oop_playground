package models;

public class Department {
    
    private String name;
    Employee boss;
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
        if (boss == null) {
            this.boss = null;
            return;
        }

        // Если назначаемый начальник работает в другом отделе, переводим его в текущий отдел
        if (boss.getDepartment() != this) {
            boss.setDepartment(this);
        }
        this.boss = boss;
    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }

    @Override
    public String toString(){
        return "Отдел %s, начальник %s".formatted(name, boss);
    }
}
