import java.util.*;
public class ch {
static Scanner getNum = new Scanner(System.in);   
	public static void main(String[] args) {
		int price = 5;
		int sell = 10;
		int bought;
		int sells;
		int sum;
		
		System.out.println("Please enter how many chocolate packages did you sell:  ");
		sells = getNum.nextInt();
		
		System.out.println("Please enter how many packages did you bought:  ");
		bought = getNum.nextInt();
		
		sum = sells * sell - bought * price;
		
		if(sum > 0) {
		System.out.println("You made it :-)");
		
		}	
		else {
			
			System.out.println("You are loosing money...");
			
		}
		
		
		
		
		

	}

}
