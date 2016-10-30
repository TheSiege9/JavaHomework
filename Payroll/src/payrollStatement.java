//Curtis Collins

import java.util.Scanner;

public class payrollStatement {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter employee name:");
		
		System.out.println("Enter amount of hours worked:");
		
		System.out.println("Enter hourly pay rate:");
		
		System.out.println("Enter federal tax:");
		
		System.out.println("Enter state tax:");
		
		String name = input.next();
		
		int hours = input.nextInt();
	
		double payrate = input.nextDouble();
		
		double gross = payrate * hours;
		
		double federal = gross * input.nextDouble();
		
		double state = gross * input.nextDouble();
		
		double total = state + federal;	
		
		double net = gross - total;
		
		System.out.println("Employee name: " + name);
		
		System.out.println("Hours worked: "+ hours);
		
		System.out.println("Hourly wage: " + payrate);
		
		System.out.println("Federal tax: " + federal);
		
		System.out.println("State tax: " + state);
		
		System.out.println("Total tax: " + total);
		
		System.out.println("Gross: "+ gross);
		
		System.out.println("Net income: " + net);
		
	}

}
