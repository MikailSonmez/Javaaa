package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

	public static void main(String[] args) {
		 //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayi giriniz : ");
		int num = scan.nextInt();
		System.out.println("*****  TERNARY ��z�m�  *****");
		
		String result = (num>=0) ? (num<10 ? "rakam" : "pozitif sayi") : ("negatif sayi");
		System.out.println(result);
		
		System.out.println("*****  if  ��z�m�  *****");
		
		if (num >=0) {
			if (num <10) {
				System.out.println("rakam");
			} else System.out.println("Pozitif sayi");
			
		} else {
			System.out.println("Negatif sayi");
		}
		scan.close();
	}

}
