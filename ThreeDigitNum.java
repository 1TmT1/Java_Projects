import java.util.*;

public class ThreeDigitNum {
	static Scanner GetNum = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		System.out.println("Please enter three digit number:  ");
		num = GetNum.nextInt();
		//Calculations
		int hundreds = num / 100;
		int tens = num % 100 / 10;
		int units = num % 100 % 10;
		
		System.out.println("The number of hunndreds is " + hundreds + ", the number of tens is " + tens + " and the number of units is " + units + ".");
		
		
		
		
		
	}

}
