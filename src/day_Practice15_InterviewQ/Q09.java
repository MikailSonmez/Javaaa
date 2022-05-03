package day_Practice15_InterviewQ;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		 /*
        Ask user enter a positive number and check if it is prime or not
        Kullanýcýdan pozitif bir sayý girmesini isteyin ve asal olup olmadýðýný kontrol edin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        boolean dividable = true;
        
        for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				dividable = false;
				break;
			}
		}
        
        if (dividable) {
			System.out.println("it is prime");
		} else System.out.println("it is not prime");
        
        
        scan.close();

	}

}
