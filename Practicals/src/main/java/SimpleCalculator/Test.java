package SimpleCalculator;

public class Test {

	public static void main(String args[]) {
		Calculator calc = new Calculator(5, 3);
		
		System.out.println(calc.calculateNumbers("+"));
		System.out.println(calc.calculateNumbers("-"));
		System.out.println(calc.calculateNumbers("*"));
		System.out.println(calc.calculateNumbers("/"));
	}
}
