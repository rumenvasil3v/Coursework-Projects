package ProblemSet_7b;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> moduleList;
	
	public Student(String name, String urn) {
		this.name = name;
		this.urn = urn;
		this.moduleList = new ArrayList<Module>();
	}
}
