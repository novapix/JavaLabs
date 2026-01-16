package exception_handling.qn5;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	// Business rule enforced here
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance. Available: " + balance);
		}
		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
	}
}
