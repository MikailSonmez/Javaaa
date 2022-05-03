package day_Practice7_ForLoop;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		 /*
	     * SORU 1 Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak
	     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin. Input : 30 40
	     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
	     */
		
		 Scanner scan = new Scanner(System.in);
	    System.out.println(" Lutfen OBEB ve OKEK hesabý için ilk sayýyý giriniz \nikinci sayýyý icin enter e basiniz");
	    
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
	    System.out.println(a + " ve " + b + " sayýlarý için OBEB=" + obeb);
        System.out.println(a + " ve " + b + " sayýlarý için OKEK=" + okek);
        
        scan.close();
	}

}
