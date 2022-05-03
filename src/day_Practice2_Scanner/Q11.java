package day_Practice2_Scanner;

import java.util.Scanner;

public class Q11 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
			
	 /*
 TechProEd spor salonu için kullanýcýdan isim soyisim, yaþ, kilo, boy, salona devam edeceði ay süresini
 bilgilerini alýp aylýk $20 olarak toplam ücretini yazdýrýnýz.
         */		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("TechProEd Salonu'na hosgeldiniz!");
		
		System.out.println("Isim Soyisim : ");
		String isim = scan.nextLine();
		
		System.out.println("Yasiniz : ");
		int yas = scan.nextInt();
		
		System.out.println("Kilo : ");
		double kilo = scan.nextDouble();
		
		System.out.println("Boy : ");
		double boy = scan.nextDouble();
		
		System.out.println("Kac aylik kaydolacaksiniz : ");
		int aylik = scan.nextInt();
		
		int aylik_ucret = 20;
		
		int toplam_tutar = aylik_ucret * aylik;
		
		System.out.println("Toplam tutar : " + toplam_tutar + " Euro");
		scan.close();
		
	}
}
