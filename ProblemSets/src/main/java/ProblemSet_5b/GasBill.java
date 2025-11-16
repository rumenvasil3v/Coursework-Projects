package ProblemSet_5b;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;

	public GasBill(String accountNumber, double amount, Customer customer) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
	}

	public String getCustomer() {
		return this.customer.toString();
	}

	public double getAmount() {
		return this.amount;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public boolean checkAccountAccuracy(String accountNumber) {
		boolean match = Pattern
				.matches("G[0-9]{4}-[0-9]{4}-[0-9]{4}",
						accountNumber);
		return match;
	}

	public String displayAccountDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Gas Bill\n");

		if (this.checkAccountAccuracy(this.accountNumber)) {
			sb.append("\sAccount Number:"
		+ this.accountNumber + '\n');
		} else {
			sb.append("\sAccount Number:Invalid Account" + '\n');
		}
		DecimalFormat df = new DecimalFormat("0.00");
		String formattedAmount = df.format(this.amount)
				.replace(',', '.');
		sb.append("\sCustomer:" + this.customer.toString() + '\n');
		sb.append("\sAmount due:£" + formattedAmount);

		return sb.toString().trim();
	}

	public String displayAmountDue() {
		return "Amount due:" + this.amount;
	}
}
