//Curtis Collins

import java.util.Scanner;

public class threes {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int[] numbers = new int[6];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a number");
			numbers[i] = in.nextInt();
		}
		
		int threes = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 3) {
				threes++;
			}
		}
		
		boolean consecutiveThrees = false;
		int lastEntry = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 3 && lastEntry == 3) {
				consecutiveThrees = true;
			}
			lastEntry = numbers[i];
		}
		
		if (threes == 3 && consecutiveThrees == false) {
			System.out.println("You have three 3s and they are not consecutive.");
		}
		else {
			System.out.println("You don't have three 3s or you have consecutive 3s.");
		}
	}

}
