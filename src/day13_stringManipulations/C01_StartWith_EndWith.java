package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartWith_EndWith {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir kelime alin
		// verilen cumlenin verilen kelime(char squence) ile baslayip, baslamadigini
		// ve bitip bitmedigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen kelime giriniz");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile basliyor");
		} else {
			System.out.println("girilen cumle " + kelime + " ile baslamiyor");
		}
		
		
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile bitiyor");
		} else {
			System.out.println("girilen cumle " + kelime + " ile bitmiyor");
		}
		scan.close();
	}

}
