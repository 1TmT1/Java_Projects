package practice;
import java.util.*;
public class UmbrellaFacility {
    static Scanner getNum = new Scanner(System.in);
	public static void main(String[] args) {
		double hanacha = 0.9;
		int numOfUmbrellas;
		double price;
		double sum;
		double sumAfter;
		
		System.out.println("Please enter the price for one umbrella:  ");
		price = getNum.nextDouble();
		
		
		System.out.println("Please enter the amount of umbrellasthat you are buying:  ");
		numOfUmbrellas = getNum.nextInt();
		
		
		sum = price * numOfUmbrellas;
		sumAfter = price * numOfUmbrellas * hanacha;
		
		System.out.println("The price before the hanacha is " + sum + " and the price after the hanacha is " + sumAfter + ".");
		
		
		
		
		

	}

}
