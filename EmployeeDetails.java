package LibraryManagementSystem;

public class EmployeeDetails {
    private int employeeId;  // encapsulation
    private String name;
    private int age;
    private String position;
    private double salary;

    @Override // without this the output will be =
              // LibraryManagementSystem.EmployeeDetai1s@2d98a335
              // for View Employee method
    public String toString() {
        return "ID: " + this.employeeId + "\nName: " + this.name +
                "\n" + "Age: " + this.age +
                "\n" + "Position: " + this.position +
                "\n" + "Salary: " + this.salary + "\n ---------------------";
    }


    // constructor
    public EmployeeDetails(int employeeId, String name, int age, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }


    // getter
    public int getEmployeeId() {
        return employeeId;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int newAge) {
        this.age = newAge;
    }

    // getter
    public String getPosition() {
        return position;
    }

    // setter
    public void setPosition(String newPosition) {
        this.position = newPosition;
      }
    

      // getter
    public double getSalary() {
        return salary;
    }

    // setter
    public void setSalary(double newSalary) {
        this.salary = newSalary;
      }

    public void remove(EmployeeDetails employeeDetails) {
    }

}
