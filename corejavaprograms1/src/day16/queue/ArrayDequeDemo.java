package day16.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.add("A");
        deque.add("B");
        deque.add("C");

        // Add to front and end
        deque.addFirst("Start");
        deque.addLast("End");

        System.out.println("ArrayDeque: " + deque);

        // Removing elements
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing first and last: " + deque);

        // Peek
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());
    }
}
