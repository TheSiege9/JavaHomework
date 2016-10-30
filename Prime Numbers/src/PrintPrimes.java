//Curtis Collins

public class PrintPrimes {

	public static void main(String[] args) {
		
		final int LAST_NUMBER= 1000;
		
		for (int number = 2; number <= LAST_NUMBER; number ++) {
			
			//assume number is prime
			boolean prime = true;
			
			//test possible divisors
			for (int divisor = 2; divisor < number; divisor ++) {
				if (number % divisor == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.println(number);
			}
		}
	}

}
