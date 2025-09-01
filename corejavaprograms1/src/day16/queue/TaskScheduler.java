package day16.queue;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority; // lower number = higher priority

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (priority " + priority + ")";
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.add(new Task("Write report", 2));
        taskQueue.add(new Task("Fix bugs", 1));
        taskQueue.add(new Task("Check emails", 5));

        System.out.println("Executing tasks in order of priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
