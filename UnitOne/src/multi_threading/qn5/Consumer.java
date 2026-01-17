package multi_threading.qn5;

public class Consumer extends Thread {

	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.consume();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Consumer sleep interrupted");
			}
		}
	}
}