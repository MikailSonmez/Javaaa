package day_Practice10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// Bir ��retmenden girmek istedi�i kadar notu al�n�z, ve
        // ortalamay� ge�en ��renci say�s�n� bulunuz.
		
		List<Integer> listNotlar = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String devam;
		// ortalamasi alinacak list elemanlarini kullanicidan alindi
		do {
			System.out.println("not giriniz : ");
			int ogrNot = scan.nextInt();
			System.out.println("devam : E/H");
			devam = scan.next();
			listNotlar.add(ogrNot);
		} while (devam.equalsIgnoreCase("E"));
		
		// ortalama hesaplanmasi..
		int toplam = 0;
		for (int i = 0; i < listNotlar.size(); i++) {
			
			toplam += listNotlar.get(i);
		}
		
		double ortalama = toplam / listNotlar.size();
		
		// ortalamayi gecen ogr sayisi
		
		int ortalamaGecenSayisi = 0;
		for (int i = 0; i < listNotlar.size(); i++) {
			if (listNotlar.get(i) > ortalama) {
				ortalamaGecenSayisi++;
			}
		}
		System.out.println("girilen notlarin ortalamasi : " + ortalama);
		System.out.println("ortalama gecen ogr sayisi : " + ortalamaGecenSayisi);
		
		scan.close();

	}

}
