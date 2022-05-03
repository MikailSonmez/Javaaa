package day000_Homeworks;

public class C01 {

	public static void main(String[] args) {
		
		// tam bolen sayilar
		
		int number = 66;
		System.out.println(number + " sayisinin tam bolenleri");
		
		for (int i = 1; i <= number; i++) {
			if (number%i==0) {
				System.out.print(i + " ");
			}
		}
	}

}
