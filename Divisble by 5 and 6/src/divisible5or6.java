//Curtis Collins

import java.util.Scanner;

public class divisible5or6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int entry = in.nextInt();
		
		boolean div5 = (entry % 5 == 0);
		boolean div6 = (entry % 6 == 0);
		
		if (div5 && div6) {
			System.out.println("The number is divisible by 5 and 6.");
		}
		else {
			if (div5) {
				System.out.println("This number is divisible by 5.");
			}
			else {
				if (div6) {
					System.out.println("This number is divisible by 6.");
				}
				else {
					System.out.println("This number is not divisible by 5 or 6.");
				}
			}
		}
		
	}

}
