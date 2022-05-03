package day_Practice3_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
        Kulanicidan aracinin hizini aliniz
        Trafik cezasinin de�erini hesaplayin.
            45 hiz siniridir.
            E�er hiziniz 55-74 arasinda ise:
            Ceza 100 $'dir.
            E�er hiziniz 75 - 84 arasinda ise:
            Ceza 150 $'dir.
            E�er hiziniz 85 -94 arasinda ise:
            Ceza 320 $'dir.
            E�er hiziniz 94'den daha fazla ise:
            Ceza 500 $'dir.
            ve ayrica,
            E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.
            �rn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            �rn;
            currentSpeed(Hiziniz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = true;
            sonu� 320 olmalidir.
            currentSpeed(Hiziniz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = false;
            sonu� 300 olmalidir.
     */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ehliyetiniz var ise 1, yoksa 0 yaziniz:");
		
		int ehliyet = scan.nextInt();
		
		System.out.println("Hizinizi giriniz :");
		
		int hiz = scan.nextInt();
		
		if (ehliyet == 1) {
			if (hiz<0) {
				System.out.println("hatali veri girdiniz");
			} else if (hiz>54 && hiz<75){
				System.out.println("Ceza 100$'dir");
			} else if (hiz>75 && hiz<85) {
				System.out.println("Ceza 150$'dir");
			} else if (hiz>85 && hiz <95) {
				System.out.println("Ceza 320$'dir");
			} else if (hiz >=95) {
				System.out.println("Ceza 500$'dir");
			} else {
				System.out.println("Hiz sinirinda seyahat ediyorsunuz hayirli yolculuklar");
			}
			
		} else  if (ehliyet == 0){
			if (hiz>54 && hiz<75){
				System.out.println("Ceza 300$'dir");
			} else if (hiz>75 && hiz<85) {
				System.out.println("Ceza 350$'dir");
			} else if (hiz>85 && hiz <95) {
				System.out.println("Ceza 520$'dir");
			} else if (hiz >=95) {
				System.out.println("Ceza 700$'dir");
			} else {
				System.out.println("Sadece Ehlityetsiz kullanimdan dolayi cezani 200$'dir");
			}

		} else {
			System.out.println("Lutfen gecerli bir deger giriniz!");
		}
		scan.close();
	}

}
