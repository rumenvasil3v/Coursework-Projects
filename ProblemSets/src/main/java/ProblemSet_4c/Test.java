package ProblemSet_4c;

public class Test {

	public static void main(String[] args) {
		Student student = new Student('B', "Ross");
		Module empty = new Module("empty", 0);

		student.setModules(0, "COM1025", 40);
		student.setModules(1, "COM1026", 55);
		student.setModules(2, "COM1027", 67);
		student.setModules(3, "COM1031", 85);
		student.setModules(4, "COM1028", 60);
		student.setModules(5, "COM1029", 70);
		student.setModules(6, "COM1032", 60);
		student.setModules(7, "COM1033", 57);

		System.out.println(student.displayArray());
		System.out.println(student.getStudentDetails());
	}
}

//bob.setModules(0, "COM1025", 40);
//bob.setModules(1, "COM1026", 55);
//bob.setModules(2, "COM1027", 67);
//bob.setModules(3, "COM1031", 85);
//bob.setModules(4, "COM1028", 60);
//bob.setModules(5, "COM1029", 70);
//bob.setModules(6, "COM1032", 60);
//bob.setModules(7, "COM1033", 57);
