//Curtis Collins

import java.util.Scanner;

public class feetToMeters {

	public static void main(String[] args) {
		
		System.out.println("Enter a distance in feet");
		
		double feet;
		
		Scanner input = new Scanner(System.in);
		
		feet = input.nextDouble();
		
		double meters = (feet * .305);
		
		System.out.println("This is " + meters + " meters");
		
		
	}

}
