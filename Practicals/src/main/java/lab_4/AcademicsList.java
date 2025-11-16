package lab_4;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AcademicsList {
	// Add a field
	private List<String> namesList;
	// Add a default constructor
	
	public AcademicsList() {
		namesList = new ArrayList<String>();
	}

	public void addNames() {
		namesList.add("Helen");
		namesList.add("Stella");
	}
	
	public List<String> getNamesList() {
		return this.namesList;
	}

	public String displayNames() {
		String result = "";
		
		for (String name: namesList) {
			result += name; 
			result += "\n";
		}
		
		return result.trim();
	}

	public static void main(String[] args) {
		String[] array = new String[] {"Natural History", "Science"};
		AcademicsList computing = new AcademicsList();
		computing.addNames();
		System.out.println(computing.displayNames());
		System.out.println(computing.getNamesList().size());
	}
}
