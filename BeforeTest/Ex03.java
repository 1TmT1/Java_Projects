import java.util.Scanner;


public class Ex03 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int countAllWorks = 0;
		int countAllNoWorks = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println("How many works:  ");
			int works = reader.nextInt();
			
			int avg;
			int grade;
			int sumGrade = 0;
			if (works >= 1) {

				System.out.println("What is the grade of the first work?  ");
				grade = reader.nextInt();
				sumGrade = sumGrade + grade;
				
			}  if (works >= 2) {

				System.out.println("What is the grade for the second work?");
				grade = reader.nextInt();
				sumGrade = sumGrade + grade;
				
			}  if (works >= 3) {
				System.out.println("What is the grade for the third work?");
				grade = reader.nextInt();
				sumGrade = sumGrade + grade;
				
			}  if (works >= 4) {
				System.out.println("What is the grade for the forth work?");
				grade = reader.nextInt();
				sumGrade = sumGrade + grade;
				
			}  if (works == 5) {

				System.out.println("What is the grade for the fifth work?");
				grade = reader.nextInt();
				sumGrade = sumGrade + grade;
				countAllWorks++;
				
				
			}  if (works == 0) {
				avg = 0;
				countAllNoWorks++;
			}
			
			if(works != 0) {
			avg = sumGrade / works - 25 * (5-works);
			System.out.println("Your average is " + avg + ".");
			}
		}//for
		
		System.out.println("The number of students that did all the works is " + countAllWorks + ".");
		
		System.out.println("The number of students that didn't do all the works is " + countAllNoWorks + ".");
		
		
		

	}
}