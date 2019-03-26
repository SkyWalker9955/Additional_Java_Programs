import java.util.*;

public class AreaOfPentagon {
  
	public static void main(String[] args) {
		
		// s is a length of the side 
		// r is radius
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for radius: ");
		
		//establish vars and formulas 
		double r = input.nextDouble();
		double s = (2* r * Math.sin(Math.PI/5));
		double area = ((5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5))); 
		
		System.out.printf("The area is %4.2f", area);
	}
}