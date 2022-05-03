package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		  /*
        Girilen bir sayýya kadar olan sayýlardan sadece tek olanlarýný ekrana yazdýrýnýz.
         girilen sayý dahil
        */
		 Scanner oku = new Scanner(System.in);
	       System.out.print("sayý giriniz =");
	       int sayi = oku.nextInt(); // 5
	       
	       // sayi--; bu sekilde sayinin kendisi isleme girmez
	       
	      
	       while (sayi>0) {
			if (sayi%2 ==1) {
				System.out.println(sayi);
				sayi --;
				
			}
			
		}
	     
	      
oku.close();
	}

}
