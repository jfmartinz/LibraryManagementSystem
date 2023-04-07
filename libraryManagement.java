package LibraryManagementSystem;

import java.util.Scanner;

public class libraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

     
        boolean quit = false;

        while(!quit){
            switch(choice){

                case 1:
                break;
    
                case 2:
                break;
    
                case 3:
                break;
    
                case 4:
                break;
    
                case 5:
                break;
    
                case 6:
                quit = true;
                System.out.println("Thank you for using our program!!");
                break;
            }

        }
       

    }

    private static void menu() {
        System.out.println("***Employee Management System***"
                + "\n Add Employee(1)"
                + "\n View Employee(2)"
                + "\n Update Employee(3)"
                + "\n Delete Employee(4)"
                + "\n Display all Employee(5)"
                + "\n Exit(6)");
    }
}