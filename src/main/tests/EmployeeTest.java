package tests;

import models.Department;
import models.Employee;


public class EmployeeTest{
    public static void testEmployee(){
        Department IT = new Department("IT", null);
        Department Buch = new Department("Buch", null);

        Employee petrov = new Employee("Петров", IT);
        Employee kozlov = new Employee("Козлов", IT);
        Employee sidorov = new Employee("Сидоров", IT);

        Buch.setBoss(kozlov);

        IT.setEmployees(new Employee[]{petrov, sidorov});
        

        System.out.println(kozlov.getDepartment().toString());

        IT.setBoss(kozlov);

        System.out.println(kozlov.getDepartment().toString());

    }
}