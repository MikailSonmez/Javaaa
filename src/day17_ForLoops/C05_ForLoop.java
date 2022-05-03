package day17_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {
	public static void main(String[] args) {
		/*
		 * kullanicidan iki sayi isteyin
		 * girilen sayilar ve aralarindaki tum sayilari toplayip,
		 * sonucu yazdiran bir program yazin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen aradaki tum sayilari toplamak icin iki tam sayi girin yazin");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		int kucuk=0;
		int buyuk=0;
		
		if (sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
		}else {
			buyuk=sayi2;
			kucuk=sayi1;
		}
		
		int toplam=0;
		
		for (int i = kucuk; i <= buyuk; i++) {
			
			toplam+=i;
			
		}
		System.out.println("Girilen sayilar ve aralarindaki sayilarin toplami : " + toplam);
		
		scan.close();
	}
}
