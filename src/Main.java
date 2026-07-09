
public class Main {

    public static void main(String[] args) {
        // Runtime Polymorphism: Employee references pointing to subclass objects
        Employee emp1 = new Manager("M101", "Catherine Juma", 95000.0);
        Employee emp2 = new Programmer("P202", "Joseph Paul", 860000.0);

        // Displaying calculated bonuses
        System.out.println("--- Employee Bonus Details ---");

        System.out.println("Employee ID: " + emp1.getEmployeeId());
        System.out.println("Name: " + emp1.getName());
        System.out.printf("Salary: $%.2f%n", emp1.getSalary());
        System.out.printf("Calculated Bonus: $%.2f%n", emp1.calculateBonus());

        System.out.println("\n--------------------------------");

        System.out.println("Employee ID: " + emp2.getEmployeeId());
        System.out.println("Name: " + emp2.getName());
        System.out.printf("Salary: $%.2f%n", emp2.getSalary());
        System.out.printf("Calculated Bonus: $%.2f%n", emp2.calculateBonus());
    }
}
