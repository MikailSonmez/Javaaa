package day09_NestedIfElse;

public class C04_Practice {

	public static void main(String[] args) {
		// 
		
		int y=1;
		
		int z=1;
		
		int a= y<10 ? y++ : z++;
		System.out.println(y+"," + z + "," + a);
		// y=2 z=1 a=1
	}

}
