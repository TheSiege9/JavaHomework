//Curtis Collins

import java.util.Scanner;

public class DetermineTriangle {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Input Side a: ");
		
		double edgeA = userInput.nextDouble();
		
		System.out.println("Input Side b: ");
		
		double edgeB = userInput.nextDouble();
		
		System.out.println("Input Side c: ");
		
		double edgeC = userInput.nextDouble();
		
		
		if (edgeA + edgeB <= edgeC) {
			System.out.println("This is not a triangle");
		}
		else {
			if (edgeA + edgeC <= edgeB){
				System.out.println("This is not a triangle");
			}
				else {
					if (edgeB + edgeC <= edgeA){
						System.out.println("This is not a triangle");
					}
					else { 
						System.out.println("This is a triangle.");
					}
		
				}
				}
				}
}
