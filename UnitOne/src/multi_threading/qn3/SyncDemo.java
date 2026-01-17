package multi_threading.qn3;

public class SyncDemo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		WithdrawThread t1 = new WithdrawThread(account, 600, "Thread-1");
		WithdrawThread t2 = new WithdrawThread(account, 600, "Thread-2");
		WithdrawThread t3 = new WithdrawThread(account, 300, "Thread-3");

		t1.start();
		t2.start();
		t3.start();
	}
}
