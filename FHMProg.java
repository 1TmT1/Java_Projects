import java.util.*;

public class FHMProg {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner num = new Scanner(System.in);
		
		
		System.out.println("Please enter your first number: ");
		num1 = num.nextInt();
		System.out.println("Please enter your second number: ");
		num2 = num.nextInt();
		
		System.out.println("Here are the results: ");
		System.out.println(num1 + " + " + num2 + "=" + (num1+num2));
		System.out.println(num1 + " - " + num2 + "=" + (num1-num2));
		System.out.println(num1 + " * " + num2 + "=" + (num1*num2));
		System.out.println(num1 + " / " + num2 + "=" + (num1/num2));
		
		
		

	}

}
