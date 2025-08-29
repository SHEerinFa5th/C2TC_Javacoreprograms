package day13;

public class ThreadMethodsDemo {
	public static void main(String[] args) {
        // Thread 1: Sleeps for 2 seconds
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started.");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 finished.");
        });

        // Thread 2: Quick execution
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started.");
            System.out.println("Thread 2 finished.");
        });

        // Setting priorities
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait until t1 finishes before main continues
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ends after t1 completes.");
    }
}


