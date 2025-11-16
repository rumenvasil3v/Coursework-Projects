package ProblemSet_4b;

public class Classroom {
	private static final int CAPACITY = 20;
	private String room;
	private Student[] maxStudents;

	public Classroom(String room) {
		this.room = room;
		this.maxStudents = new Student[20];
	}

	public int getCapacity() {
		return CAPACITY;
	}

	public String getRoom() {
		return this.room;
	}

	public void addStudents(int index, char initial, String surname) {
		Student student = new Student(initial, surname);
		this.maxStudents[index] = student;
	}

	public String getSummary() {
		StringBuilder sb = new StringBuilder();
		boolean areThereAnyStudents = false;

		for (Student student : maxStudents) {
			if (student != null) {
				areThereAnyStudents = true;
				sb.append(student.getStudentDetails());
				sb.append("\n");
			}
		}

		String students = areThereAnyStudents ? ""
				: "No students added";
		sb.append(students);

		return sb.toString();
	}

	public int howManyStudents() {
		int numberOfStudentsCounter = 0;

		for (Student student : maxStudents) {
			if (student != null) {
				numberOfStudentsCounter++;
			}
		}

		return numberOfStudentsCounter;
	}
}
