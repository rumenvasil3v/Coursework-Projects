package lab_4;

public class House {
	private int numberOfHouse;
	private int numberBottles;
	
	public House(int numberOfHouse, int numberBottles) {
		this.numberOfHouse = numberOfHouse;
		this.numberBottles = numberBottles;
	}
	
	public int getNumberOfHouse() {
		return this.numberOfHouse;
	}
	
	public int getNumberBottles() {
		return this.numberBottles;
	}
	
	public void setNumberBottles(int numberBottles) {
		this.numberBottles = numberBottles;
	}
	
	@Override
	public String toString() {
		return "House number: " + this.numberOfHouse + ", (" + this.numberBottles +
				" bottles";
	}
}
