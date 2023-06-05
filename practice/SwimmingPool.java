package practice;
import java.util.*;

public class SwimmingPool {
 static Scanner getNum = new Scanner(System.in);
 
	public static void main(String[] args) {
        double adult = 35.5;
        int child = 12;
        int numOfChildren;
        int numOfAdults;
        
        
        System.out.println("Please enter the number of adults:  ");
        numOfAdults = getNum.nextInt();
        double sumAdults = adult * numOfAdults;
        
        System.out.println("Please enter the number of children:  ");
        numOfChildren = getNum.nextInt();
        int sumChildren = child * numOfChildren;
        double sum = sumAdults + sumChildren;
		System.out.println("The price for the children is " + sumChildren + " and the price for the adults is " + sumAdults + " the total price is " + sum + ".");

	}

}
