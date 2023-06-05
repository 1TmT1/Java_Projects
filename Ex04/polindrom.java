import java.util.*;
public class polindrom {
static Scanner getNum = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		int unit;
		int hundred;
		
		
		System.out.println("Please enter three digit number:  ");
		num = getNum.nextInt();
		
		unit = num % 10;
		hundred = num / 100;
		
		if (unit == hundred) {
			
			System.out.println("Your number is a polindrom.");
			
			
		}
		else {
			
			
			
			System.out.println("Your number isn't a polindrom.");
			
		}
		
		
		
		
		
		

	}

}
