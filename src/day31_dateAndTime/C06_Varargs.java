package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// verilen sayilari toplayan bir method olusturmak istiyorum
		//
		
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		topla(a,b); // iki sayinin toplami : 30
		topla(a,b,c); // uc sayinin toplami : 60
		topla(a,b,c,d); // varargs calisir
		topla(a,b,c,d,e); // varargs calisir
		topla(a,b,c,d,e,f); // varargs calisir

		
		// suana kadar gordugumuz tekniklerle degisken parametreli tek bir method olusturamayiz
		// variety arguments
	}

	private static void topla(int... a) {
		System.out.println("varargs calisir");
	}

	private static void topla(int a, int b, int c) {
		System.out.println("uc sayinin toplami : " + (a+b+c));
		
	}

	private static void topla(int a, int b) {
		
		System.out.println("iki sayinin toplami : " + (a+b));
		
	}

}
