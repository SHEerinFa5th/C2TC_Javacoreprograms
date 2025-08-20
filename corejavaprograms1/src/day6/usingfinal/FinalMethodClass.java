package day6.usingfinal;

// Class with a final method
public class FinalMethodClass {
    // constructor
    public FinalMethodClass() {
        System.out.println("This is a default constructor");
    }

    final int a = 50;

    // Final method
    public final void show() {
        System.out.println("Value of a: " + a);
    }
}
