package ProblemSet_6a;

import java.util.regex.Pattern;

public class Supplier {
	private String name;
	private String phone;
	
	public Supplier(String name, String phone) throws IllegalArgumentException {
		this.name = name;
		
		boolean isPhoneValid = Pattern.matches("01483-[0-9]{6}|01483[0-9]{6}", phone);
		
		if (isPhoneValid) {			
			this.phone = phone;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	@Override
	public String toString() {
		return this.name + "(" + this.phone + ")";
	}
}
