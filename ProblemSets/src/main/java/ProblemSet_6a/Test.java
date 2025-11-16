package ProblemSet_6a;

import java.util.regex.Pattern;

public class Test {
	
	public static void main(String[] args)  {
		System.out.println(Pattern.matches("01483-[0-9]{6}|01483[0-9]{6}", "01483-681234"));

		try {
			Supplier supplier = new Supplier("Bobby", "01483123456");
			Ingredient ingredient = new Ingredient("Lamb Chop", IngredientType.MEAT, supplier, 245);
			System.out.println(ingredient.getCookedWeight());
			System.out.println(ingredient.getName());
			System.out.println(ingredient.getType());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Ingredient ingredient = new Ingredient("Coconut Cream", IngredientType.VEGETABLE, supplier, 250);
	}
}
