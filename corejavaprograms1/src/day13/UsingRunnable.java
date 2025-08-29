package day13;

public class UsingRunnable {
	 public static void main(String[] args) {
	        Runnable task = () -> {
	            System.out.println("Child thread using Lambda Runnable...");
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Lambda Task step: " + i);
	                try {
	                    Thread.sleep(400);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };

	        Thread t = new Thread(task);
	        t.start();

	        System.out.println("Main thread running...");
	    }
	}

	

