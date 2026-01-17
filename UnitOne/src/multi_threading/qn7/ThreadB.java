package multi_threading.qn7;

public class ThreadB extends Thread {
	private Resource r1;
	private Resource r2;

	public ThreadB(Resource r1, Resource r2) {
		super("Thread-B");
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {
		synchronized (r2) {
			System.out.println(getName() + " acquired lock on " + r2.getName());

			try {
				Thread.sleep(500); // allow Thread-A to lock r1
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
			}

			System.out.println(getName() + " waiting for lock on " + r1.getName());

			synchronized (r1) {
				r1.use();
			}
		}
	}
}
