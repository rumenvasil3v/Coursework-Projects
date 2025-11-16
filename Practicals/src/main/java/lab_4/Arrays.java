package lab_4;

public class Arrays {
	
	public static void main(String[] args) {
		int[] numbers = new int[] {1, 3, 4, 15};
		
		// Looping using for loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// Looping using foreach
		for (int num: numbers) {
			System.out.println(num);
		}
	}
}
