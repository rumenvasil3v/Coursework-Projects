package ProblemSet_5b;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer("Alice", "Wonderland");
		GasBill bill = new GasBill("1234-5678-1234", 100, customer);
		
		System.out.println(bill.checkAccountAccuracy(bill.getAccountNumber()));
		System.out.println(bill.displayAccountDetails());
	}

}
