package day_Practice4_SwitchCase;

import java.util.Scanner;

public class SoruBankamatik {

	public static void main(String[] args) {
		 System.out.println("*****************************");
	        System.out.println("ATM'ye Hoþgeldiniz...");

	        
	        String islemler = "1.Islem : bakiye ogrenme\n2. Islem : para yatirma\n"
	        		+ "3. Islem : para cekme\n"
	        		+ "4. Islem : Cikis";
	        
	        System.out.println(islemler);
	        System.out.println("************************");
	        
	        int bakiye = 1000;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Yapmak istediginiz islemi seciniz: ");
	        String islem = scan.nextLine();
	        
	        switch (islem) {
			case "1":
				System.out.println("Bakiyeniz : " + bakiye);
				break;
			case "2":
				System.out.println("Yatirmak istediginiz tutari girin: ");
				int tutar = scan.nextInt();
				bakiye +=tutar;
				System.out.println("Yeni bakiyeniz : " + bakiye);
				break;
			case "3":
				System.out.println("Cekmek istediginiz tutari girin: ");
				int tutar2 = scan.nextInt();
				
				if (tutar2<=bakiye) {
					bakiye -=tutar2;
					System.out.println("Yeni bakiyeniz : " + bakiye);
				} else {
					System.out.println("Yeterli bakiyeniz yok...");
				}
				break;
			case "4":
				System.out.println("Cikis yapiliyor....");
				break;
			default:
				System.out.println("Gecersiz islem...");
				break;
			}
	        scan.close();
	}

}
