package day13;

public class ThreadDemo {
	public static void main(String[] args) {
        ChildThread child = new ChildThread();
        child.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
