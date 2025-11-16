package lab_5;

public class Example {
	public static void main(String[] args) {
		// declaration of new array with 3 elements of type String
		String[] names = new String[3];
		names[0] = "Stella";
		names[1] = "Junaid";
		names[2] = "Mariyah";

		// declaration of array of type double
		double[] grades = new double[3];
		grades[0] = 50;
		grades[1] = 60;
		grades[2] = 75;

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		System.out.println();

		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);

		System.out.println();

		System.out.println(names[0] + " achieved " + grades[0] + "%");
		System.out.println(names[1] + " achieved " + grades[1] + "%");
		System.out.println(names[2] + " achieved " + grades[2] + "%");

		System.out.println();
		System.out.println("FOR LOOP");

		// A FOR loop example
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println();

		System.out.println("FOR EACH LOOP");

		// A FOR-EACH loop example
		for (double grade: grades) {
			System.out.println(grade);
		}
		
		System.out.println();
		
		// While loop
		int i = 0;
		while (i < names.length) {
			System.out.println(names[i] + " achieved " + grades[i] + "%");
			i++;
		}
	}
}
