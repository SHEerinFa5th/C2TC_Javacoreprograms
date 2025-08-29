package day13;

public class ThreadLifeCycleDemo {
	 public static void main(String[] args) {
	        Thread t1 = new Thread(() -> {
	            System.out.println("Thread 1 started.");
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("Thread 1 finished.");
	        });

	        Thread t2 = new Thread(() -> {
	            System.out.println("Thread 2 started.");
	            System.out.println("Thread 2 finished.");
	        });

	        t1.setPriority(Thread.MAX_PRIORITY);
	        t2.setPriority(Thread.MIN_PRIORITY);

	        t1.start();
	        t2.start();

	        try {
	            t1.join(); // main waits until t1 finishes
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread ends after t1 completes.");
	    }
	}


