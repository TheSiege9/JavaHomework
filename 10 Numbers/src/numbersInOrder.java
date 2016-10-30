//Curtis Collins

import java.util.Scanner;

public class numbersInOrder {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++)  {
			System.out.println("Please enter a number.");
			numbers[i] = in.nextInt();
		}
		
		for (int i = 9; i > -1; i--) {
			System.out.println(numbers[i]);
		}
		
	}

}
