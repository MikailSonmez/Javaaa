package day00_Homeworks;

import java.util.Scanner;

public class C03_HomeWork {

	public static void main(String[] args) {
		// sayfa 71
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kutsal bir gun ismi yaziniz");
		
		String gun=scan.next();
		
		if (gun.equals("Cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		} else if (gun.equals("Cumartesi")){
			System.out.println("Yahudier icin kutsal gun");
		} else if (gun.equals("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");
		} else {
			System.out.println("Lutfen gecerli bir gun giriniz");



		}
		scan.close();

	}

}
