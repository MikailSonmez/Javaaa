package day_Practice2_Scanner;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		 /*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.
        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ucgenin a kenar uzunlugunu giriniz : ");
		int a = scan.nextInt();
		
		System.out.println("Ucgenin b kenar uzunlugunu giriniz : ");
		int b = scan.nextInt();
		
		double h = Math.sqrt((a*a) + (b*b));
		
		System.out.println("Hipotenus : " + h);
		scan.close();
	}
}
