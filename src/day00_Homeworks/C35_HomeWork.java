package day00_Homeworks;

public class C35_HomeWork {

	public static void main(String[] args) {
		
		
		int num = 50;
		int sum = 0;
		int sum1= 0;
		
		//1+2+3+4+5...100=5050
		
		
		for (int i = 0; i <=num ; i++) {
			sum = sum+i;
		}
		System.out.println("sum is: " + sum);
		
		// Second way
		System.out.println("----------");
		
		int k =1;
		while (k <=num) {
			sum1 = sum1+ k;
			k++;
		}
		System.out.println("sum with while is: "+ sum1);
	}

}
