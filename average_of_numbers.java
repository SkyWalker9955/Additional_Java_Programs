import java.util.*; 

public class average_of_numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		//variables  
		int counter = 0, positive = 0, negative = 0, total = 0, i = 0;
		
		//prompt
		System.out.println("Enter values as many integer numbers you want. \nEnter 0 to finish the program.");
		
		//condition 
		while ((i = input.nextInt()) != 0) {
			total += i;
			counter++;
			if (i > 0) { 
				positive ++;
			} 
			else if (i < 0) {
				negative ++;
			}
			
		}
		float average = total / (float)counter;
		System.out.println("The total is " + total);
		System.out.println("Amount of positive integers is " + positive);
		System.out.println("Amount of negative integers is " + negative);
		System.out.println("The average is " + average);
		
		input.close();
	}

}
