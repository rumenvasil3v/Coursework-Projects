package lab_3;

public class Mail {
	private User sender = null;
	private User recipient = null;
	private String message;
	
	public Mail(User sender, User recipient, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}
	
	public User getSender() {
		return this.sender;
	}
	
	public User getRecipient() {
		return this.recipient;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	private void isEmpty() {
		if (this.getMessage() == null || this.getMessage() == "") {
			this.message = "** Something went wrong! **";
		}
	}
	
	public void print() {
		System.out.println("From: " + this.getSender());
		System.out.println("To: " + this.getRecipient());
		
		// check whether the message is empty or null
		this.isEmpty();
		
		System.out.println("Message: " + this.getMessage());
	}
}
