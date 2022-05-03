package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		 // Kullanýcýdan 5 sayý isteyiniz, bu sayýlardan en büyüðünü bularak yazdýrýnýz.
        Scanner scan = new Scanner(System.in);
        
        int enbSayi = 0;
        int count =0;
        
        while (count<5) {
			System.out.println("sayi giriniz : ");
			int sayi = scan.nextInt();
			if (sayi>enbSayi) {
				enbSayi = sayi;
				
			}
			count++;
		}
        System.out.println("enbuyuk sayi : " + enbSayi);
        
        scan.close();
	}

}
