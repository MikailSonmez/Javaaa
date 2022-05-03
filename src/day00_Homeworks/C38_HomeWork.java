package day00_Homeworks;

public class C38_HomeWork {

	
	
		public static void main(String[] args) {
			
			// 0 1 1 2 3 5 8 13 21 34 ....
			
			int x=0;
			int y=1;
			int sum=0;
			
			for (int i = 0; i < 10; i++) {
				System.out.println(x+" ");
				sum=x+y;
				x=y;
				y=sum;
			}
		}
}
