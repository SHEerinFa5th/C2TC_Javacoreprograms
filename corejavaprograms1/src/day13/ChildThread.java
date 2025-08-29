package day13;

public class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 

}
