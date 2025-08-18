package Utilities;

import employees.Manager;
import employees.Developer;
import Utilities.EmployeeUtilities;

/**
 * Main class to test Employee, Manager, Developer, and EmployeeUtilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Display details using EmployeeUtilities
        System.out.println("Manager Details:");
        EmployeeUtilities.printemployeeDetails(manager);   // ✅ fixed
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printemployeeDetails(developer); // ✅ fixed
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
