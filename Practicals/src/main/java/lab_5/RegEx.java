package lab_5;

public class RegEx {

	public static void main(String[] args) {
		// Define a reference number which must start with "HO" followed by 4 digits.
		String reference = "HO12345";
		boolean foundMatch = reference.matches("(HO)([0-9]{4})");

		if (foundMatch) {
			System.out.println("Reference number is valid");
		} else {
			System.out.println("Reference number is NOT valid");
		}
	}
}
