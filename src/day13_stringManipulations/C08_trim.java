package day13_stringManipulations;

public class C08_trim {

	public static void main(String[] args) {
		//  Istedigimiz String'in basinda veya sonunda var olan bosluk /"space" leri temizler
		
		String str= "  Java ogrenmek cok guzel.  "; // bosluklari sildi
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		System.out.println(str.trim());
		
		System.out.println(str.trim().length());

	}

}
