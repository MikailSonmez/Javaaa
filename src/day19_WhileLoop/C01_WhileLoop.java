package day19_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan bir tam sayi alin ve bu sayiyi tam bolen sayilari
		// ve toplam kac tane olduklarini ekranda yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.println(bolen + " ");
				sayac++;
			}
			bolen++;
			
		}
		System.out.println(sayi + " sayisinin " + sayac + " adet tam boleni vardir");
		
		
		
		
		
		
		scan.close();
	}

}
