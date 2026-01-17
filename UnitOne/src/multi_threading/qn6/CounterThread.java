package multi_threading.qn6;

public class CounterThread extends Thread {

	private Counter counter;

	public CounterThread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			counter.increment();
		}
	}
}
