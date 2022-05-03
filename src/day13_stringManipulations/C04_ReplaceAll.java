package day13_stringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		// Regular expressions
		
		
		String str= "*Java 98ogrenmek c..ok k876olay";
		
		// replaceAll methodlari kullanarak Java ogrenmek cok kolay
		
		str=str.replaceAll("\\d", "");	// d ile rakamlar gitti // *Java ogrenmek c..ok kolay // rakamlari sildik
		
		System.out.println(str); 
		
		str=str.replaceAll("\\s", "x");  // Javaxogrenmekxc..okxkolay
		
		System.out.println(str); 
		
		str=str.replaceAll("\\W", ""); // buyuk w ile // Javaogrenmekcokkolay // harfler kaldi sadece
		
		System.out.println(str);
		
		str=str.replaceAll("x", " "); // Java ogrenmek cok kolay
		
		System.out.println(str);
		
		// str=str.replaceAll("\\w", ""); // kucuk w ile // *  ..  //harfleri sildik
		// str=str.replaceAll("\\s", "x"); //s space x yerine bosluk yazar // Javaxogrenmekxc..okxkolay
		
		
		/*Regular Expression	Description
				\d
				
				Any digit, short for [0-9]
				
				\D
				
				A non-digit, short for [^0-9]
				
				\s
				
				A whitespace character, short for [ \t\n\x0b\r\f]
				
				\S
				
				A non-whitespace character, short for
				
				\w
				
				A word character, short for [a-zA-Z_0-9]
				
				\W
				
				A non-word character [^\w]
				
				\S+
				
				Several non-whitespace characters
				
				\b
				
				Matches a word boundary where a word character is [a-zA-Z0-9_]

		 */
		
		
		

	}

}
