package ProblemSet_7b;

import java.util.regex.Pattern;

public class Module {
	private String name = null;
	
	public Module(String name) {
		boolean match = Pattern
				.matches("COM[0-9]{4}", name);
		
		if (match) {			
			this.name = name;
		} else {
			this.name = "Error";
		}
		
	}
	
	public String getName() {
		return this.name;
	}
}
