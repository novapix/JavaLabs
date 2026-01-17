package multi_threading.qn1;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		System.out.println("Main thread is running...");
	}
}
