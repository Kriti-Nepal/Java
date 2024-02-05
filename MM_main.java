package models;

public class MM_main {
    public static void main(String[] args) {
        Manager manager = new Manager("Kriti", 17, "980000000", "Chabahil", 5000, "Finance");
        System.out.println("Manager Salary: $" + manager.calculateSalary(2));

        Employee employee = new Employee("Ram", 16, "98000000", "Sifal", 500.00, "Hiring Manager");
        System.out.println("Employee Salary: $" + employee.calculateSalary(3));
    }
}