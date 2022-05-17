package questions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer to check if it is prime or not");
		int number = scanner.nextInt();
		
		primeCalculator(number);
		scanner.close();
	}
	
	public static void primeCalculator(int number) {
		int counter = 0;
		if (number>0) {
			
			for (int i =1; i <=number; i++) {
				if (number%i==0) {
					counter++;
				}
			}
			if (counter==2) {
				System.out.println(number + " is prime number");
			}else {
				System.out.println(number + " is not prime number");
			}
		} else {
			System.out.println("Enter positive integer");
		}
	}
}
