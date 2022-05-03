package day_Practice7_ForLoop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		 // Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.
		
		Scanner scan=new Scanner(System.in);
		
		int toplam=0;
		for (int i =1; i <=5; i++) { // 5 kez sayi isteme kontrolu
			System.out.println("Bir sayi giriniz :");
			int sayi=scan.nextInt();
			
			if (sayi>5 && sayi<10) {		// 5 ile 10 arasi ->6,7,8,9
				System.out.println("girdiginiz sayi 5 ile 10 arasi oldugundan isleme girmeyecek");
				
				continue;
			}
			toplam+=sayi;
		}
		System.out.println("girdiginiz sayilarin toplami : " + toplam);
		
		
		scan.close();

	}

}
