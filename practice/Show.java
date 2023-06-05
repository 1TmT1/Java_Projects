package practice;
import java.util.*;
public class Show {
   static Scanner getNum = new Scanner(System.in);
	public static void main(String[] args) {
          int numOfStudents;
          double price;
          double sum;
          
          
          System.out.println("Please enter the number of the students:  ");
          numOfStudents = getNum.nextInt();
          
          
          System.out.println("Please enter the price of the ticket for each student:  ");
          price = getNum.nextDouble();
          
          sum = price * numOfStudents;
          
          System.out.println("The number of students is " + numOfStudents + ", the price is " + price + " and the total price is  " + sum + ".");
         
          
		
		
		
		
		
		
		
	}

}
