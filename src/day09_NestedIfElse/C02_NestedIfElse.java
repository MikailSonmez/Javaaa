package day09_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		// Soru 12) Kullanicidan 4 basamakli bir sayi girmesini isteyin
		// Girdigi sayi 5'e bolunuyorsa son rakamini konrol edin.
		// Son rakami 0 ise ekrana "5'e bolunen cift sayi" yazdirin
		// Son rakami 0 degil ise "5'e bolunen tek sayi" yazdirin
		// Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamaki pozitif bir sayi girin");
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) {
			System.out.println("4 basamakli sayi girmelisiniz");
		} else { // 4 basamkli sayilari yakalayacak
			
			
			if (sayi%5==0) {	// 5'e tam bolunenler
				
				if (sayi%10==0) {	// son rakam 0
					System.out.println("bese tam bolunen cift sayi");
				} else {	// son rakam 5
					System.out.println("bese tam bolunen tek sayi");

		}
				
				
				
				
				
				
			} else {	// 5'e tam bolunemeyenler
				System.out.println("Tekrar deneyin");
			}
			
		

		}
		scan.close();
	}

}
