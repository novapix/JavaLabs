package exception_handling.qn3;

public class VotingEligiblityTest {
	public static void main(String[] args) {
		int age = 16;

		try {
			VotingEligibilty.checkAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
