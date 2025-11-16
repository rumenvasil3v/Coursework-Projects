package ProblemSet_5c;

public class Pizza {
	private String[] toppings;

	public Pizza() {
		this.toppings = new String[10];
	}

	public void addToppings(String[] toppings) {
//		String[] currentTopping = toppingss.clone();
		this.toppings = toppings.clone();
//		for (int i = 0; i < currentTopping.length; i++) {
//			if (currentTopping[i] != null) {
//				this.toppings[i] = currentTopping[i];
//			}
//		}
	}

	public String printToppings() {
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < this.toppings.length; i++) {

			if (this.toppings[i] != null) {
				buffer.append(this.toppings[i] + ",");
			}
		}

		String result = buffer.toString().trim().substring(0, buffer.length() - 1);

		return result;
	}

	public double calculateCost() {
		double pizzaCost = 0;
		int numberOfToppings = 0;

		for (String topping : this.toppings) {
			if (topping != null) {
				numberOfToppings++;
			}
		}

		switch (numberOfToppings) {
		case 1:
			pizzaCost = 9.99;
			break;
		case 2:
			pizzaCost = 10.99;
			break;
		case 3:
			pizzaCost = 10.99;
			break;
		case 4:
			pizzaCost = 11.99;
			break;
		case 5:
			pizzaCost = 11.99;
			break;
		case 6:
			pizzaCost = 12.99;
			break;
		case 7:
			pizzaCost = 13.99;
			break;
		case 8:
			pizzaCost = 14.99;
			break;
		case 9:
			pizzaCost = 15.99;
			break;
		case 10:
			pizzaCost = 14.99;
			break;
		default:
			pizzaCost = 0;
			break;
		}

		return pizzaCost;
	}
}
