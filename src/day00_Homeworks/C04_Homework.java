package day00_Homeworks;

import java.util.Scanner;

public class C04_Homework {
	
	public static void main(String[] args) {
		// sayfa 75
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kenar uzunluklarini giriniz");
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		double kenar3= scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eskenar ucgendir");
		} else {
			System.out.println("Eskaner ucgen degildir");
		}
		scan.close();
	}
}
