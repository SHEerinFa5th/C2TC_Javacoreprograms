package day16;

import java.util.ArrayList;
import java.util.List;

class ArrayListWorker extends Thread {
    private List<Integer> list;

    public ArrayListWorker(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ArrayListThreadExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Thread t1 = new ArrayListWorker(list);
        Thread t2 = new ArrayListWorker(list);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final ArrayList: " + list);
        System.out.println("Size: " + list.size()); // May show inconsistency due to lack of synchronization
    }
}
