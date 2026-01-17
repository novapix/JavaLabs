package multi_threading.qn5;

public class Buffer {
	private int item;
	private boolean available = false;

	public synchronized void produce(int value) {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Producer interrupted");
			}
		}

		item = value;
		available = true;
		System.out.println("Producer produced: " + item);
		notify();
	}

	public synchronized void consume() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Consumer interrupted");
			}
		}

		System.out.println("Consumer consumed: " + item);
		available = false;
		notify();
	}
}
