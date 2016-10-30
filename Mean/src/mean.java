//Curtis Collins

import java.util.Scanner;

public class mean {

	public static void main(String[] args) {
		
		double average = mean();
		System.out.println(average);
	}



public static double mean() {
	
	final Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number");
	
	final double no1 = input.nextDouble();
	
	System.out.println("Enter second number");
	
	final double no2 = input.nextDouble();
	
	final double mean = Math.sqrt(no1*no2);
	
	return mean;
	
	}
}