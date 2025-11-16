package ProblemSet_4b;

public class Test {

	public static void main(String[] args) {
		Classroom room = new Classroom("12BC");
		room.addStudents(0, 'A', "Cooper");
		room.addStudents(1, 'S', "Kazamia");
		room.addStudents(2, 'J', "Bloggs");
		room.addStudents(3, 'B', "Ross");
		room.addStudents(4, 'E', "Zaid");
		room.addStudents(5, 'S', "Feng");

		System.out.println(room.getSummary());
		System.out.println(room.howManyStudents());
	}
}
