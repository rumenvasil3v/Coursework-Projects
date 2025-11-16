package ProblemSet_2a;

public class Test {
	
	public static void main(String args[]) {
		Student rumen = new Student("Rumen", "Vasilev", 19);
		rumen.setForename("Dudu");
		rumen.setSurname("Minekova");
		System.out.println("Name: " + rumen.getFullname());
		System.out.print("Age: " + rumen.getAge());
	}
}
