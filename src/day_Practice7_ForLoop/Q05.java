package day_Practice7_ForLoop;

public class Q05 {

	public static void main(String[] args) {
		// Aþaðýdaki þekilde çýktý veren programý print içerisinde
		// sadece bir tane # kullanarak yazýdýrýnýz

//		            #####
//		            #####
//		            #####
//		            #####
//		            #####

		
		for (int satir = 0; satir < 5; satir++) { // satir kontrolu ile 1 ile 6 da olurdur
			
			for (int sutun = 0; sutun <5; sutun++)  // sutun kontrolu for body tek satir oldugu icin {} kullanmadik
				System.out.print("#");
			
			System.out.println();
		}

	}

}
