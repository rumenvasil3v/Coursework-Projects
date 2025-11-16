package week_3_summary;

public class EntryPoint {
	
//	Needs to be public so JVM can access it
//	 Entry point for executing a java program
	 public static void main(String[] myArguments) {
		System.out.println("Hello, World!");
		
		for (String s: myArguments) {
			System.out.println(s);
		}
	}
}
