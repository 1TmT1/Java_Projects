package checkTest;
import java.util.Scanner;
public class Ex01 {
static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter the velocity of the car  ");
		int carVelocity = reader.nextInt();
		
		System.out.println("Please enter max  ");
		int maxVelocity = reader.nextInt();
		
		System.out.println("Please enter if he passed in red (yes/no)  ");
		char c = reader.next().charAt(0);
		int money = 0;
		int counter = 0;
		if(c == 'y') {
			System.out.println("You drove in red - 1500$");
			money = money + 1500;
			counter++;
		}
		
		if(carVelocity>maxVelocity && (carVelocity - maxVelocity)>10) {
			money = money + 750;
			System.out.println("Too fast!");
			counter++;
			
		}else if (carVelocity>maxVelocity) {
			System.out.println("Too fast!");
			counter++;
			
		}
	
		
		
		if(counter == 0) {
			
			System.out.println("Good.");
		}
		System.out.println("You need to pay " + money + ".");
		

	}

}
