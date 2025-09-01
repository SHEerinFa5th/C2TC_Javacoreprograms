package day16.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();

        // Customers take tickets
        ticketQueue.add("Customer 1");
        ticketQueue.add("Customer 2");
        ticketQueue.add("Customer 3");

        System.out.println("Serving customers:");
        while (!ticketQueue.isEmpty()) {
            System.out.println("Now serving: " + ticketQueue.poll());
        }
    }
}
