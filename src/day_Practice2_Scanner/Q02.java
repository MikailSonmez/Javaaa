package day_Practice2_Scanner;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("3 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		// 1'ler basamagindaki sayiyi bulun
		
		int birler = sayi % 10;
		System.out.println("girdginiz sayinin birler basamagi " + birler);
		sayi /=10;
		
		// 10'lar basamagindaki sayiyi bulun
		
		int onlar = sayi % 10;
		System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
		
		// 100'ler basamagindaki sayiyi bulun
		
		int yuzler = sayi / 10;
		System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
		
		scan.close();

	}

}
