//Curtis Collins

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//prompt user for grade
		System.out.print("Enter a Grade: ");
		
		//Enter a score
		double score = in.nextDouble();

		//Determine grade
		if (score >= 90.0) {
			System.out.println("You recieved an A");
		}
		
		if (score >= 80.0 && score <90.0) {
			System.out.println("You recieved a B");
		}
	
		if (score >= 70.0 && score <80.0) {
			System.out.println("You recieved a C");
		}
		
		if (score >= 60.0 && score <70.0) {
			System.out.println("You recieved a D");
		}
		
		if (score < 60.0) {
			System.out.println("You recieved a F");
		}
		
	}

}
