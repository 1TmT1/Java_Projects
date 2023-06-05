package checkTest;
import java.util.Scanner;
public class Ex02 {
static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter a number  ");
		int num = reader.nextInt();
		
		int units = num%10;
		int tens = ((num%100) - units) / 10;
		int hundreds = num /100;
		int sumNum = units + tens + hundreds;
		int counter = 0;
		for (int i = 2;i<=num;i=i+2) {
			
			if((num%i)==0) {
				
				counter++;
				
				
			}
			
			
			
			
		}
		if(counter == sumNum) {
			System.out.println("Beautiful number.");
			
		}
		else {
			
			System.out.println("Ugly number.");
		}
		
		

	}

}
