package day13;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running using Runnable...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runnable thread step: " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();

        System.out.println("Main thread still running...");
    }
}

