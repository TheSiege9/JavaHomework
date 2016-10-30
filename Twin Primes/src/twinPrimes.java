//Curtis Collins

public class twinPrimes {

	
	public static void main(String[] args) {
		
		for (int number = 2; number < 1000; number++) {
			if (isPrime(number) == true) {
				if (isTwinPrime(number) == true){
					System.out.println(number);
					System.out.println(number + 2);
				}
					
			}
		}
		
		
	}
	
	
	public static boolean isPrime (int number) {
		
		for (int divisor = 2; divisor < number; divisor++ ) {
			if (number % divisor == 0) {
				return false;
			}
		
			}
		return true;
		}
	
	public static boolean isTwinPrime (int number) {
		int newNumber = number +2;
		for (int divisor =2; divisor < newNumber; divisor++) {
			if (newNumber % divisor == 0) {
				return false;
			}		
		}
		return true;
	}
	
	}