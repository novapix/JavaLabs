package exception_handling.qn5;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}