package practice;
import java.util.*;
public class Week {
  static Scanner getNum = new Scanner(System.in);
	public static void main(String[] args) {
     int getDays;
     int weeks;
     int days;
		
		System.out.println("Please enter number of days:  ");
		getDays = getNum.nextInt();
		
		weeks = getDays / 7;
		
		days = getDays % 7;
		
		System.out.println("The numbers of weeks are " + weeks + " and the numbers of the days is " + days + ".");
		
		
		
		
		
		
	}

}
