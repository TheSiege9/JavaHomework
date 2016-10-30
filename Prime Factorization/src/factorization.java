//Curtis Collins

import java.util.Scanner;

public class factorization {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt(); 
		int prime = 2;
		
		while (number > prime) {
			if (number % prime == 0) {
				number = number / prime;
				System.out.println(prime);
				
			}
			else {
				prime++;
			}
				if (number == prime) {
				System.out.println(number);
			}
			
			
		}

	}

}
