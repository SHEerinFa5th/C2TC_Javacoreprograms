package day5.multilevelinheritance.vehicle;

public class LevelOneEmployee extends Employee {
    private String designation;
    private String project;

    public LevelOneEmployee() {
        super();
        System.out.println("LevelOneEmployee Class Default Constructor");
    }

    public LevelOneEmployee(String name, String city, int empId, float salary, String dept,
                            String designation, String project) {
        super(name, city, empId, salary, dept);
        this.designation = designation;
        this.project = project;
    }

    public String getDesignation() {
        return designation;
    }

    public String getProject() {
        return project;
    }

    @Override
    public String toString() {
        return "LevelOneEmployee [designation=" + designation + ", project=" + project +
                ", empId=" + getEmpId() + ", salary=" + getSalary() +
                ", dept=" + getDept() + ", Name=" + getName() + ", City=" + getCity() + "]";
    }
}
