//Curtis Collins

import java.util.Scanner;


public class poundsToKilograms {
public static void main(String[] args) {

	System.out.println("Enter a mass in pounds");
	
	double pounds;
	
	Scanner input = new Scanner (System.in);
	
	pounds = input.nextDouble();
	
	double Kg = (pounds * .454);
	
	System.out.println("This is " + Kg + " kilograms");
	
	}

}
