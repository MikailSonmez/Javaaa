package day_Practice7_ForLoop;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		 /*
	     * SORU 1 Kullan�c�dan 2 tamsay� girmesini ve ard�ndan GCD (En B�y�k Ortak
	     * B�len) ve LCM'yi (En K���k Ortak Kat) bulmas�n� isteyin. Input : 30 40
	     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
	     */
		
		 Scanner scan = new Scanner(System.in);
	    System.out.println(" Lutfen OBEB ve OKEK hesab� i�in ilk say�y� giriniz \nikinci say�y� icin enter e basiniz");
	    
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int obeb = 0;
	    int okek;
	    
	    for (int i = 1; i < a && i<=b; i++) {
			if (a %i == 0 && b %i == 0) {
				obeb = i;
			}
		}
	    
	    okek = (a*b) / obeb;
	    System.out.println(a + " ve " + b + " say�lar� i�in OBEB=" + obeb);
        System.out.println(a + " ve " + b + " say�lar� i�in OKEK=" + okek);
        
        scan.close();
	}

}
