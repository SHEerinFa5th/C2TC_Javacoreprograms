package day13;

public class MyChildThread extends Thread {
    private String taskName;

    public MyChildThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " started.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " running... Step " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(taskName + " finished.");
    }
}
