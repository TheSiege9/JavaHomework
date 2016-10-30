//Curtis Collins

import java.util.Scanner;
public class determiningUPC {

	public static void main(String[] args) {
		if (isValidUPC()== true) {
			System.out.println("This is a valid UPC code.");
		}
		else {
			System.out.println("This is not a valid UPC code.");
		}
	}
	
	public static boolean isValidUPC () {
		System.out.println("Please enter UPC code.");
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		int checkDigit = (int) (a % 10);
		long number = a / 10;
		int digit11= (int) (number % 10);
		number = number / 10;
		int digit10 = (int) (number % 10);
		number = number / 10;
		int digit9 = (int) (number % 10);
		number = number / 10;
		int digit8 = (int) (number % 10);
		number = number / 10;
		int digit7 = (int) (number % 10);
		number = number / 10;
		int digit6 = (int) (number % 10);
		number = number / 10;
		int digit5 = (int) (number % 10);
		number = number / 10;
		int digit4 = (int) (number % 10);
		number = number / 10;
		int digit3 = (int) (number % 10);
		number = number / 10;
		int digit2 = (int) (number % 10);
		number = number / 10;
		int digit1 = (int) (number % 10);
		
		int odds = digit1 + digit3 + digit5 + digit7 + digit9 + digit11;
		odds = odds * 3;
		int evens = digit2 + digit4 + digit6 + digit8 + digit10;
		int check = odds + evens;
		int compare = check % 10;
		compare = 10 - compare;
		if (compare != 0){
			if (compare == checkDigit) {
				return true;
			}
		}
		return false;
	}

}
