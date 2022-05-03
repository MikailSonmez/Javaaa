package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*  Problem Tanýmý
        Kullanýcýdan bir tarihi gün, ay ve yýl þeklinde alýp bu tarihi
        ay, gün, yýl ve yýl, ay, gün sýralarýna çevirerek yazan bir kod yazýnýz.
    ipucu: her else komutundan sonra return; komutu kullanýnýz...
        Örnek Ekran Çýktýsý
        Lütfen günü giriniz: 10
        Lütfen ayý giriniz: 02
        Lütfen yýlý giriniz: 2009
        Gün ay yýl: 10.02.2009
        Ay gün yýl: 02.10.2009
        Yýl ay gün: 2009.02.10
        */
		
		Scanner scan = new Scanner(System.in);
		
		int gun;
		int ay;
		int yil;
		
		System.out.println("Tarihi gun,ay,yil olarak istenen sekilde giriniz...");
		
		System.out.println("Gun: ");
		gun = scan.nextInt();
		
		if (gun>0 && gun<=31) {
			System.out.println(gun);
		} else {
			System.out.println("Yanlis giris yaptiniz.Program sonlaniyor...");
			return;
		}
		
		System.out.println("Ay: ");
		ay = scan.nextInt();
		
		if (ay> 0 && ay<=12) {
			System.out.println(ay);
		} else {
			System.out.println("Yanlis giris yaptiniz. Program sonlaniyor...");
			return;
		}
		
		System.out.println("Yil: ");
		yil  = scan.nextInt();
		
		if (yil>0) {
			System.out.println(yil);
		} else {
			System.out.println("Yanlis giris yaptiniz.Program sonlaniyor...");
			return;
		}
		
		System.out.println("Ay/Gun/Yil : " + ay + "/" + gun + "/" + yil);
		System.out.println("Yil/Ay/Gun : " + yil + "/" + ay + "/" + gun);
		
		scan.close();
	}

}
