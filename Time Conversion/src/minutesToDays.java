//Curtis Collins

import java.util.Scanner;

public class minutesToDays {

	public static void main(String[] args) {
		System.out.println("Enter a time in minutes.");
		
		int minutes;
		
		Scanner input = new Scanner(System.in);
		
		minutes = input.nextInt();
		
		int hours;
		
		hours = minutes / 60;
		
		int days;
		
		days = hours / 24;
		
		int years; 
		
		years = days / 365;
	
		days = days % 365;
		
		
		
		System.out.println("This is " + years + " years and " + days + " days.");
		
		
		
	}

}
