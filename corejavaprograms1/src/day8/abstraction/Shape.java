package day8.abstraction;

public abstract class Shape {
    protected float area;

    // Abstract method (to be implemented by subclasses)
    public abstract void calArea();

    // Normal method
    public void show() {
        System.out.println("Area = " + area);
    }
}
