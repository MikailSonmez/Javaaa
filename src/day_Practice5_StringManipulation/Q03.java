package day_Practice5_StringManipulation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		 //Kullanýcýdan alacaðýnýz, 3 kelimedne oluþan ismi
        // Örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi ve soyadinizi giriniz = "); // Ahmet Emin Yilmaz
		String adAd2Soyad = scan.nextLine();
		
		/*Ahmet Emin Yýlmaz
        A : adAd2Soyad.CharAt(0);
        E : 1.boþluk karakterinin indexinin 1 fazlasý
        Y : Son boþluðun indexinin 1 fazlasý */
		
		//en kisa kod:
		System.out.println(adAd2Soyad.charAt(0) + "." + adAd2Soyad.charAt(adAd2Soyad.indexOf(" ")+1) + "." + adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1) + ".");
		// A.E.Y.
		
		// 1. yontem:
		char adIlkHarf = adAd2Soyad.charAt(0);
		char ad2IlkHarf = adAd2Soyad.charAt(adAd2Soyad.indexOf(" ") + 1);
		char soyadIlkHarf = adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") + 1);
		
		// 2. yontem
		int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
		int sonBoslukIndex = adAd2Soyad.lastIndexOf(" ");
		
		ad2IlkHarf = adAd2Soyad.charAt(ilkBoslukIndex + 1);
		soyadIlkHarf = adAd2Soyad.charAt(sonBoslukIndex + 1);
		/**************************************************************/
		System.out.println(adIlkHarf + "." + ad2IlkHarf + "." + soyadIlkHarf + ".");
		
		/*
        // Kullanýcýdan alacaðýnýz, 4 kelimeden oluþan ismi
        // Örn. Ahmet Emin Yýlmaz Gül -> A.E.Y.G. formatýyla yazdýrýnýz.
        char ilkHarf = adSoyad.toUpperCase().charAt(0);
        char ikinciHarf = adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ") + 1);
        char ucuncuHarf = adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ", adSoyad.indexOf(" ") + 1) + 1);
        char dorduncuHarf = adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ") + 1);
        System.out.println(ilkHarf + "." + ikinciHarf + "." + ucuncuHarf + "." + dorduncuHarf);
        scan.close();
         */
		scan.close();
		
	}

}
