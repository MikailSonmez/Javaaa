package day_Practice2_Scanner;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný alarak, iþin bitme süresini
        hesaplayan kodu yazýnýz.
        Örneðin, Bir iþçi bir iþi 10 günde yapabilmektedir.
        Buna göre 2 iþçi ayný iþi kaç günde yapar?
        Örnek Ekran Çýktýsý
         Bir iþçi iþi kaç günde bitirmektedir? 10
         Toplam kaç iþçi çalýþacak? 2
        Ýþin bitme süresi 5 gündür.
    */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir isci isi kac gunde bitirmektedir : ");
		int bir_isci_bitirme_suresi = scan.nextInt();
		
		System.out.println("Toplam kac kisi calisacak : ");
		int isci_sayisi = scan.nextInt();
		
		int coklu_bitirme_suresi = bir_isci_bitirme_suresi / isci_sayisi;
		System.out.println(" Isin bitme suresi : " + coklu_bitirme_suresi);
		scan.close();

	}

}
