package LibraryManagementSystem;

import java.util.ArrayList;

public class EmployeeDetails {
    private int employeeId;
    private String name;
    private int age;
    private String position;
    private double salary;

    @Override // without this the output will be =
              // LibraryManagementSystem.EmployeeDetai1s@2d98a335
              // for View Employee method
    public String toString() {
        return "Name: " + this.name +
                "\n" + "Age: " + this.age +
                "\n" + "Position: " + this.position +
                "\n" + "Salary: " + this.salary;
                
    }

    public EmployeeDetails(int employeeId, String name, int age, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

}
