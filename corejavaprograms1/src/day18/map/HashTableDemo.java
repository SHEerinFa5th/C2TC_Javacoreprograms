package day18.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding elements (null key or null value not allowed)
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        table.put(4, "Date");

        System.out.println("Initial Hashtable: " + table);

        // Accessing a value
        System.out.println("Value for key 2: " + table.get(2));

        // Replacing a value
        table.put(3, "Blueberry");
        System.out.println("After replacing value of key 3: " + table);

        // Removing an element
        table.remove(4);
        System.out.println("After removing key 4: " + table);

        // Checking if a key or value exists
        System.out.println("Contains key 1? " + table.containsKey(1));
        System.out.println("Contains value 'Mango'? " + table.containsValue("Mango"));

        // Iterating using entrySet
        System.out.println("\nIterating through Hashtable:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Iterating using forEach (Java 8+)
        System.out.println("\nUsing forEach:");
        table.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
