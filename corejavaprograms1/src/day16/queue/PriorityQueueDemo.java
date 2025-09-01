package day16.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        System.out.println("PriorityQueue: " + pq);

        // Remove elements
        System.out.println("Polling elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // retrieves in ascending order
        }
    }
}

