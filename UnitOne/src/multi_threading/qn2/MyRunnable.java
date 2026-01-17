package multi_threading.qn2;

public class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Message " + i);                
                Thread.sleep(300); 
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
    }
}
