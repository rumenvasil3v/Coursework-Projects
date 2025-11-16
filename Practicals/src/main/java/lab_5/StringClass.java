package lab_5;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "good";
		System.out.println(s1);

		String s2 = "morning";
		String s3 = s1 + " " + s2;
		System.out.println(s3);

		System.out.println(s1.length());
		System.out.println(s2.length() + s3.length());

		// Get the character at a particular position
		// Add your code here
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		
		System.out.println(s3.length());
		System.out.println(s3.charAt(5));
		System.out.println(s3.charAt(2));
		
		boolean start = false;
		// Creating a string literal
		String exercise = "COM1027";
		String m = "COM1027";
		
		// true
		System.out.println(m == exercise);
		// Creating a string using parameterised String constructor.
		String exercise2 = new String("COM1027");
		
		// Add your code here
		System.out.println(exercise.startsWith("COM"));
		System.out.println(exercise2.startsWith("COM"));
		
		// false
		System.out.println(exercise2 == exercise);

		// Does exercise equal exercise2? (.equals)
		// Add your code here
		//if () {
		//	System.out.println("The two strings are equal");
		//} else {
		//	System.out.println("The two strings are NOT equal");
		//}

		// Does exercise equal exercise2? (==)
		// Add your code here
		
		// using equals, does not matter the object reference, what matters is the value
		if (exercise.equals(exercise2)) {
			System.out.println("exercise equals exercise2");
		} else {
			System.out.println("exercise does NOT equal exercise2");
		}
		
		// using '==' there object references are different
		if (exercise == exercise2) {
			System.out.println("exercise equals exercise2");
		} else {
			System.out.println("exercise does NOT equal exercise2");
		}
		
		
		String exercise3 = "COM1027";
		// creating new reference
		exercise3 += " HEYYY";
		
		// again creating new reference with COM1027
		exercise3 = exercise3.substring(0, 7);
		
		if (exercise.equals(exercise3)) {
			System.out.println("exercise equals exercise3");
		} else {
			System.out.println("exercise does NOT equal exercise3");
		}
		
		if (exercise == exercise3) {
			System.out.println("exercise equals exercise3");
		} else {
			System.out.println("exercise does NOT equal exercise3");
		}
	}
}
