
public class Manager extends Employee {

    // Constructor Overloading: Default constructor
    public Manager() {
        super();
    }

    // Constructor Overloading: Parameterized constructor (Inheritance)
    public Manager(String employeeId, String name, double salary) {
        super(employeeId, name, salary);
    }

    // Method Overriding: Unique bonus calculation for Managers (e.g., 20% of salary)
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}
