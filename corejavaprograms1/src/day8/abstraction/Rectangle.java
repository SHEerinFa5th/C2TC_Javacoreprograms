package day8.abstraction;

public class Rectangle extends Shape {
    private float length, breadth;

    // Default constructor
    public Rectangle() {
        this.length = 4;
        this.breadth = 6;
    }

    // Parameterized constructor
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calArea() {
        area = length * breadth;
    }
}
