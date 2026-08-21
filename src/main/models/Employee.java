package models;

public class Employee {

    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return this.name;
    }

    public Department getDepartment(){
        return this.department;
    }

    @Override
    public String toString(){
        if (department == null) return "Сотрудник %s".formatted(name);

        else if (department.getBoss() != null && department.getName() == null) return "Сотрудник %s, руководитель %s".formatted(name, department.getBoss().getName());

        else if (department.getName() != null && department.getBoss() == null) return "%s работает в отделе %s".formatted(name, department.getName());

        else if (department.getBoss() != null && department.getBoss() == this) return "%s начальник отдела %s".formatted(name, department.getName());

        else return "%s работает в отделе %s, начальник которого %s".formatted(name, department.getName(), department.getBoss().getName());
    }
    
}
