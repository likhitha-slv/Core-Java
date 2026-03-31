package JavaConstructor;

class Employee {
    int empId;
    String name;
    double basicSalary;
    double hrent;
    double cl;
    double grossSalary;
    double netSalary;

    // Default Constructor
    Employee() {
        this.empId = 101;
        this.name = "Default";
        this.basicSalary = 10000;
    }

    // Parameterized Constructor
    Employee(int id, String n, double salary) {
        empId = id;
        name = n;
        basicSalary = salary;
    }

    // Method to calculate salary
    void calculateSalary() {
        hrent = 0.20 * basicSalary; 
        cl = 0.10 * basicSalary;    

        grossSalary = basicSalary + hrent + cl;
    }


    void displayCategory() {
        if (netSalary > 50000) {
            System.out.println("Category: High");
        } else if (netSalary >= 20000) {
            System.out.println("Category: Medium");
        } else {
            System.out.println("Category: Low");
        }
    }

    // Display details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
     
    }
}

public class Main {
    public static void main(String[] args) {

        // Using default constructor
        Employee e1 = new Employee();
        e1.calculateSalary();
        e1.display();
        e1.displayCategory();

        System.out.println("------------------");

        // Using parameterized constructor
        Employee e2 = new Employee(102, "Likhitha", 30000);
        e2.calculateSalary();
        e2.display();
        e2.displayCategory();
    }
}