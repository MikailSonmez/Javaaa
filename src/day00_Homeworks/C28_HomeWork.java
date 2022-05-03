package day00_Homeworks;

public class C28_HomeWork {

	public static void main(String[] args) {
		// Swap numbers with temporary variable
		
		int a=10;
		int b=20;
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("a'nin degeri " + a);
		System.out.println("b'nin degeri " + b);
		
		int x=100;
		int y=40;
		
		x-=y;
		y+=x;
		x=y-x;
		System.out.println("x'in degeri " + x);
		System.out.println("y'nin degeri " + y);
	}

}
