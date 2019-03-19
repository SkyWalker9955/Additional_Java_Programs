import java.util.*;

public class GreatCircleDistance {
  
	public static void main(String[] args) {
	
	//latitude (x) and longitude (y) of two points
	double x1, y1, x2, y2;
	
	//Earth radius in km 
	double r = 6371.01;
	
	//Input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the latitude and longitude of the first point");
	x1 = input.nextDouble();
	y1 = input.nextDouble();
		
	System.out.println("Enter the latitude and longitude of the second point");
	x2 = input.nextDouble();
	y2 = input.nextDouble();
		
	// d is great circle distance 
	double d;
	d = r * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) 
		+ Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
		Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
	
	//Output 
	System.out.printf("The distance between two points is: %4.4f", d);
	
	input.close();
	
	}

}
