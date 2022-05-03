package day_Practice7_ForLoop;

public class Nested01 {

	public static void main(String[] args) {
		//Eðer bir döngünün gövdesinde diðer bir döngü bulunuyorsa,
        //Bu tür döngüler iç-içe döngüler olarak bilinir
        //içteki döngü dýþtaki döngünün her adýmýnda yeniden çalýþtýrýlacaktýr
        //Ýç içe döngülerde en içteki döngü en önce tamamlanýr.
		
		
		for (int i = 1; i <10; i++) {
			
			System.out.print("dis dongu i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.print("ic dongu i = "+ i +" j = " + j);
			}
			 System.out.println();
		}
		
		  int deger = 0;

	        for (int i = 1; i <=10 ; i++) {

	            for (int j = 1; j <=5; j++) {

	                deger+=1;
	            }
	        }
	        System.out.println("deger = " + deger);
	        
	        deger=0;

	        for (int i = 1; i <=10 ; i++) {                 // i    j   deger
	                                                        // 1    1     1
	            for (int j = 1; j <= i ; j++) {             // 2    1     2
	                deger+=1;                               // 2    2     3
	            }                                           // 3    1     4
	        }                                               // 3    2     5
	        System.out.println("deger = " + deger);         // 3    3     6

	    // 1+2+3+4+.....+10 =55



	}

}
