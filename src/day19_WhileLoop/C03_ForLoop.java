package day19_WhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin
		// ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt(); // 345 data turu int
		
		int rakamlarToplami=0;
		int rakam=0;
		

		rakamlarToplami=0;
		String sayiStr=""+sayi; // 345 data turu String
		// int olarak verilen bir sayinin basamak sayisini bulmak istersek
		// kisa yoldan o sayiyi String'e cevirip, str.lenght() method'unu kullanabiliriz
		
		for (int i = 0; i < sayiStr.length(); i++) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
		}
		System.out.println("girdiginiz sayini rakamlar toplami : " + rakamlarToplami);

		scan.close();
	}

}
