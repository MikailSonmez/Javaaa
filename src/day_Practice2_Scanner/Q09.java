package day_Practice2_Scanner;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		 /*  Problem Tan�m�
        Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi yapan kodu yaz�n�z
        a'n�n karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        �rnek Ekran ��kt�s�
        a say�s�n� giriniz: 5
        b say�s�n� giriniz: 3
        c say�s�n� giriniz: 1
        sonu� : 5.333333333333333
        */
		
		Scanner oku = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("a: ");
		a = oku.nextDouble();
		
		System.out.println("b: ");
		b = oku.nextDouble();
		
		System.out.println("c: ");
		c = oku.nextDouble();
		
		double toplam = (((a*a) - (b*b)) / (3*c));
		System.out.println("Sonuc : " + toplam);
		
		oku.close();
	}
}
