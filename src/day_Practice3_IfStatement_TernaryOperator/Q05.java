package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz : ");
		int yas = scan.nextInt();
		System.out.println("Lutfen kilonuzu giriniz : ");
		int kilo = scan.nextInt();
		
		if (yas>0 && yas<18) {
			System.out.println("yasi 18 den kucuk olanlar kan bagisi yapamaz");
		} else  if (yas>=18){
				if (kilo> 0 && kilo <50) {
					System.out.println("Kilonuz 50'den kucuk oldugu icin kan bagisi yapamazsiniz");
				} else if (kilo>=50){
					System.out.println("Kan bagisi yapabilsiniz");
				} else {
					System.out.println("Yanlis bir deger girdiniz");
				}
		} else {
			System.out.println("Yanlis bir deger girdiginiz");
		}
		scan.close();
	}

}
