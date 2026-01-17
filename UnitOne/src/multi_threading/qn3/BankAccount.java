package multi_threading.qn3;

public class BankAccount {
	private int balance = 1000; 

    public synchronized void withdraw(int amount, String threadName) {
        System.out.println(threadName + " attempting to withdraw " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }

            balance -= amount;
            System.out.println(threadName + " withdrawal successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println(threadName + " withdrawal failed (Insufficient balance)");
            System.out.println("Current Balance: " + balance);
        }
    }
}
