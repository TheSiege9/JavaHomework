//Curtis Collins


import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
      System.out.println("Enter a temperture in Fahrenheit");
	
      double fahrenheit;	     
	
      Scanner input = new Scanner(System.in);
      
      fahrenheit = input.nextDouble();
      
      double celcius = (fahrenheit - 32)*(5.0/9.0);
      
      System.out.println("This is " + celcius + " degrees celcius");
      
      
      
      
   
      
      
	}
	

}
