package day16;

import java.util.Vector;

class VectorWorker extends Thread {
    private Vector<Integer> vector;

    public VectorWorker(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            vector.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class VectorThreadSafetyExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new VectorWorker(vector);
        Thread t2 = new VectorWorker(vector);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Vector: " + vector);
        System.out.println("Size: " + vector.size()); // Always consistent, because Vector is synchronized
    }
}
