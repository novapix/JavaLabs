package multi_threading.qn7;

public class DeadLockDemo {
	public static void main(String[] args) {

		Resource resource1 = new Resource("Resource-1");
		Resource resource2 = new Resource("Resource-2");

		ThreadA tA = new ThreadA(resource1, resource2);
		ThreadB tB = new ThreadB(resource1, resource2);

		tA.start();
		tB.start();
	}
}
