package day_Practice2_Scanner;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		 /*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.
        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ucgenin a kenar uzunlugunu giriniz : ");
		int a = scan.nextInt();
		
		System.out.println("Ucgenin b kenar uzunlugunu giriniz : ");
		int b = scan.nextInt();
		
		double h = Math.sqrt((a*a) + (b*b));
		
		System.out.println("Hipotenus : " + h);
		scan.close();
	}
}
