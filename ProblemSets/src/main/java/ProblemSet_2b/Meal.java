package ProblemSet_2b;

public class Meal {
	private Food mainCourse = null;
	private Food dessert = null;

	public Meal(Food mainCourse, Food dessert) {
		this.mainCourse = mainCourse;
		this.dessert = dessert;
	}

	public double calculateTotalSugarLevel() {
		double mainCourseSugar = this.mainCourse.getAmountOfSugar();
		double dessertSugar = this.dessert.getAmountOfSugar();

		return mainCourseSugar + dessertSugar;
	}

	@Override
	public String toString() {
		String mainCourse = "Meal [mainCourse = ";
		String dessert = ", dessert = ";
		String firstPart = mainCourse + this.mainCourse.getName();
		String secondPart = firstPart + dessert;
		String thirdPart = secondPart + this.dessert.getName();
		String combined = thirdPart + "]";

		return combined;
	}
}
