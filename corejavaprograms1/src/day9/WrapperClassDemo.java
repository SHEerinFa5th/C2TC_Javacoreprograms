package day9;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Unboxing
        Integer i = Integer.valueOf(10);  // Better than 'new Integer(10)'
        System.out.println(i);

        int b = i.intValue(); // Explicit unboxing
        System.out.println(b);

        // Implicit unboxing
        int c = i; 
        System.out.println(c);

        // Autoboxing
        int a = 100;
        Integer i1 = a; // automatically boxed
        System.out.println(i1);
    }
}
