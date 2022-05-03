package day_Practice6_MethodCreation;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
	     Problem Tanýmý :
	        powerOfThree isminde bir method oluþturun.
	        Parametre olarak int
	        Return tipi boolean
	        Bir tamsayý verildiðinde, 3 üssü olup olmadýðýný teyit edin.
	        3'ün üssü(kuvveti) ise true, deðilse false döndürün.
	        Örnek 1:
	        Girdi: 27
	        Çýktý: true
	        Açýklama: 3*3*3 =27
	        Sonuç= true
	        Örnek 2:
	        Girdi: 0
	        Çýktý: false
	        Örnek 3:
	        Girdi: 9
	        Çýktý: true
	        Açýklama: 3*3 = 9
	        Sonuç= true
	        Örnek 4:
	        Girdi: 45
	        Çýktý:: false
	        Açýklama: 3*3*3*3 =81
	        Sonuç= false
	        45, 3ün üssü (kuvveti) deðildir.
	     */
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Sayý giriniz: ");
	        int num = scanner.nextInt();
	       
	        System.out.println(powerOfThree(num));
	        
	        scanner.close();

	}

	private static boolean powerOfThree(int num) {
		
		boolean b = false;
		int carpim = 1;
			for (int i = 1; i < num/3; i++) { // num / 3 olamdan direk num da yazilabilir
				carpim *=3;
				if (carpim == num) {
					b = true;
					break;
				}
			}
		return b;
	}

}
