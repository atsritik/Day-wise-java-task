// Base class
abstract class Employee {

    String name;
    String address;
    double salary;
    String jobTitle;

    // Constructor
    Employee(String name, String address, double salary, String job Title) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Abstract methods
    abstract double calculateBonus();

    abstract void generatePerformanceReport();

    abstract void manageProject();

    // Common method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

// Manager class
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    double calculateBonus() {
        return salary * 0.20;
    }

    void generatePerformanceReport() {
        System.out.println("Manager performance is excellent.");
    }

    void manageProject() {
        System.out.println("Manager is managing the project.");
    }
}

// Developer class
class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void generatePerformanceReport() {
        System.out.println("Developer performance is very good.");
    }

    void manageProject() {
        System.out.println("Developer is developing the project.");
    }
}

// Programmer class
class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    double calculateBonus() {
        return salary * 0.08;
    }

    void generatePerformanceReport() {
        System.out.println("Programmer performance is good.");
    }

    void manageProject() {
        System.out.println("Programmer is writing code.");
    }
}

// Main class
public class Company {

    public static void main(String[] args) {

        Employee m = new Manager("Rohit", "Delhi", 80000);
        Employee d = new Developer("Aman", "Noida", 60000);
        Employee p = new Programmer("Karan", "Gurgaon", 50000);

        System.out.println("----- Manager -----");
        m.displayDetails();
        System.out.println("Bonus: " + m.calculateBonus());
        m.generatePerformanceReport();
        m.manageProject();

        System.out.println("\n----- Developer -----");
        d.displayDetails();
        System.out.println("Bonus: " + d.calculateBonus());
        d.generatePerformanceReport();
        d.manageProject();

        System.out.println("\n----- Programmer -----");
        p.displayDetails();
        System.out.println("Bonus: " + p.calculateBonus());
        p.generatePerformanceReport();
        p.manageProject();
    }
}