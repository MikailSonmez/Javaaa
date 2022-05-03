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
	     * Bir bakkalýn 7 gunluk tum kazançlarýný gunluk olarak gösteren bir program yazýnýz.
	     * Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir method yazýnýz.
	     * Ayrýca bakkalýn hangi gunler ortalamanýn ustune kazandýðýný gösteren bir method yazýnýz.
	     * Ayrýca bakkalýn hangi gunler ortalamanýn altýnda kazandýðýný gösteren bir method yazýnýz.
	     *
	     * 1. Adým : Gunleri içeren bir tane ArrayList oluþturun. (gunler)
	     * 2. Adým : Gunluk kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun. (gunlukKazanclar)
	     * 3. Adým : While döngusu ile kullanýcýdan 7 gunluk kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle.
	     * 4. Adým : getOrtalamaKazanc() adlý method ile ortalama kazancý alýn.
	     * 5. Adým : getOrtalamaninUstundeKazancGunleri() adlý method oluþturun.
	     * 			 for döngusu ile tum gunleri ortalama kazanç ile karþýlaþtýr
	     * 			 ortalama kazançtan yuksekse o gunleri return yap.
	     * 6. Adým : getOrtalamaninAltindaKazancGunleri() adlý method oluþturun.
	     * 			 for döngusu ile tum gunleri ortalama kazanç ile karþýlaþtýr
	     * 			 ortalama kazançtan aþaðýysa o gunleri return yap.
	     * */
		  int gun = 0;
	       Scanner sc = new Scanner(System.in);
	       while (gun < 7) { // 3. adim
			System.out.println(gunler.get(gun) + "gunun kazancini giriniz : "); //gunler listinden aldýðým gun için kullanýýcdan o gunun hasýlatýný istedim.
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
	    System.out.println("ortalama kazanç : " + getOrtalamaKazanc());
	    System.out.println("ortalamanýn ustundeki gun : " + getOrtalamaninUstundeKazancGunleri());
	    System.out.println("ortalamanýn altýndaki gun : " + getOrtalamaninAltindaKazancGunleri());
	    
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
