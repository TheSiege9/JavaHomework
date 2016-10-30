import java.util.Scanner;


public class AltGrades {

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
			else {
				if (score >= 80.0){
					System.out.println("You recieved a B");
				}
					else {
						if (score >= 70.0){
							System.out.println("You recieved a C");
						}
						else {
								if (score >= 60.0){
									System.out.println("You recieved a D");
								}
								else {
									if (score < 60.0){
										System.out.println("You recieved an F");
									}
									}
								
							}
						
						}
					}
				}
			
	}


