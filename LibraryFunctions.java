package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryFunctions {
   
    boolean found = false;
    ArrayList<EmployeeDetails> emps = new ArrayList<EmployeeDetails>();
    Scanner sc = new Scanner(System.in);
    

    // for adding employeee
    public void addEmployee(int employeeId,String name, int age, String position, double salary) {
        EmployeeDetails employee = new EmployeeDetails(employeeId, name,age,position,salary);
        emps.add(employee);
    }

    // for viewing the employee using their id's
    public void viewEmployee(){
        System.out.print("Enter Employee's id: ");
        int id = sc.nextInt();
        for(EmployeeDetails emps : emps){
            if(emps.getEmployeeId() == id){
                System.out.println(emps);
                found = true;
            }
        }
        
    }



}
