package questions;

import java.util.Scanner;

public class SwappingVariablesValues {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		System.out.println("Before swapping: " + n1 + "-" + n2);
		
		// First way: use 3rd variable:
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("After swapping: " + n1 + "-" + n2);
		
		// Second way: do not use 3rd variable
		
		n1= n1+n2;
		
		n2 = n1-n2;
		
		n1 = n1-n2;
		
		System.out.println("After second swapping: " + n1 + "-" + n2);
		
		
		scanner.close();
	}

}
