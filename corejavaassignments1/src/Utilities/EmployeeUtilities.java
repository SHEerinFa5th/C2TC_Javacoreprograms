package Utilities;

import employees.employee;

/**
 * Utility class for performing operations on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an employee using public getters.
     *
     * @param employee Employee object whose details are printed.
     */
    public static void printemployeeDetails(employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Applies a salary increment to an employee.
     * Uses the public increaseSalary() method from Employee.
     *
     * @param employee Employee object whose salary is to be updated.
     * @param increment Amount to increase the salary by.
     */
    public static void applySalaryIncrement(employee employee, double increment) {
        employee.increaseSalary(increment);
        System.out.println("New Salary after increment: " + employee.getSalary());
    }
}
