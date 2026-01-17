package multi_threading.qn4;

public class PriorityThreadTest {
	public static void main(String[] args) {
		Thread high = new PriorityThread("HIGH", Thread.MAX_PRIORITY);
		Thread normal = new PriorityThread("NORMAL", Thread.NORM_PRIORITY);
		Thread low = new PriorityThread("LOW", Thread.MIN_PRIORITY);

		low.start();
		high.start();
		normal.start();
	}
}
