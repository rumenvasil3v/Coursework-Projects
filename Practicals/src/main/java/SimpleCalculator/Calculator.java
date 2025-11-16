package SimpleCalculator;

public class Calculator {
	private double firstNumber;
	private double secondNumber;
	
	public Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double calculateNumbers(String operation) {
		double result = 0;
		
		switch (operation) {
		case "+":
			result = this.firstNumber + this.secondNumber;
			break;
		case "-":
			result = this.firstNumber - this.secondNumber;
			break;
		case "*":
			result = this.firstNumber * this.secondNumber;
			break;
		case "/":
			result = this.firstNumber / this.secondNumber;
		}
		
		return result;
	}
}
