package ProblemSet_5a;

public class Test {
	
	public static void main(String[] args) {
		RainfallYear latest = new RainfallYear(2023);
		double[] data = new double[] { 40, 53, 66, 42, 50, 63, 58, 47, 54, 0, 0, 0 };
		latest.enterData(data);
		
		System.out.println("Highest rainfall: " + latest.calculateHighestRainfall());
		System.out.println("Mean rainfall: " + latest.calculateMeanRainfall());
		System.out.println("Rainfall January " + latest.getRainfallMonth("JanuAry"));
		System.out.println("Rainfall November " + latest.getRainfallMonth("NoVember"));
		System.out.println("Rainfall December " + latest.getRainfallMonth("december"));
	}
}
