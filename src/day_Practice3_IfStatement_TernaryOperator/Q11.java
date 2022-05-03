package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*  Problem Tan�m�
        Kullan�c�dan bir tarihi g�n, ay ve y�l �eklinde al�p bu tarihi
        ay, g�n, y�l ve y�l, ay, g�n s�ralar�na �evirerek yazan bir kod yaz�n�z.
    ipucu: her else komutundan sonra return; komutu kullan�n�z...
        �rnek Ekran ��kt�s�
        L�tfen g�n� giriniz: 10
        L�tfen ay� giriniz: 02
        L�tfen y�l� giriniz: 2009
        G�n ay y�l: 10.02.2009
        Ay g�n y�l: 02.10.2009
        Y�l ay g�n: 2009.02.10
        */
		
		Scanner scan = new Scanner(System.in);
		
		int gun;
		int ay;
		int yil;
		
		System.out.println("Tarihi gun,ay,yil olarak istenen sekilde giriniz...");
		
		System.out.println("Gun: ");
		gun = scan.nextInt();
		
		if (gun>0 && gun<=31) {
			System.out.println(gun);
		} else {
			System.out.println("Yanlis giris yaptiniz.Program sonlaniyor...");
			return;
		}
		
		System.out.println("Ay: ");
		ay = scan.nextInt();
		
		if (ay> 0 && ay<=12) {
			System.out.println(ay);
		} else {
			System.out.println("Yanlis giris yaptiniz. Program sonlaniyor...");
			return;
		}
		
		System.out.println("Yil: ");
		yil  = scan.nextInt();
		
		if (yil>0) {
			System.out.println(yil);
		} else {
			System.out.println("Yanlis giris yaptiniz.Program sonlaniyor...");
			return;
		}
		
		System.out.println("Ay/Gun/Yil : " + ay + "/" + gun + "/" + yil);
		System.out.println("Yil/Ay/Gun : " + yil + "/" + ay + "/" + gun);
		
		scan.close();
	}

}
