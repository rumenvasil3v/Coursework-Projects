package ProblemSet_2a;

public class Student {
	private String forename = null;
	private String surname = null;
	private int age = 0;

	public Student(String forename, String surname, int age) {
		this.setForename(forename);
		this.setSurname(surname);
		this.setAge(age);
	}

	public String getForename() {
		return (this.forename);
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullname() {
		return (this.getForename() + " " + this.getSurname());
	}
}
