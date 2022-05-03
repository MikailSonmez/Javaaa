package day31_dateAndTime;

import java.time.LocalTime;

public class C02_LocalTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		LocalTime saat=LocalTime.now();
		
		System.out.println("baslangic saati " + saat); // 16:26:19.460025500 saat,dakika,saniye,salise
		
		
		int sayi=10;
		
		for (int i = 0; i < 100000; i++) {
			sayi++;
			
		}
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saatir " + saatBitis); // bitis saatir16:29:25.561911200
		
		// Eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		// Hem basinda, hem de sonunda LocalTime objesi olusturmaliyiz
		
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("For loop " + (nanobitis-nano1) + "nano saniyede tamamladi");
		// For loop 3000300.0nano saniyede tamamladi
	}

}
