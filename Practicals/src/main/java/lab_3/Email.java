package lab_3;

public class Email {
	private static final String DEFAULT_ADDRESS = "unknown@unknown";
	private String emailAddress = DEFAULT_ADDRESS;
	
	public Email(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
