package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {
	
	public static void main(String[] args) {
			
		 /*  Problem Tan�m�
        Kullan�c�dan �� adet say� alarak bu say�lar�n
        bir dik ��genin kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
        (Yard�m: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor
        ba�lant�s�ndan yararlanabilirsiniz)
        �rnek Ekran ��kt�s�
        birinci kenar� giriniz: 2
        ikinci kenar� giriniz 15
        ���nc� kenar� giriniz: 7
        Bu bir dik ��gen de�ildir.
        Bu bir dik ��gendir
     */
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Birinci sayiyi giriniz: ");
		a = scan.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz: ");
		b = scan.nextInt();
		
		System.out.println("Ucuncu sayiyi giriniz: ");
		c = scan.nextInt();
		
		if ((a*a) + (b*b) == c*c) {
			System.out.println("Bu bir dik ucgendir");
		} else if ((a*a) + (c*c) == b*b){
			System.out.println("Bu bir dik ucgendir");
		} else if ((c*c) + (b*b) == b*b) {
			System.out.println("Bu bir dik ucgendir");
		} else {
			System.out.println("bu bir dik ucgen degildir");
		}
		scan.close();
	}
}
