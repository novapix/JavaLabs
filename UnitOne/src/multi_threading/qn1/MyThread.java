package multi_threading.qn1;

class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Thread Count: " + i);

				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted.");
		}
	}
}
