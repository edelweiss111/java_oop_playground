package tests;

import models.Department;
import models.Employee;


public class EmployeeTest{
    public static void testEmployee(){
        Department IT = new Department("IT", null);

        Employee petrov = new Employee("Петров", IT);
        Employee kozlov = new Employee("Козлов", IT);
        Employee sidorov = new Employee("Сидоров", IT);

        IT.setEmployees(new Employee[]{petrov, kozlov, sidorov});
        IT.setBoss(kozlov);

        // System.out.println(petrov);
        // System.out.println(kozlov);
        // System.out.println(sidorov);

        System.out.println(sidorov.getDepartmenEmployees());
    }
}