package day00_Homeworks;

import java.util.Scanner;

public class C16_HomeWork {

	public static void main(String[] args) {
		// sayfa 135
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isim ve soyiminizi girin \nisimden sonra enter'a basin");
		
		String isim=scan.next();
		String soyisim=scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1"
				+ "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basin");
		
		int tercih=scan.nextInt();
		
		String birlesmisIsim=null; // Emrah Saglam, E**** S*****
		
		if (tercih==1) {
			birlesmisIsim= acikIsim(isim,soyisim);
		} else if(tercih==2){
			birlesmisIsim=gizliIsim(isim,soyisim);
		}else {
			System.out.println("Lutfen 1 veya 2 secin");
		}
		
		// bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli
		// olarak kaydedildi
		
		System.out.println("kullanicinin tercihi : " + birlesmisIsim);
		scan.close();
		
	}

	private static String gizliIsim(String isim, String soyisim) {
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim+ " "+soyisim;
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim+ " "+soyisim;
	}

}
