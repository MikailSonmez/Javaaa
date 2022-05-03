package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		  /*  Problem Tanýmý
        Verilen bir sayýnýn faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazýnýz.
        Örnek Ekran Çýktýlarý
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720
        Bir sayý giriniz: 3*2*1
        Faktöriyeli 6
     */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz : ");
		int sayi = scan.nextInt();
		
		int faktoriyel=1;
		
		while (sayi>0) {
			faktoriyel*=sayi;
			sayi--;
		}
		System.out.println("faktoriyel : "+faktoriyel);

		scan.close();
	}

}
