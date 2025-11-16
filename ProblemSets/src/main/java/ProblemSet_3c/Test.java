package ProblemSet_3c;

public class Test {

	public static void main(String[] args) {
		Position director = new Position();
		director.setRoleName("Director");

		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(39999);

		Employee james = new Employee(9876, "Sid", "James", salary, director);
		System.out.println(james);
	}
}
