package day_Practice6_MethodCreation;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
	    Problem Tan�m�:
	    addDigits isminde bir method olu�turun.
	    Parametresi int
	    Return tipi de int
	    Pozitif int de�erler ver ve en son sonu� tek basamakl� ��kana kadar 
	    basamaklar� birbiriyle topla.
	    Tek basamakl� ��kt���nda, d�nd�r�n
	    �rnek1:
	    Girdi 38
	    ��kt�: 2
	    A��klama: ��lemler ��yle olacak: 3 + 8 = 11, 1 + 1 = 2.
	                 2 , tek basamakl� oldu�undan, bunu d�nd�r�n.
	    */
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Say� giriniz: ");
        int num = scanner.nextInt();
        
        System.out.println(addDigits(num));
        
        scanner.close();

	}
	private static int rakamTopla(int num) {
		/*
        String str = String.valueOf(num);//num a girilen int de�erlerini str ye ata
        String[] arr = str.split("");//str deki arr  arraysa ata
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
 */
		
		int toplam = 0;
		int rakam = 0;
		
		
		while (num>0) {
			
			rakam = num%10;
			toplam+=rakam;
			num/=10;
			
		}
		System.out.println("Girdiginiz sayinin rakamlariiii toplami: " + toplam);
		return toplam;
	}

	public static int addDigits(int num) {
		
		nasil("kolay gelsin method run oluyor");
		for (int i = 0; i < 2; i++) {
			num = rakamTopla(num); // girilen int num sayisini num methoduna gonder gelen degeri tekrar num a ata tekrar sum a gonder
			
			if (num<10) // tek basamakli yani rakamsa kodu kir 
				break;
			
		}
		// gozunAydin("helal olsun bu method calistiysa dewamkee");
		return num;
	}
	
	private static void gozunAydin(String naber) {
        System.out.println("gozunAydin method calisti "+naber);
    }

	

	private static void nasil(String mesaj) {
		System.out.println("nasil methodu calisti ; " + mesaj);
		gozunAydin("helal olsun bu method calistiysa dewamkee");
	}

}
