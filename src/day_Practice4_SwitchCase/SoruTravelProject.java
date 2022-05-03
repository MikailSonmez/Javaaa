package day_Practice4_SwitchCase;

import java.util.Scanner;

public class SoruTravelProject {

	public static void main(String[] args) {
		/*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatý hesabý = Her 20 Km baþýna 5 euro. örn: (100 km yol. Bilet parasý  (100/20)* 5 =25 euro
todo ÝPUCU:  toplamTutar, iþlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluþturabilirsiniz. Ýþlemlerde direkt bunlarý caðýrabilirsiniz.
        todo ÝLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM baþýna 5 euro bilet parasý alýnmaktadir..)    yazýsý gelsin.
    1.    Frankfurt veya Köln olarak bir giriþ yapýn. (Girdiðiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdýrýn.
      Frankfurt km hesabý iþlemi yapýn.
      son olarak konsolda: Frankfurt 15 Euro         yazsýn.
      todo  case: KÖLN ise
      "Rota = Köln" yazdýrýn.
       km hesabýna göre iþlemi yapýnýz.
       son olarak konsolda:  Köln   20 Euro             yazsýn.
       2.  Sistem bize "Kaç kiþilik bilet istiyorsunuz? (Max 2 kiþilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kiþilik " yazdýrýn. (1 kiþilik seçerseniz bir iþlem yapmanýza gerek kalmaz, bilet ücreti yukarýda çoktan belirlenmiþ olur.)
        case:2 ise
        "2 kiþilik " yazdýrýn
        2 kiþi için bilet fiyatýný hesaplayýn.
        todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kiþilik    yazsýn.
        1.Bakiyemi belirtin.
        2.Toplam Tutarý belirtin.
        3.double paraUstu oluþturun ve hesaplayýn.
        4.Double para üstünü yazdýrýn.
         */
		Scanner scanner = new Scanner(System.in);

        System.out.println("******** Seyehat Acentemize Hoþgeldiniz ********");
        System.out.println("Frankfurt : 60 Km\n" + "Köln : 80 Km\n" + "20 Km baþýna 5 euro bilet parasý alýnmaktadir.");
        System.out.println("************************************************");

        System.out.print("Nereye yolculuk etmek istiyorsunuz:  ");
        String islem = scanner.nextLine();
        String islem2 = islem.toUpperCase();
        
        double bakiye =100;
        double toplamTutar=0;
    
        double FrankfurtKm = (60 / 20) * 5;
        double KolnKm = (80 / 20) * 5;
        
        switch (islem2) {
        default:
            System.out.println("Hatalý giriþ yaptýnýz...");
            break;
        case "FRANKFURT":
            System.out.println("Rota = Frankfurt ");
            System.out.println("Frankfurt " + FrankfurtKm + " Euro");

            System.out.print("Kaç kiþilik bilet istiyorsunuz? (Max 2 kiþilik olabilir): ");
            String islem3 = scanner.nextLine();
            switch (islem3) {
            case "1":
                System.out.println("1 Kiþilik");
                System.out.println("Ýstikamet: Frankfurt - 1 Kiþilik");
                toplamTutar = FrankfurtKm;
                break;

            case "2":
                System.out.println("2 Kiþilik");
                toplamTutar = FrankfurtKm * 2;
                System.out.println("Ýstikamet: Frankfurt - 2 Kiþilik");
                break;

            default:
                System.out.println("Hatalý giriþ yaptýnýz...");
                break;
            }
            System.out.println("Bakiye: " + bakiye);
            System.out.println("Toplam Tutar: " + toplamTutar);
            double paraustu = bakiye - toplamTutar;
            System.out.println("Para üstü = " + paraustu);
            break;
            
        case "KOLN":
            System.out.println("Rota = Koln ");
            System.out.println("Koln " + KolnKm + " Euro");

            System.out.print("Kaç kiþilik bilet istiyorsunuz? (Max 2 kiþilik olabilir): ");
            islem3 = scanner.nextLine();

            switch (islem3) {
                case "1":
                    System.out.println("1 Kiþilik");
                    System.out.println("Ýstikamet: Koln - 1 Kiþilik");
                    toplamTutar = KolnKm;
                    break;

                case "2":
                    System.out.println("2 Kiþilik");
                    toplamTutar = KolnKm * 2;
                    System.out.println("Ýstikamet: Koln - 2 Kiþilik");
                    break;

                default:
                    System.out.println("Hatalý giriþ yaptýnýz...");
                    break;
            }
            System.out.println("Bakiye: " + bakiye);
            System.out.println("Toplam Tutar: " + toplamTutar);
            paraustu = bakiye - toplamTutar;
            System.out.println("Para üstü = " + paraustu);
            
		}
        scanner.close();
        
	}

}
