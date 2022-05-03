package day000_Homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C15 {

	
	public static void main(String[] args) {
		/*
		 Q6 Create method that finds repeated charcters in a String
		 Bir String'de tekrarlanan karakterleri bulan method create ediniz
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Aralarinda bosluk birakarak arr elemanlarini girin :");
		String str = scan.nextLine();
		str=str.replaceAll(" ", ""); // String Manupaltion kullanildi girilen cumle'deki bosluklari da
										// tekrar eden karakter olarak algilamasin diye bosluklari kaldirildi
		
		List<String> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			count = 0;
		for (int j = i+1; j < str.length(); j++) {
			if (str.substring(i).charAt(0)==str.substring(j).charAt(0)) {	// char olarak karakterleri kiyasladim ifadeler esit olsada
																				// referans ve degerler esit olmayacagindan reel sonuc alamazdim
				count++;
				
			}
		}
		if (count > 0 && !list.contains(str.substring(i, i+1))) {
			list.add(str.substring(i, i+1));
			// sayac'in o dan buyuk ve bir deger sartimizda list icinde tekrar eden karakterin olup olmadigina bakmamiz gerekiyor
				// eger sayac 0'da buyuk ve list icinde karakter yoksa body icine girip list'e karakteri ekliyoruz
		}
		}
		System.out.println("Tekrar eden karakterler"+list);
		scan.close();
	}
}
