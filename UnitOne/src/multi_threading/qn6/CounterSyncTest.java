package multi_threading.qn6;

public class CounterSyncTest {
	public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}
