package day_Practice10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QMarket {
	
	
	static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar")); // 1. adim
	static List<Double> gunlukKazanclar = new ArrayList<>(); // 2.adim
	static double ciro = 0;
	
	public static void main(String[] args) {
		/*
	     * Bir bakkal�n 7 gunluk tum kazan�lar�n� gunluk olarak g�steren bir program yaz�n�z.
	     * Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir method yaz�n�z.
	     * Ayr�ca bakkal�n hangi gunler ortalaman�n ustune kazand���n� g�steren bir method yaz�n�z.
	     * Ayr�ca bakkal�n hangi gunler ortalaman�n alt�nda kazand���n� g�steren bir method yaz�n�z.
	     *
	     * 1. Ad�m : Gunleri i�eren bir tane ArrayList olu�turun. (gunler)
	     * 2. Ad�m : Gunluk kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun. (gunlukKazanclar)
	     * 3. Ad�m : While d�ngusu ile kullan�c�dan 7 gunluk kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle.
	     * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortalama kazanc� al�n.
	     * 5. Ad�m : getOrtalamaninUstundeKazancGunleri() adl� method olu�turun.
	     * 			 for d�ngusu ile tum gunleri ortalama kazan� ile kar��la�t�r
	     * 			 ortalama kazan�tan yuksekse o gunleri return yap.
	     * 6. Ad�m : getOrtalamaninAltindaKazancGunleri() adl� method olu�turun.
	     * 			 for d�ngusu ile tum gunleri ortalama kazan� ile kar��la�t�r
	     * 			 ortalama kazan�tan a�a��ysa o gunleri return yap.
	     * */
		  int gun = 0;
	       Scanner sc = new Scanner(System.in);
	       while (gun < 7) { // 3. adim
			System.out.println(gunler.get(gun) + "gunun kazancini giriniz : "); //gunler listinden ald���m gun i�in kullan��cdan o gunun has�lat�n� istedim.
			double gunlukHasilat = sc.nextDouble(); // istedigim hasilati gunluk hasilata atadim
			gunlukKazanclar.add(gunlukHasilat); // aldigim gunluk hasilati gunlukKazanclar listesine ekledim
			ciro += gunlukHasilat; // aldigim gunluk hasilati kasaya ekledim
			gun++; // 0 1 2 3 4 5 6. gunleri cagirdim.
		}
		
		getOrtalamaKazanc();
		getOrtalamaninUstundeKazancGunleri();
	    getOrtalamaninAltindaKazancGunleri();

	    System.out.println("gunlukkazanclar : " + gunlukKazanclar);
	    System.out.println("ciro  : " + ciro);
	    System.out.println("ortalama kazan� : " + getOrtalamaKazanc());
	    System.out.println("ortalaman�n ustundeki gun : " + getOrtalamaninUstundeKazancGunleri());
	    System.out.println("ortalaman�n alt�ndaki gun : " + getOrtalamaninAltindaKazancGunleri());
	    
	    sc.close();
	}

	private static String getOrtalamaninAltindaKazancGunleri() {
		String ortAltGun = "";
			for (int i = 0; i < gunlukKazanclar.size(); i++) {
				if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
					ortAltGun += gunler.get(i);
				}
			}
			return ortAltGun;
		
	}

	private static String getOrtalamaninUstundeKazancGunleri() {
		String ortUstGun = "";
		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
				ortUstGun += gunler.get(i);
			}
		}
		return ortUstGun;
		
	}

	private static double getOrtalamaKazanc() {
		double ortalama = ciro/ 7;
		return ortalama;
		
	}

}
