//Curtis Collins

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input number of students.");
		int students = input.nextInt();
		
		int highscore = 1;
		int loops = 0;
		int score = 1;
		String studentName = null;
		
		while (loops < students) {
			
			System.out.println("Please enter score");
			score = input.nextInt();
			if (score > highscore) {
				highscore = score;
				System.out.println("Please enter student's name");
				studentName = input.next();
			}
			loops++;
		}
		System.out.println(studentName);
		System.out.println(highscore);
		
	}

}
