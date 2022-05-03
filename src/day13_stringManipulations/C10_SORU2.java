package day13_stringManipulations;

import java.util.Scanner;

public class C10_SORU2 {

	public static void main(String[] args) {
		/*
		// kullanýcýdan býr sýfre gýrmaýsný ýsteyýn
		// asagidaki sartlari sagliyorsa "sifre basari ile tanimlandi",
		// sartlari saglamazsa "Islem basarisiz, lutfen yeni bir sifre girin" yazdirin
		- ilk harf buyuk harf olmali
		- son harf kucuk harf olmali
		- sifre bosluk icermemeli
		- sifre uzunlugu en az 8 karakter olmali
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		String sifre=scan.next();
		
		// tum eksiklikleri soylemesi icin 4 sart icin ayri ayri if yapacagim
		// basta bir flag tanimlayacagim, eger onda degisim varsa sifre basarisiz
		// degisim yoksa sifre basarili olacak
		
		int flag=0;
		// - ilk harf buyuk harf olmali
		if (!(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z')) {
			System.out.println("Sifre buyuk harfle baslamalidir");
			flag++;
		}
		// - son harf kucuk harf olmali
		if (!(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z')){
			System.out.println("son harf kucuk harf olmali");
			flag++;
		}
		// - sifre bosluk icermemeli
		if (sifre.contains(" ")) {
			System.out.println("Sifre bosluk icermemelidir");
			flag++;
		}
		// - sifre uzunlugu en az 8 karakterli olmali
		if (sifre.length()<8) {
			System.out.println("Sifre uzunlugu en az 8 karakterli olmali");
			flag++;
		}
		
		// simdi flag'i kontrol edip
		// sifre basarili mi degil mi yazdiracagim
		
		if (flag==0) {
			System.out.println("Sifre basari ile tanimlandi");
		} else {
			System.out.println("Islem basarisiz, lutfen yeni bir sifre girin");
		}
		scan.close();
	}

}
