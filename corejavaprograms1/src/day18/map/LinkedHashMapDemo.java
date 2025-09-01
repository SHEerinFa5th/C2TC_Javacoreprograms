package day18.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create a LinkedHashMap (insertion order is preserved)
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Cherry");
        map.put(104, "Date");

        System.out.println("Initial LinkedHashMap: " + map);

        // Accessing a value
        System.out.println("Value for key 102: " + map.get(102));

        // Removing an element
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // Replacing a value
        map.put(103, "Blueberry");
        System.out.println("After replacing value for key 103: " + map);

        // Checking if a key or value exists
        System.out.println("Contains key 101? " + map.containsKey(101));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // Iterating using entrySet
        System.out.println("\nIterating through LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Iterating using forEach (Java 8+)
        System.out.println("\nUsing forEach method:");
        map.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
