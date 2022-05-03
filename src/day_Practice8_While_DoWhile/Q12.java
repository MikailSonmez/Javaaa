package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		//Bir top belirli yükseklikten atýlmaktadýr.
	    // Atýldýktan sonra, atýldýðý yüksekliðin 3/4 u kadar yerden yukarý doðru zýplamaktadýr
	    // Top zýplama  yüksekliði 1 metrenin altýna indiðinde durmaktadýr.
	    // Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulan do while code blogu create ediniz.
		
		
		 Scanner scan = new Scanner(System.in);
	     System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
	     double yukseklik = scan.nextDouble();
	     double topunToplamYolu=0;
	     int yerevurmaSayisi=0;
	     
	     do {
			yerevurmaSayisi++;
			topunToplamYolu+=yukseklik;
			yukseklik*=(0.75);
			topunToplamYolu+=yukseklik;
		} while (yukseklik>=1);
	     
	     
	     System.out.println("topun vurma sayisi : " + yerevurmaSayisi);
	     System.out.println("topun aldigi toplam yol : " + topunToplamYolu);
	     
	     scan.close();
	}

}
