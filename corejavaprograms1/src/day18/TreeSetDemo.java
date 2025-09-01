package day18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet (stores elements in sorted order)
        TreeSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Date");

        System.out.println("Initial TreeSet (sorted): " + set);

        // Duplicate element (won't be added)
        set.add("Apple");
        System.out.println("After adding duplicate 'Apple': " + set);

        // Checking existence
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));
        System.out.println("Contains 'Mango'? " + set.contains("Mango"));

        // Removing an element
        set.remove("Date");
        System.out.println("After removing 'Date': " + set);

        // Iterating through TreeSet
        System.out.println("\nIterating through TreeSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // TreeSet specific methods
        System.out.println("\nFirst Element: " + set.first());
        System.out.println("Last Element: " + set.last());
        System.out.println("Higher than 'Banana': " + set.higher("Banana"));
        System.out.println("Lower than 'Cherry': " + set.lower("Cherry"));
    }
}
