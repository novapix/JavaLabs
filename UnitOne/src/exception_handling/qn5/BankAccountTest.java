package exception_handling.qn5;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(5000);

		try {
			account.withdraw(7000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
