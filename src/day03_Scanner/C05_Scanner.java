package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan isim ve soymini ayri ayri isteyip
		// girilen ismi asagidaki gibi yazdiririniz
		
		// girilen isim : Mikail Sonmez
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isiminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi yaziniz...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim : " + isim + " " + soyisim );
		
		scan.close();
		
	}

}
