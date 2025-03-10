package day_Practice7_ForLoop;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*
        Bir sayinin m�kemmel olup olmadi�ini bulan bir program yaziniz.
        M�kemmel sayi : bir sayinin kendisi hari� b�lenlerinin toplam�, kendisine e�itse o sayi m�kemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (M�kemmel)
                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et
        */
		
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Lutfen bir sayi giriniz : ");
	        int sayi = scan.nextInt();
	        
	     System.out.println(chechPerfectNumber(sayi));
	     boolean flag;
	     flag = chechPerfectNumber(sayi);
	     System.out.println(flag);
	     
	     String result = chechPerfectNumber(sayi) ? "Sayi mukemmel sayidir" : "sayi mukemmel sayi degildir";
	     System.out.println(result);
	     
	     scan.close();
	}

	private static boolean chechPerfectNumber(int sayi) {
		
		int toplam = 0;
		boolean flag = false; // durum kontrolu (acik kapali gibi) "flag ismi bir onem arzetmiyor"
		for (int i = 1; i < sayi; i++) {
			if (sayi %i == 0) {
				toplam = toplam + i; // toplam += i;
			}
	
		}
		if (toplam == sayi) {
			flag = true;
		}
		return flag;
	}

}
