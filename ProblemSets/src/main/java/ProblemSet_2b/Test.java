package ProblemSet_2b;

public class Test {
	
	public static void main(String args[]) {
		Food mainCourse = new Food("BLT Sandwich", 4.7);
		Food dessert = new Food("Dark Chocolate", 48);
		
		Meal meal = new Meal(mainCourse, dessert);
		
		System.out.println(meal);
		System.out.println(meal.calculateTotalSugarLevel());
	}
}
