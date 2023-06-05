import java.util.*;
public class mashkia {
static Scanner getNum = new Scanner(System.in);
	public static void main(String[] args) {
		
		double january;
		double february;
		double march;
		double sum;
		double avg;
		
		
		System.out.println("How much precipitation fell in january:  ");
		january = getNum.nextDouble();
		
		System.out.println("How much precipitation fell in february:  ");
		february = getNum.nextDouble();
		
		
		System.out.println("How much precipitation fell in march:  ");
		march = getNum.nextDouble();
		
		sum = march + february + january;
		
		avg = sum / 3;
		
		if (avg > 100) {
			
			System.out.println("very rainy.");
			
			
		}
		else {
			
			System.out.println("rainy.");
			
			
		}
		
		
	}

}