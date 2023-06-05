import java.util.Scanner;
public class Ex01 {
static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean up = false;
		boolean toGo = false;
		System.out.println("What is the current floor?  ");
		int currentFloor = reader.nextInt();
		
		System.out.println("What is the current weight?  ");
		int currentWeight = reader.nextInt();
		
		System.out.println("Someone between the doors(yes / no):  ");
		char isBetween = reader.next().charAt(0);
		
		System.out.println("What floor do you want to get?  ");
		int floorToGet = reader.nextInt();
		
		if(currentWeight > 500) {
			
			System.out.println("We can't go to the floor because the weight is over 500 kg.");
			toGo = true;
			
		}
		
		else if(isBetween == 'y') {
			System.out.println("We can't go to the floor because someone is between the doors.");
			toGo = true;
		}
		else {
			
			if(currentFloor > floorToGet) {
				
				currentFloor = currentFloor - floorToGet; 
				 up = false;
				
			}
			
			if(floorToGet > currentFloor) {
				
				
				currentFloor = (currentFloor - floorToGet) * -1;
				up = true;
			}

		}
		
		if(toGo == false) {
		if(up == false) {
			
			System.out.println("The elevator is going " + currentFloor + " floors down.");
			
		}
		
		if(up == true) {
			
			System.out.println("The elevator is going " + currentFloor + " floors up.");
			
		}
		
		}
		
		
		

	}

}
