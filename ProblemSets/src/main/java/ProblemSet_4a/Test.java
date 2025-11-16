package ProblemSet_4a;

public class Test {

	public static void main(String[] args) {
		Day day = new Day("Monday");
		day.setSession(0, "COM1027", 9, 10);
		day.setSession(2, "COM1026", 15, 17);

		day.display();
		System.out.println(day.toString());
	}
}
