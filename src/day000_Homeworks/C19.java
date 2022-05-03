package day000_Homeworks;

import java.util.Scanner;

public class C19 {

	public static void main(String[] args) {
		/*
		 Ask user enter a positive number and check if it is prime or not
		 Kullanicidan pozitif bir sayi girmesini isteyin ve asal olup olmadigini kontrol edin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Asal sayi kontrolu icin bir sayi giriniz");
		int prime =scan.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("girdiginiz sayi asaldir");
		} else {
			System.out.println("girdiginiz sayi Asal degildir");
		}
		scan.close();
	}

}
