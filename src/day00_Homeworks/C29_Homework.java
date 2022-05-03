package day00_Homeworks;

import java.util.Scanner;

public class C29_Homework {

	public static void main(String[] args) {
		
		// Question even or odd number
		
		Scanner scan= new Scanner (System.in);
		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir");
		} else {
			System.out.println("girdiginiz sayi tek sayidir");
		}
		scan.close();

	}

}
