package exception_handling.qn3;

public class VotingEligibilty {
	static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Not eligible to vote. Age must be 18 or above.");
		}
		System.out.println("Eligible to vote");
	}
}
