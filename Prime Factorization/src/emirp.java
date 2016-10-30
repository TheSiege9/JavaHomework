//Curtis Collins
public class emirp {

	public static void main(String[] args) {
		
		for (int number = 2; number < 1000; number++) {
			if (isPrime(number) == true) {
				if (isPalindrome(number) == false) {
					if (isPrime(reverse(number)) == true) {
						System.out.println(number);
						
					}
				}
			}
		}

	}
	public static boolean isPalindrome (int number) {
		int reverse = reverse(number);
		
		if (number == reverse) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime (int number) {
		
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static int reverse(int number) {
		int reverse = 0;
		
		while (number > 0) {
			reverse = reverse * 10;
			reverse = reverse + (number % 10);
			number = number / 10;	
		}
		return reverse;
	}

}
