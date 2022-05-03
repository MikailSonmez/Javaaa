package day_Practice6_MethodCreation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Birimi giriniz");
		 String birim = scan.nextLine().toLowerCase();
		 System.out.println("Miktari giriniz");
		 double miktar = scan.nextDouble();
		 
		donucturucu(birim,miktar);
		 
		 scan.close();
	}

	public static void donucturucu(String birim, double miktar) {
		
		double saat = 60*60;
		double mil = 1.6;
		double kilogram = 1000;
		
		
		switch (birim) {
		case "saat":
			System.out.println(miktar * saat);
			break;
		case "mil":
			System.out.println(miktar * mil);
			break;
		case "kilogram":
			System.out.println(miktar * kilogram);
			break;

		default:
			System.out.println("saat, mil ve kilogram disinda bir birim girmeyiniz");
			
			
		}
		
		
	}

}
