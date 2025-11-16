package ProblemSet_5c;

public class Test {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		String[] toppings = new String[] { "cheese", "pepperoni", "tomato" };
		String[] toppings2 = new String[] { "mushroom" };
		pizza.addToppings(toppings);
		pizza.addToppings(toppings2);
		System.out.println(pizza.calculateCost());
		System.out.println(pizza.printToppings());
		
		Customer customer = new Customer("Joe", "Bloggs");
	    Order order = new Order(customer);
	    
	    order.addPizza(pizza);
	    
	    Pizza pizza2 = new Pizza();
		String[] toppings3 = new String[] { "mozzarella", "basil", "tomato" };
		pizza.addToppings(toppings3);

		Pizza pizza3 = new Pizza();
		String[] toppings4 = new String[] { "chicken", "peppers", "tomato", "corn", "bacon", "chilli" };
		pizza2.addToppings(toppings4);

		order.addPizza(pizza2);
		order.addPizza(pizza2);
		order.addPizza(pizza3);
		
		System.out.println(order.printReceipt());
	}

}
