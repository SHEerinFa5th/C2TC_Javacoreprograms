package day4.Thirdpackage;

public class MyClass {
    private static MyClass obj = new MyClass(); // eager initialization
    private int id;

    private MyClass() {
        System.out.println("MyClass object created");
    }

    // Factory method to return the same object
    public static MyClass getObject() {
        return obj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyClass [id=" + id + "]";
    }
}
