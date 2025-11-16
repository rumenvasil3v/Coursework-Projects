package lab_3;

public class MailTest {
	
	public static void main(String[] args) {
		System.out.println();
		Email senderEmail = new Email("rv0332@surrey.ac.uk");
		User sender = new User("gd0t", senderEmail);
		
		Email recipientEmail = new Email("di0983@surrey.ac.uk");
		User recipient = new User("Dudu", recipientEmail);
		
		String message = "Hey, Di! I love you! My sweet girl!";
		
		Mail emptMail = new Mail(sender, recipient, "");
		emptMail.print();
		
		System.out.println();
		
		Mail nullMail = new Mail(sender, recipient, null);
		nullMail.print();
		
		System.out.println();
		
		Mail correctMail = new Mail(sender, recipient, message);
		correctMail.print();
		
		String hey = new String("3.14");
		System.out.println(hey);
		
		double number = (int)4.5;
		double pi = Double.parseDouble(hey);
		System.out.println(pi);
		
		String text = new String("1");
		int one = Integer.parseInt(text);
		System.out.println(one);
		
		System.out.println(number);
	}
}
