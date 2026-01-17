package multi_threading.qn5;

public class Producer extends Thread {

	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.produce(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Producer sleep interrupted");
			}
		}
	}
}