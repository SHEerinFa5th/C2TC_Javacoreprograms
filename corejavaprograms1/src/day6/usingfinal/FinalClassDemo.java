package day6.usingfinal;

// A final class cannot be inherited
final class FinalClass {
    void show() {
        System.out.println("Final class cannot be inherited");
    }
}

// ❌ This will cause error, so commented out
// class FinalChildClass extends FinalClass {} // Not allowed

public class FinalClassDemo {
    public static void main(String[] args) {
        // Create object of final class
        FinalClass f1 = new FinalClass();
        f1.show();
    }
}
