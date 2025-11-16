package ProblemSet_4c;

public class Student {
	private char initial;
	private String surname;
	private Module[] modules;

	public Student(char initial, String surname) {
		this.initial = initial;
		this.surname = surname;
		this.modules = new Module[8];
	}

	public Module getModules(int index) {
		return this.modules[index];
	}

	public void setModules(int index, String code, double average) {
		Module module = new Module(code, average);
		this.modules[index] = module;
	}

	public String getStudentDetails() {
		String initialChar = String.valueOf(initial);

		return initialChar + '.' + " " + this.surname + " "
		+ this.calculateYearAverage() + "%";
	}

	public int calculateYearAverage() {
		double yearAverage = 0;

		for (Module module : this.modules) {
			yearAverage += module.getAverage();
		}

		yearAverage = yearAverage / this.modules.length;

		return (int) yearAverage;
	}

	public String displayArray() {
		String modulesInfo = "";

		for (Module module : this.modules) {
			modulesInfo += module.toString();
			modulesInfo += "\n";
		}

		modulesInfo += "Year Average: "
		+ this.calculateYearAverage() + "%";

		return modulesInfo.trim();
	}
}
