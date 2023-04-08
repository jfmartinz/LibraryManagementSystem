package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LibraryFunctions {

    private boolean found = false;
    private int id;
    ArrayList<EmployeeDetails> emps = new ArrayList<EmployeeDetails>();
    Scanner sc = new Scanner(System.in);

    // for adding employeee
    public void addEmployee(int employeeId, String name, int age, String position, double salary) {
        EmployeeDetails employee = new EmployeeDetails(employeeId, name, age, position, salary);
        emps.add(employee);
    }

    // for viewing the employee using their id's
    public void searchEmployee() {
        System.out.print("Enter Employee's id: ");
        id = sc.nextInt();
        for (EmployeeDetails emps : emps) {
            if (emps.getEmployeeId() == id) {
                System.out.println(emps);
                found = true;
            }
        }
        if (!found) { // if the id does not exist then it will display the message below.
            System.out.println("**Employee with an id of " + id + " does not exist!**");
            System.out.println("---------------------");
        }

    }

    // for updating the employee
    public void updateEmployee() {
        System.out.print("Enter Employee's id: ");
        id = sc.nextInt();

        for (EmployeeDetails emps : emps) {
            if (emps.getEmployeeId() == id) {
                System.out.println(emps); // display the old information of the employee
                System.out.println("---------------------");

                System.out.print("*Update your name: ");
                String newName = sc.next();
                System.out.print("*Update your age: ");
                int newAge = sc.nextInt();
                System.out.print("*Update your position: ");
                String newPosition = sc.nextLine();
                sc.nextLine();
                System.out.print("*Update the salary: ");
                double newSalary = sc.nextDouble();

                // set the new or updated information of the employee
                emps.setName(newName);
                emps.setAge(newAge);
                emps.setPosition(newPosition);
                emps.setSalary(newSalary);

                System.out.println("**Here are the updated information of the employee with an id of " + id + "**");
                System.out.println(emps);
                found = true;
            }
        }
        if (!found) { // if the id does not exist then it will display the message below.
            System.out.println("**Employee with an id of " + id + " does not exist!**");
            System.out.println("---------------------");
        }

    }

    // for deleting the employees
    public void delEmployee() {
        System.out.print("Enter Employee's id: ");
        id = sc.nextInt();
        Iterator<EmployeeDetails> it = emps.iterator();
        while (it.hasNext()) {
            EmployeeDetails emps = it.next();
            if (emps.getEmployeeId() == id) {
                it.remove();
                System.out.println("**Employee with an id of " + id + " has been removed**");
                System.out.println("---------------------");
                return;
            }
        }
        System.out.println("**Employee with id " + id + " doesn't exist!**");
        System.out.println("---------------------");
    }

    // display all the employees

    public void displayEmployee() {
        for (EmployeeDetails emps : emps) {
            System.out.println(emps);
        }
    }
}