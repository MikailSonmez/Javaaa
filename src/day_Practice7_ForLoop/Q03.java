package day_Practice7_ForLoop;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
        Girilen bir stringdeki a harfi sayýsýný bulunuz.
        ama  c harfine  gelirse döngüden çýkýlsýn
        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */
		
		 Scanner scan = new Scanner(System.in);
	        System.out.print("bir metin giriniz : ");
	        String str = scan.nextLine();
	        
	        int aMiktar = 0;
	        for (int i = 0; i < str.length(); i++) {
					if (str.toLowerCase().charAt(i) == 'a') {
						aMiktar++;
					} else  if(str.toLowerCase().charAt(i) == 'c'){
						break;
					}
			}
	        
	System.out.println("girdiginiz metindeki c karakterina kadar olan a karakter sayisi : " + aMiktar );
	
	scan.close();
	}

}
