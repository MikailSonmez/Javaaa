package day_Practice8_While_DoWhile;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		 // STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazýnýz.
		
		Scanner scan = new Scanner(System.in);
		String systemPin = "javacanlara selam olsun";
		
		int girisHakki=3;
		
		while (true) {
			System.out.println("pin code giriniz :");
			String userPin = scan.nextLine();
			if (userPin.equals(systemPin)) {
				System.out.println("gayet basarili");
				break;
			} else {
				System.out.println("hatali giris yapildi");
				girisHakki--;
				System.out.println("Kalan deneme hakkiniz : " + girisHakki);
				if (girisHakki == 0) {
					System.out.println("agam hakkin kalmadi bekleme yapma dewamkeee :");
					break;
				}
			}
		}
		scan.close();

	}

}
