package day_Practice7_ForLoop;

public class Q17 {

	public static void main(String[] args) {
//      1 2 3 4 5 6
//      2 3 4 5 6
//       3 4 5 6
//        4 5 6
//         5 6
//          6
		
		for (int satir = 1; satir <=6; satir++) {
			for (int bosluk = 1; bosluk < satir; bosluk++) {
				System.out.print(" ");
			}
			
			for (int rakam = satir; rakam <= 6; rakam++) {
				System.out.print(rakam + " "); // rakam+ " " olazsa saða dayalý olur düzgün üçgen olmaz
			}
			System.out.println();
		}

	}

}
