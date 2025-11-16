package ProblemSet_3b;

public class AnnualSalary {
	private double salary = 0;
	private static final double PERSONAL_ALLOWANCE = 12570.0;

	public AnnualSalary() {

	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculateTax() {
		double taxYear = 0;

		if (salary <= PERSONAL_ALLOWANCE) {
			taxYear = 0;
		} else if (salary > PERSONAL_ALLOWANCE && salary <= 50270) {
			taxYear = 0.2 * (salary - PERSONAL_ALLOWANCE);
		} else if (this.salary > 50270 && salary <= 125140) {
			taxYear = 37700 * 0.2 + (salary - 50270) * 0.4;
		} else {
			double firstTwoTaxes = 37700 * 0.2 + 74870 * 0.4;
			taxYear = firstTwoTaxes + 0.45 * (salary - 125140);
		}

		return taxYear;
	}
}
