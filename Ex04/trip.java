import java.util.*;
public class trip {
static Scanner getNum = new Scanner(System.in);
	public static void main(String[] args) {
		int cls;
		int cls1;
		int cls2;
		int sum;
		int buses;
		int mbuses;
		
		System.out.println("Please enter number of students in first class:  ");
		cls = getNum.nextInt();
		
		System.out.println("Please enter number of students in second class:  ");
		cls1 = getNum.nextInt();
		
		System.out.println("Please enter number of students in third class:  ");
		cls2 = getNum.nextInt();
		
		
		sum = cls + cls1 + cls2;
		
		buses = sum / 40;
		mbuses = sum % 40;
		
		if(mbuses == 0) {
			
			System.out.println("You are need " + buses + " buses.");
			
			
			
		}
		else {
			
			buses = buses + 1;
			
			System.out.println("You are need " + buses + " buses.");
			
			
		}
		
		

	}

}
