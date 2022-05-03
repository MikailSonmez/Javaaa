package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/*
		 * kullaniciya kac sayi toplamak istedigini sorun.
		 * kullanici 2,3 veya 4 degerini girerse,
		 * kullanicidan bu sayilari girmesini isteyin
		 * ve sayilarin toplamini yazdirin.
		 * kullanici toplamak istedigi sayi adededini 4'den buyuk girerse
		 * "cok sayi girdiniz, ben toplayamam" yazdirin.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen toplamak istediginiz sayi adedeini 2,3,4 den biri olarak secin");
		
		int tercih=scan.nextInt();
		if (tercih>4) {
			tercih=5;
		}
		
		switch (tercih) {
		case 2:
			ikiSayiTopla();
			break;
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
		case 5:
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		default:
			System.out.println("gercersiz tercih");
			
			scan.close();
		}	

	}

	private static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort sayi girin \nHer sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.println("Girdiginiz 4 sayinin toplami: : " + (sayi1+sayi2+sayi3+sayi4));
		scan.close();
		
		
	}

	private static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc sayi girin \nHer sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		System.out.println("Girdiginiz 3 sayinin toplami: : " + (sayi1+sayi2+sayi3));
		scan.close();
		
	}

	private static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin \nHer sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Girdiginiz 2 sayinin toplami: : " + (sayi1+sayi2));
		scan.close();
		
	}

}
