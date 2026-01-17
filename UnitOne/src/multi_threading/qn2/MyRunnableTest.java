package multi_threading.qn2;

public class MyRunnableTest {
	public static void main(String[] args) {
        MyRunnable task1 = new MyRunnable("Thread-A");
        MyRunnable task2 = new MyRunnable("Thread-B");
        MyRunnable task3 = new MyRunnable("Thread-C");
        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }
}
