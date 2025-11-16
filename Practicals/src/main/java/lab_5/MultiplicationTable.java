package lab_5;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		// loop through the first 5 times table
		for (int i = 1; i <= 5; i++) {
			
			int total = 0;
			
			for (int j = 1; j <= 12; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				
				total = total + (i * j);
			}
			
			System.out.println("Total of table is " + total);
		}
	}
}
