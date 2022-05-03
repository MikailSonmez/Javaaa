package day000_Homeworks;

public class C03 {

	public static void main(String[] args) {
		
		/*
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 */
		
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j >=i ; j--) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}

}
