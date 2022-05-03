package day_Practice4_SwitchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
	// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
	// 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 aras� - C   3. 60(dahil) ile 80 aras� - B  4. 80(dahil) ustu- A
	// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
	// switch() kullanarak yapiniz.	
	// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	// switch() de int, byte, short, char, String kullanilir.
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Notunuzu giriniz : ");
		int not = scan.nextInt();
		String note = scan.nextLine();
		
		if (not>=0 && not<50) {
				// not = 0;
			note="kaldin";
		} else	if (not>=50 && not<60) {
			//not = 50;
			note="ucuz yirttin";
		} else if (not>=60 && not<80) {
			// not 60;
			note="basarili";
		} else if (not>=80 && not<=100) {
			// not = 80;
			note= "gayet basarili";

		}
		switch (note) {
		case "kaldin":
			System.out.println("D");
			break;
		case "ucuz yirttin":
			System.out.println("C");
			break;
		case "basarili":
			System.out.println("B");
			break;
		case "gayet basarili":
			System.out.println("A");
			break;
	    default:
	    	System.out.println("Gecerli not giriniz");
	    	break;
		}
		scan.close();
	}

}
