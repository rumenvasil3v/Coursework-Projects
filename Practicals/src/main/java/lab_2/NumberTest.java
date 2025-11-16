package lab_2;

public class NumberTest {
	
	public static void main(String args[]) {
		NumberInfo numberInfo = new NumberInfo(3);
		
		System.out.println(numberInfo.getValue());
		numberInfo.increment();
		
		System.out.println(numberInfo.getValue());
		numberInfo.increment();
		
		System.out.println(numberInfo.getValue());
		numberInfo.increment();
		System.out.println(numberInfo.getValue());
		
		numberInfo.increment();
		System.out.println(numberInfo.getValue());
		
		numberInfo.increment();
		System.out.println(numberInfo.getValue());
		
		// System.out.println("25 % 4 is " + (25 % 4)); 1
		// System.out.println("25 divide by 4 is " + (25.0 / 4)); 6.25
		// System.out.println("17 % 3 is " + (17 % 3)); // 2 
		// System.out.println("(16 + 1) % 3 is " + ((16 + 1) % 3)); // 2
		// System.out.println("17 divide by 3 is " + (17.0 / 3)); // 5.666...
		// System.out.println("16 + 1 divide by 3 is " + ((16 + 1) / 3.0)); 5.666...
	}
}
