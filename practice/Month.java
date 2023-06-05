package practice;
import java.util.*;
public class Month {
 static Scanner getNum = new Scanner(System.in);
	public static void main(String[] args) {
      int getDays;
      int months;
      int days;
      
      System.out.println("Please enter number of days:  ");
      getDays = getNum.nextInt();
      
      months = getDays / 30;
      days = getDays % 30;
      
      System.out.println("The number of the months is " + months +" and the number of the days is " + days + ".");
      
      
		
		
		
		
		
		
		
		
	}

}
