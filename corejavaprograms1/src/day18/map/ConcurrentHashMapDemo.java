package day18.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Initial Map: " + map);

        // Accessing elements
        System.out.println("Value for key 2: " + map.get(2));

        // Removing an element
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Replacing a value
        map.replace(2, "Blueberry");
        System.out.println("After replacing value of key 2: " + map);

        // Using putIfAbsent
        map.putIfAbsent(4, "Date");
        map.putIfAbsent(1, "Apricot"); // Won't replace existing value
        System.out.println("After putIfAbsent: " + map);

        // Concurrent Modification Example
        Runnable task = () -> {
            for (int i = 5; i <= 7; i++) {
                map.put(i, "Fruit" + i);
                System.out.println(Thread.currentThread().getName() + " added: " + i);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Map: " + map);
    }
}
