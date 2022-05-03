package day13_stringManipulations;

import java.util.Scanner;

public class C09_SORU {

	public static void main(String[] args) {
		// kullanicaidan ismini, soyismini ve kredi karti bilgisini isteyin
		// ve asagidaki gibi yazdirin
		// isim-soyisim : M****** B******
		// kart no : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		
		String isim=scan.next();
		
		System.out.println("lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("lutfen 16 karakterli KK numaranizi bosluk birakmadan yazin");
		String kkNo=scan.next();
		
		String isimFortmatli= isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
		String soyisimFormatli=soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
		String kkFortmatli= "**** **** **** " + kkNo.substring(12);
		
		System.out.println("isim-soyisim : " + isimFortmatli + " " + soyisimFormatli);
		System.out.println("kart no : " + kkFortmatli);
		
		scan.close();
		
	}
}
