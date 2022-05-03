package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		
		System.out.println(tarihSaat); // 2022-03-31T16:52:59.564214500
		
		// eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil saat.dakika
		
		DateTimeFormatter duzenle= DateTimeFormatter.ofPattern("dd / M / YYYY HH : mm");
		
		System.out.println(duzenle.format(tarihSaat)); // 31 / 03 / 2022 16 : 56
		
		/*
		 * format olusturuken
		 * GUN
		 * d : basta 0 varsa onu yazmadan gun numarasi
		 * dd : tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 * DDD : yilin kacinci gunu oldugunu yazar
		 * E, EE, EEE : gun isminin ilk 3 harfi
		 * EEEE : gun isminin tamamini
		 * 
		 * Ay (ay icin M, dakika icin kucuk m kullanilir)
		 * M : basta 0 varsa onu yazmadan ay numarasi
		 * MM:dd : tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 * MMM : Ay isminin ilk 3 harfi
		 * MMMM : Ay isminin tamami
		 * 
		 * YY : yilin son iki rakamini
		 * YYYY : yilin tamamini
		 * 
		 * Saat : (24 saat uzerinden istiyorsak H, 12 saat uzeirnden istiyorsak kucuk h)
		 * HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 * H : tek rakamli saat olursa sadece saati
		 * 
		 * sonuna a yazarsa AM veya PM degerini verir
		 */
	}

}
