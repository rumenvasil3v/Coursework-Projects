package lab_5;

public class BrainTeaser {
	
	public static void main(String[] args) {
		// Using for loop
		int parityPattern = 2;
		int endPoint = 4;

//		for (int i = 1; i <= 6; i++) {
//			int counter = 0;
//			
//			for (int j = i; counter < endPoint; counter++) {
//				
//				if (counter == 3) {
//					System.out.print(j);
//					break;
//				}
//				
//				System.out.print(j + " ");
//				j += parityPattern;
//			}
//			
//			System.out.println();
//		}
		
		// Using while loop
		for (int i = 1; i <= 6; i++) {
			int counter = 0;
			int j = i;
			
			while (counter < endPoint) {
				
				if (counter == 3) {
					System.out.print(j);
					break;
				}
				
				System.out.print(j + " ");
				
				j += parityPattern;
				counter++;
			}
			
			System.out.println();
		}
	}
}
