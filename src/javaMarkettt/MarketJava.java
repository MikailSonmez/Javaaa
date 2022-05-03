package javaMarkettt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketJava {

	static List<String> urunler = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon"));
	static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
	static List<String> sepetUrunlerin = new ArrayList<>();
	static List<Double> sepetKg = new ArrayList<>();
	static List<Double> sepetFiyatlar = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
 	public static void main(String[] args) {
 			
 		/* Basarili Market alýþ-veriþ programý.
		 *
		 * 1. Adým: Ürünler ve fiyatlarý içeren listeleri oluþturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soðan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
		 * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
		 * 4. Adým: Alýnacak bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz.
		 * 5. Baþka bir ürün alýp almak istemediðini sorunuz.
		 * 6. Eðer devam etmek istiyorsa yeniden ürün seçme kýsmýna yönlendiriniz.
		 * 7. Eðer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programý bitirinzi.
		 */
 		
 		String devam = "";
 		double toplamFiyat = 0;
 		do {
			urunListesi();
			System.out.println("sectiginiz urun kodu giriniz : ");
			int urunNo = scan.nextInt();
			System.out.println("kac kilo alacaksiniz : ");
			double kg = scan.nextDouble();
			sepeteEkle(urunNo, kg);
			toplamFiyat = sepetTutari();
			System.out.println("dewam edecekseniz 'e' yaziniz");
			devam = scan.next();
			
		} while (devam.equalsIgnoreCase("e"));
 		odeme(toplamFiyat);

	}
	private static double sepetTutari() {
		
		double sepetTutar = 0;
		double sptKg = 0;
		for (int i = 0; i < sepetUrunlerin.size(); i++) {
			sepetTutar += sepetFiyatlar.get(i);
			sptKg += sepetKg.get(i);
		}
		System.out.println("toplam odemeniz gereken miktar : " + sepetTutar + " aliginiz urun miktari : " + sptKg);
		return sepetTutar;
	}
	private static void odeme(double toplamFiyat) {
		
		System.out.println("odemeniz gereken miktar : " + toplamFiyat);
		double nakit = 0;
		do {
			System.out.println("lutfen nakit odemenizi giriniz : ");
			nakit  += scan.nextDouble();
			if (nakit < toplamFiyat) {
				System.out.println("eksik odeme yaptiniz " + (toplamFiyat - nakit) + " daha odeme yapinzi");
				
			}
		} while (nakit < toplamFiyat);
		double paraUstu = nakit - toplamFiyat;
		if (paraUstu > 0) {
			System.out.println(" para ustunuz : " + paraUstu);
		}
		System.out.println("yine bekleriz iyi gunler");
	}
	private static void sepeteEkle(int urunNo, double kg) {
		sepetUrunlerin.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo) * kg);
		
	}
	private static void urunListesi() {
		System.out.println(" No\t Urunler \t Fiyatlar");
		System.out.println("===\t ======= \t ======");
		
		for (int i = 0; i < urunler.size(); i++) {
			System.out.println(" " + i + "\t" + urunler.get(i) + "\t" + fiyatlar.get(i));
		}
	}

}
