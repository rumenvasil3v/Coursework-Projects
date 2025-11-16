package Prime_numbers;

public class Prime {
	
	public static void main(String[] args) {
		int sum = 0;
		boolean isPrime = true;
		
		for (int i = 2; i <= 5000000; i++) {
			int counter = 2;
			
			for (int j = i; j >= 1; j--) {
				
				if (j == i || j  == 1) {
					continue;
				}
				
				if (i % j == 0) {
					isPrime = false;
					break;
				} else {
					counter++;
				}
			}
			
			if (counter == i) {
				isPrime = true;
			}
			
			if (isPrime) {
				System.out.println(i + ' ');
				sum += i;
			}
			
			counter = 0;
		}
		
		System.out.println(sum);
	}
}
