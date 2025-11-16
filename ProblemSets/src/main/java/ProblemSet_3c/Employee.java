package ProblemSet_3c;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;

	public Employee(int id,
			String forename,
			String surname,
			AnnualSalary salary,
			Position companyPosition) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}

	public int getId() {
		return this.id;
	}

	public String getForename() {
		return this.forename;
	}

	public String getSurname() {
		return this.surname;
	}

	public String getPositionName() {
		return this.companyPosition.getRoleName();
	}

	public double getSalary() {
		return this.salary.getSalary();
	}

	public void displayEmployeeName() {
		System.out.println(this.forename + this.surname);
	}

	private boolean eligibleForBonus() {
		boolean isEligible = false;

		if (this.salary.getSalary() > 40000) {
			isEligible = true;
		}

		return isEligible;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.surname + ", ");
		sb.append(this.forename + " (" + this.id + ")");
		sb.append(": " + this.companyPosition.getRoleName());
		sb.append(" at " + "£" + this.salary.getSalary());
		sb.append(" (£" + this.salary.calculateTax() + " tax)");

		if (this.eligibleForBonus()) {
			sb.append(" and is eligible for bonus.");
		} else {
			sb.append(" and is not eligible for bonus.");
		}

		return sb.toString();
	}
}
