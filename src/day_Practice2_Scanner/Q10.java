package day_Practice2_Scanner;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

		// formula

		    // c = (f-32)*5/9
		
		Scanner scan = new Scanner(System.in);
		System.out.println("fahrenayt degerini giriniz : ");
		
		int f = scan.nextInt();
		System.out.println("girdiginiz fahrenayt degerinin santigrad derecesi : " + (f - 32) * 5 / 9);
		
		scan.close();
	}

}
