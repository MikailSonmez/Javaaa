package day_Practice2_Scanner;

import java.util.Scanner;

public class Q03 {

	
	public static void main(String[] args) {
		
		// kullanicidan 2 tam sayi alip bu 2 tam sayinin dort islem sonucunu yazdirinz
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen 1. sayiyi giriniz");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen 2. sayiyi giriniz");
		
		double num2 = scan.nextDouble();
		
		System.out.println("Toplam : " + (num1+num2));
		System.out.println("Fark : " + (num1-num2));
		System.out.println("Carpim : " + (num1*num2));
		System.out.println("Bolum : " + (num1/num2));
		scan.close();
	}
	
}
