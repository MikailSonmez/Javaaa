package day_Practice5_StringManipulation;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		 // Kullan�c�dan tek seferde alaca��n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�r�n�z,
        // ad ayr� soyad ayr� sekilde ekrana yazd�r�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lufen adinizi ve soyadinizi giriniz = ");
		String adSoyad = scan.nextLine();
		
		// Ahmet yilmaz substring(baslangic index, e kadar - dahil degil)
		
		String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
		String soyad = adSoyad.substring(adSoyad.indexOf(" ")+ 1);
		
		System.out.println("ad = " + ad); // ad = mikail
		System.out.println("Soyad = " + soyad); // soyad = sonmez
		
		scan.close();

	}

}
