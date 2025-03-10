import java.util.*;

public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(07, "Dhoni", 50000);
        Employee emp2 = new Employee(45, "Rohit", 55000);
        Employee emp3 = new Employee(18, "Virat", 60000);

        // Storing employees in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying details of all employees
        System.out.println("Employee Details:");
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).displayDetails();
        }
    }
}
