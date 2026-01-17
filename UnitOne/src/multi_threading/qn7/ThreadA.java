package multi_threading.qn7;

public class ThreadA extends Thread {
	private Resource r1;
	private Resource r2;

	public ThreadA(Resource r1, Resource r2) {
		super("Thread-A");
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {
		synchronized (r1) {
			System.out.println(getName() + " acquired lock on " + r1.getName());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
			}

			System.out.println(getName() + " waiting for lock on " + r2.getName());

			synchronized (r2) {
				r2.use();
			}
		}
	}
}
