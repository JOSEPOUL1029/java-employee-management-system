
public class Programmer extends Employee {

//    method overloading : Default constructor
    public Programmer() {
        super();
    }

    // Constructor Overloading: Parameterized constructor (Inheritance)
    public Programmer(String employeeId, String name, double salary) {
        super(employeeId, name, salary);
    }

    // Method Overriding: Unique bonus calculation for Managers (e.g., 15% of salary)
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }
}
