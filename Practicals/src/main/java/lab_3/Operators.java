package lab_3;

public class Operators {
	
	public static void main(String[] args) {
		int x = 5;
//		System.out.println(x++);
//		System.out.println(x);
		int y = x--;
		System.out.println(y);
		System.out.println(x);
		
		String number = "50.95";
		int newNumber = (int) Double.parseDouble(number);
		newNumber = newNumber * 2;
//		System.out.println(newNumber);
		newNumber++; // 101
		newNumber = ++newNumber;
		System.out.println(newNumber);
		System.out.println(newNumber);
	}
}
