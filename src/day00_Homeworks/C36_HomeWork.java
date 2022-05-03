package day00_Homeworks;

public class C36_HomeWork {

	public static void main(String[] args) {
		
		
		// !5 = 5*4*3*2*1 = 120
		// !4 = 4*3*2*1 = 24
		
		int carpim=1;
		int fact=5;
		
		for (int i = 0; i <= fact; i++) {
			carpim*=i;
			
		}
		System.out.println(carpim);
	}

}
