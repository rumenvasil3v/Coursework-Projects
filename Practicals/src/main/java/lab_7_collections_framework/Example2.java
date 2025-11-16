package lab_7_collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Example2 {
	private Map<String, Double> values;
	
	public Example2() {
		this.values = new HashMap<String, Double>();
	}
	
	public void addElement(String key, double value) {
		key = this.getKeyUpperCase(key);
		
		this.values.put(key, Double.valueOf(value));
	}
	
	public void removeElement(String key) {
		key = this.getKeyUpperCase(key);
		
		if (this.checkIfElementExists(key)) {
			this.values.remove(key);
		}
	}
	
	private String getKeyUpperCase(String key) {
		return key.toUpperCase();
	}
	
	private boolean checkIfElementExists(String key) {
		key = this.getKeyUpperCase(key);
		boolean doesItExist = false;
		
		if (this.values.containsKey(key)) {
			doesItExist = true;
		}
		
		return doesItExist;
	}
	
	public double retrieveElement(String key) {
		double element = 0;
		
		if (this.checkIfElementExists(key)) {
			element = this.values.get(key);
		}
		
		return element;
	}
	
	public String displayMap() {
		StringBuffer buffer = new StringBuffer();
		
		for (String key: this.values.keySet()) {
			buffer.append("Key: " + key + " Value: " + this.values.get(key) + "\n");
		}
		
		return buffer.toString().trim();
	}
	
	public String displayOrderedMap() {
		StringBuffer buffer = new StringBuffer();
		
		List<String> keys = new ArrayList<String>();
		
		for (String key: this.values.keySet()) {
			keys.add(key);
		}

		Collections.sort(keys);
		buffer.append("Ordered Map\n");
		
		for (String key: keys) {
			buffer.append("Key: " + key + " Value: " + this.values.get(key) + "\n");
		}
		
		return buffer.toString();
	}
	
	public double calculateAverage() {
		double sum = 0;
		
		for (Double value: this.values.values()) {
			sum += value.doubleValue(); // the compiler invokes that method to unbox the value from the wrapper class
		}
		
		return (sum / this.values.size());
	}
	
	public static void main(String[] args) {
		Example2 test = new Example2();
		List<String> moduleNames = new ArrayList<String>();

		// Now read in names from the command line to put into the temporary arraylist.
		boolean finished = false;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter module names, one per line");

		// Continue reading until "exit" is entered.
		while (!finished) {
		    String line = scanner.nextLine();

		    // Check for exit.
		    if (line.startsWith("exit")) {
			finished = true;
		    } else {
			// Not exit, so a new key-value pair is expected
			moduleNames.add(line.toUpperCase());
			finished = !scanner.hasNextLine();
		    }
		}

		System.out.println("You have defined " + moduleNames.size() + " modules.");

		List<Double> moduleGrades = new ArrayList<Double>();

		// Now read in grades from the command line to put into the temporary arraylist.
		finished = false;
		int i = 0;

		// Continue reading until "exit" is entered.
		while (i < moduleNames.size()) {
		    System.out.println("Enter the grade for " + moduleNames.get(i) + " :");
		    String line = scanner.nextLine();

		    // Check for exit.
		    if (line.startsWith("exit")) {
			finished = true;
		    } else {
			// Not exit, so a new key-value pair is expected
			moduleGrades.add(Double.parseDouble(line));
		    }
		    i++;
		}

		scanner.close();

		// add key-value pairs in the map
		for (int index = 0; index < moduleNames.size(); index++) {
		    test.addElement(moduleNames.get(index), moduleGrades.get(index));
		}

		// remove an element from the list
		test.removeElement("COM1027");

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Using the .get method");
		System.out.println();

		// retrieve elements and display them on the console
		System.out.println("This is the value associated to the key 'COM1025': " + test.retrieveElement("COM1025"));
		System.out.println("This is the value associated to the key 'COM1026': " + test.retrieveElement("COM1026"));

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Displaying Map");
		System.out.println();

		// display all the elements of the list
		System.out.println(test.displayMap());

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Using the .sort method");
		System.out.println();

		// add one more element in the list
		test.addElement("COM1027", 75);

		// display all the elements of the list
		System.out.println(test.displayMap());

		// display all the elements of the list (in an order)
		System.out.println(test.displayOrderedMap());

		// printing empty lines and heading on console
		System.out.println();
		System.out.println("**Applying arithmetic operations on list values");
		System.out.println();

		// calculate the average and display it on the console
		System.out.println(test.calculateAverage());

	    }
}
