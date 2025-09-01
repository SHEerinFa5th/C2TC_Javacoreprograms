package day18;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Create a TreeMap (stores keys in sorted order)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements
        map.put(103, "Cherry");
        map.put(101, "Apple");
        map.put(104, "Date");
        map.put(102, "Banana");

        System.out.println("Initial TreeMap (sorted by keys): " + map);

        // Accessing a value
        System.out.println("Value for key 102: " + map.get(102));

        // Removing an element
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // Replacing a value
        map.put(103, "Blueberry");
        System.out.println("After replacing value of key 103: " + map);

        // Checking if a key or value exists
        System.out.println("Contains key 101? " + map.containsKey(101));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // Iterating using entrySet
        System.out.println("\nIterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // TreeMap specific methods
        System.out.println("\nFirst Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Higher Key than 101: " + map.higherKey(101));
        System.out.println("Lower Key than 103: " + map.lowerKey(103));
    }
}
