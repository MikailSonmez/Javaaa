package day_Practice6_MethodCreation;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
	    Problem Tanýmý:
	    addDigits isminde bir method oluþturun.
	    Parametresi int
	    Return tipi de int
	    Pozitif int deðerler ver ve en son sonuç tek basamaklý çýkana kadar 
	    basamaklarý birbiriyle topla.
	    Tek basamaklý çýktýðýnda, döndürün
	    Örnek1:
	    Girdi 38
	    Çýktý: 2
	    Açýklama: Ýþlemler þöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
	                 2 , tek basamaklý olduðundan, bunu döndürün.
	    */
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Sayý giriniz: ");
        int num = scanner.nextInt();
        
        System.out.println(addDigits(num));
        
        scanner.close();

	}
	private static int rakamTopla(int num) {
		/*
        String str = String.valueOf(num);//num a girilen int deðerlerini str ye ata
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
