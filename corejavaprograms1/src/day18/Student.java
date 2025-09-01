package day18;

public class Student {
    // Fields
    private int id;
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    // toString() for printing
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Course=" + course + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(101, "Alice", 20, "Computer Science");
        Student s2 = new Student(102, "Bob", 21, "Electronics");

        // Printing student details
        System.out.println(s1);
        System.out.println(s2);

        // Updating details using setters
        s1.setCourse("Data Science");
        System.out.println("After update: " + s1);
    }
}
