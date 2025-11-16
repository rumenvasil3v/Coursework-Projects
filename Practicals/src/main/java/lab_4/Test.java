package lab_4;

public class Test {
	
	public static void main(String[] args) {
		int house1 = 3;
		int house2 = 0;
		int house3 = 4;
		
		System.out.println("How many bottles in house 1 is " + house1);
		System.out.println("How many bottles in house 2 is " + house2);
		System.out.println("How many bottles in house 3 is " + house3);
		
		int size = 3;
		int[] houses = new int[size];
		houses[0] = 3;
		houses[1] = 0;
		houses[2] = 4;
		
		// More compact code than the one above
		int totalMilkBottles = 0;
		for (int i = 0; i < houses.length; i++) {
			System.out.println("How many bottles in house " + (i + 1) + " is " + houses[i]);
			totalMilkBottles += houses[i];
		}
		
		System.out.println(totalMilkBottles);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		for (int bottles: houses) {
			System.out.println("How many bottles in house is " + bottles);
		}
	}
}
