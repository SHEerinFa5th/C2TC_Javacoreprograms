package day18.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        System.out.println("Initial Map: " + map);

        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // Checking if a key or value exists
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // Removing an element
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // Replacing a value
        map.put(2, "Blueberry");
        System.out.println("After replacing value of key 2: " + map);

        // Iterating using entrySet
        System.out.println("\nIterating through HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating using forEach (Java 8+)
        System.out.println("\nUsing forEach:");
        map.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
