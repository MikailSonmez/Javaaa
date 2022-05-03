package day_Practice2_Scanner;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		 /*  Problem Tanýmý
        Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi yapan kodu yazýnýz
        a'nýn karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çýktýsý
        a sayýsýný giriniz: 5
        b sayýsýný giriniz: 3
        c sayýsýný giriniz: 1
        sonuç : 5.333333333333333
        */
		
		Scanner oku = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("a: ");
		a = oku.nextDouble();
		
		System.out.println("b: ");
		b = oku.nextDouble();
		
		System.out.println("c: ");
		c = oku.nextDouble();
		
		double toplam = (((a*a) - (b*b)) / (3*c));
		System.out.println("Sonuc : " + toplam);
		
		oku.close();
	}
}
