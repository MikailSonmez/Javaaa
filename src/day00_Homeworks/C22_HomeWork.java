package day00_Homeworks;

import java.util.Scanner;

public class C22_HomeWork {

	public static void main(String[] args) {
		// sayfa 154
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		
		do {
			System.out.println("Lutfen toplamak uzere sayilar girin");
			if (toplam>=500 || sayac>=10) {
				System.out.println("bu kadar sayi yeter" + "");
				break;
			}
				
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		} while (toplam<500 || sayac<10);
		
		System.out.println((sayac) + " adet sayi girdin, toplami " + toplam);
		
			scan.close();
	}

}


