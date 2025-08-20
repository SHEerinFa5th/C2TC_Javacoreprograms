package day8.abstraction;

public class Square extends Shape {
    private float side;

    // Default constructor
    public Square() {
        this.side = 5; // default value
    }

    // Parameterized constructor
    public Square(float side) {
        this.side = side;
    }

    @Override
    public void calArea() {
        area = side * side;
    }
}
