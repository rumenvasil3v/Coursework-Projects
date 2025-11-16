package ProblemSet_3b;

public class Test {

	public static void main(String[] args) {
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(125141f);

		System.out.println("Salary: " + salary.getSalary());
		System.out.println("Calculated tax: " + salary.calculateTax());
	}
}
