package day_Practice7_ForLoop;

public class Q19 {

	public static void main(String[] args) {
		/*
	     Yýldýzlar (*) ile piramit oluþturabileceðiniz bir kod yazýnýz.
	            Sonuç böyle olmalýdýr;
	                   *
	                  * *
	                 * * *
	                * * * *
	               * * * * *
	     */

		for (int satir = 1; satir < 6; satir++) {
			for (int bosluk = 5 - satir; bosluk > 0; bosluk--) { //bosluklari silmek icin
				 System.out.print(" ");
			}
			for (int yildiz = 1; yildiz <= satir; yildiz++) {
				 System.out.print("* "); //"*" yapilirsa saga dayali ucgen olur
			}
			System.out.println();
		}

	}

}
