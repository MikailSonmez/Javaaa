package day10_ternary_SwitchCase;

public class C11_StringManipulasionConcat {

	public static void main(String[] args) {
		// String oalrak verilen bir degisken + le baska bir degikenle isleme sokulursa
		// JAVA bunlari yan yana ekler. Buna concatenation denir.
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim+" "+soyisim); // Ali Can
		
		System.out.println(isim.concat(soyisim)); // AliCan
		
		System.out.println(isim.concat(" ".concat(soyisim))); // Ali Can
	}

}
