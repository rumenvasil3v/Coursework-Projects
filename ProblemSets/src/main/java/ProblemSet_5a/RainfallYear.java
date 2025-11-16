package ProblemSet_5a;

public class RainfallYear {
	private int year;
	private double[] rainfallMonths;

	public RainfallYear(int year) {
		this.year = year;
		this.rainfallMonths = new double[12];
	}

	public int getYear() {
		return this.year;
	}

	public double calculateMeanRainfall() {
		double rainfallSum = 0;

		for (double rainfall : this.rainfallMonths) {
			rainfallSum += rainfall;
		}

		return rainfallSum / this.rainfallMonths.length;
	}

	public double calculateHighestRainfall() {
		double highestRainfall = 0;

		for (double rainfall : this.rainfallMonths) {
			if (rainfall >= highestRainfall) {
				highestRainfall = rainfall;
			}
		}

		return highestRainfall;
	}

	public void enterData(double[] rainfall) {
		for (int i = 0; i < rainfall.length; i++) {
			this.rainfallMonths[i] = rainfall[i];
		}
	}

	public double getRainfallMonth(String month) {
		month = month.toLowerCase();

		double rainfallMonth = 0;

		switch (month) {
		case "january":
			rainfallMonth = this.rainfallMonths[0];
			break;
		case "february":
			rainfallMonth = this.rainfallMonths[1];
			break;
		case "march":
			rainfallMonth = this.rainfallMonths[2];
			break;
		case "april":
			rainfallMonth = this.rainfallMonths[3];
			break;
		case "may":
			rainfallMonth = this.rainfallMonths[4];
			break;
		case "june":
			rainfallMonth = this.rainfallMonths[5];
			break;
		case "july":
			rainfallMonth = this.rainfallMonths[6];
			break;
		case "august":
			rainfallMonth = this.rainfallMonths[7];
			break;
		case "september":
			rainfallMonth = this.rainfallMonths[8];
			break;
		case "october":
			rainfallMonth = this.rainfallMonths[9];
			break;
		case "november":
			rainfallMonth = this.rainfallMonths[10];
			break;
		case "december":
			rainfallMonth = this.rainfallMonths[11];
			break;
		default:
			break;
		}

		return rainfallMonth;
	}
}
