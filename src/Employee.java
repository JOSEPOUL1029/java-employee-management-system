
public class Employee {

    // Encapsulation: Private variables
    private String employeeId;
    private String name;
    private double salary;

    // Constructor Overloading: Default constructor
    public Employee() {
        this.employeeId = "Unknown";
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Constructor Overloading: Parameterized constructor
    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getters for Encapsulation
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Base method for calculation
    public double calculateBonus() {
        return 0.0;
    }
}
