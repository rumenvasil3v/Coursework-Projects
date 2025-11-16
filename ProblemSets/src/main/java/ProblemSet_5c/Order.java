package ProblemSet_5c;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Pizza> pizzas;
	private Customer customer;

	public Order(Customer customer) {
		this.pizzas = new ArrayList<Pizza>();
		this.customer = customer;
	}

	public String getCustomer() {
		return this.customer.toString();
	}

	public void addPizza(Pizza pizza) {
		this.pizzas.add(pizza);
	}

	public double calculateTotal() {
		double total = 0;

		for (Pizza pizza : this.pizzas) {
			total += pizza.calculateCost();
		}

		return total;
	}

	public String printReceipt() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("Customer: " + this.customer.toString() + "\n");
		buffer.append("Number of Pizzas: " + this.howManyPizzasInOrder() + "\n");
		buffer.append("Total Cost: " + this.calculateTotal());

		return buffer.toString().trim();
	}

	public int howManyPizzasInOrder() {
		return this.pizzas.size();
	}
}
