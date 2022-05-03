package day33_StringBuilder;

public class C06_SubSequence {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		
		System.out.println(sb.substring(14)); // kolay String'e donusturur stringManipulation
		
		System.out.println(sb.subSequence(14, 19)); // kolay String'e donusturmez mutable'dir
		
		// ikisi de ayni sonucu dondurur
		// ancak substrin() String class'indan geldigi icin
		// substring() kullandigiminda arkasindan String method'larini kullanabilirim
		// Ancak, subSequence kullandigimda bu mumkun olmaz
	}
	

}
