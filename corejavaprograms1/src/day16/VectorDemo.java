package day16;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Inserting at a specific index
        vector.add(1, "Mango");

        System.out.println("Vector elements: " + vector);

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Removing an element
        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);

        // Iterating
        System.out.println("Iterating over Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}
