package day05_matematikselislemler;

import java.util.Scanner;

public class C05_Modules {

	public static void main(String[] args) {
		
		// Kullanicidan 6 basamakli bir sayi alip
		// rakamlar toplamini yazdirin
				
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 6 basamakli bir sayi giriniz");
		int sayi= scan.nextInt();
				
		int rakamlarToplami=0;
		int rakam=sayi%10; 
		rakamlarToplami+=rakam; 
		sayi/=10;
				
		// bu islemi basamak sayisi kadar
		// tekrar edersek rakamlar toplamini buluruz
				
		rakam=sayi%10; 
		rakamlarToplami+=rakam; 
		sayi/=10;
				
		rakam=sayi%10; 
		rakamlarToplami+=rakam; 
		sayi/=10;
				
		rakam=sayi%10; 
		rakamlarToplami+=rakam; 
		sayi/=10;
				
		rakam=sayi%10; 
		rakamlarToplami+=rakam; 
		sayi/=10;
				
		rakam=sayi%10; 
		rakamlarToplami+=rakam; 
		sayi/=10;
				
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		
		scan.close();
				
	}

}
