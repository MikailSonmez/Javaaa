package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayilar isteyin
		// sayi adedi 10'u gecerse veya toplam 500'u gecerse
		// "Bu kadar sayi yeter"
		// ".. adet sayi girdin, toplami" yazdirin
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		
		
		while (toplam<500 || sayac<10) {
			System.out.println("Lutfen toplamak uzere sayilar girin");
			if (toplam>=500 || sayac>=10) {
				System.out.println("bu kadar sayi yeter" + "");
				break;
			}
				
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		
		System.out.println((sayac) + " adet sayi girdin, toplami " + toplam);
		
			scan.close();
	}

}

