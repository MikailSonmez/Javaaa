package day_Practice7_ForLoop;

public class Q15 {

	public static void main(String[] args) {

	    /*
	        A
	        A B
	        A B C
	        A B C D
	        A B C D E
	        A B C D E F
	        �eklini yazd�r�n�z.  65=A'n�n asc�� de�eri
	        */
		
		int harf=65;
		for (int satir = 0; satir < 6; satir++) { // satir control
			
			for (int sutun = 0; sutun <= satir; sutun++) { // sutun control
				System.out.print((char) (harf+sutun)+ " ");
			}
			
			System.out.println();
		}

	}

}
