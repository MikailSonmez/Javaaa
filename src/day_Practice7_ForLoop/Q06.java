package day_Practice7_ForLoop;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
	       2 boyutlu bir tablo olarak, ekrana �arp�m tablosunu hesaplay�p yazan kodu yaz�n�z.
	       �rnek Ekran ��kt�s�
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25
	       Ekran ��kt�s� 5 x 5 boyutlar� i�in �rnek olarak verilmi�tir,
	       isterseniz boyutlar� klavyeden okuyup istenen boyutlara g�re
	       ekrana basan bir kod yazabilirsiniz.
	    */
		
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam say� giriniz : ");
        int sayi = scan.nextInt();
        
        for (int baba = 1; baba <= sayi; baba++) { // satir kontrolu
        	for (int ogul = 1; ogul <=sayi; ogul++) { // sutun kontrolu
				System.out.print(" "+(baba*ogul));
			}
			System.out.println(); // 2 boyutlu for da ic ve dis dongu arasina satir atlamasi icin bos println koyulur
		}
        scan.close();

	}

}
