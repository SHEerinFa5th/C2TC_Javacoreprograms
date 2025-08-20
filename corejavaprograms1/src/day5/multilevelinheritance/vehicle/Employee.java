package day5.multilevelinheritance.vehicle;

public class Employee extends Person {
    private int empId;
    private float salary;
    private String dept;

    public Employee() {
        super();
        System.out.println("Employee Class Default Constructor");
    }

    public Employee(String name, String city, int empId, float salary, String dept) {
        super(name, city);
        this.empId = empId;
        this.salary = salary;
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public float getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept +
                ", Name=" + getName() + ", City=" + getCity() + "]";
    }
}
