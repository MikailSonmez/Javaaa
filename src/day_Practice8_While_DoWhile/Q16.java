package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		  // --------GÝRÝLEN SAYININ BASAMAKLARINDAKÝ RAKAMLARIN TOPLAMINI BULUNUZ.


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayý giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;
        
        do {
			toplam += sayi%10;
			sayi =sayi/10;
			System.out.println("basamagin toplami = " + toplam + "kalan sayi " + sayi);
		} while (sayi > 0);
        System.out.println("toplam = " + toplam);
        sc.close();
	}

}
