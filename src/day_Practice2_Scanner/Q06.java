package day_Practice2_Scanner;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		 /*  Problem Tanýmý
        Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
        Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr?
        Örnek Ekran Çýktýsý
        Mesafeyi giriniz: 400
        Hýzý giriniz: 100
        Süre 4 saattir.
     */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gideceginiz yol mesafesi(km):");
		double yol = scan.nextDouble();
		
		System.out.println("Ortalama Hiziniz(km/sa):");
		double ort_hiz = scan.nextDouble();
		
		double varis_suresi = yol / ort_hiz;
		System.out.println("Varis sureniz: " + varis_suresi + " saat");
		scan.close();
	}

}
