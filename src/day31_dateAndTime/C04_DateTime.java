package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C04_DateTime {

	public static void main(String[] args) {
		// bir String ve bir int variable olusturalim
		// bir loop icerisinde bu variable'lari 10000 kere degistirelim
		// ve islem surelerini kiyaslayalim ?
		
		
		LocalTime saat=LocalTime.now();
		
		System.out.println("baslangic saati " + saat); 
		
		@SuppressWarnings("unused")
		int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
			
		}
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saatir " + saatBitis); 
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("int For loop " + (nanobitis-nano1) + "nano saniyede tamamladi");
		// For loop 1999000.0nano saniyede tamamladi
		

		
		
		
		LocalTime saatS=LocalTime.now();
		
		System.out.println("baslangic saati " + saatS); 
		
		@SuppressWarnings("unused")
		String str="celil";
		
		for (int i = 0; i < 10000; i++) {
			str+=" ";
			
		}
		LocalTime saatBitisS=LocalTime.now();
		System.out.println("bitis saatir " + saatBitisS); 
		double nanoS=saatS.getNano();
		double nanobitisS=saatBitisS.getNano();
		
		System.out.println("String For loop " + (nanobitisS-nanoS) + "nano saniyede tamamladi");
		// For loop 4.70104E7nano saniyede tamamladi
		
		double stringSure=nanobitisS-nanoS; // 4.7011E7    47.01.100 nono
		double intSure=nanobitis-nano1;		//				9.999.00 nono
		
		System.out.println("Int For loop " + (stringSure-intSure) + "nano saniyede tamamladi");
		
		
		System.out.println(saat.getMinute()); // 45
		System.out.println(saat.plusMinutes(10000)); // 15:25:33.833893
		
		System.out.println(saat.minusHours(20)); // 20:46:42.119139400
		
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat); // 16:48:33.950103900



	}	
			
		
}

