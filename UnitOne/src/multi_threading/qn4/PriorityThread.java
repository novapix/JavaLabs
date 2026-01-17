package multi_threading.qn4;

public class PriorityThread extends Thread {
	public PriorityThread(String name, int priority) {
		super(name);
		setPriority(priority);

	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " | Priority: " + getPriority() + " | Iteration: " + i);
		}
	}
}