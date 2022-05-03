package day_Practice9_Arrays;

public class Q18 {

	public static void main(String[] args) {
		// kullanýcýdan alýnan bir  String'deki herbir  karakterin adedini 
		//bir array içinde yazdýran bir java programý yazýn.
        // String  "Javacilar cook afilli" ise cevap þöyle olmalýdýr:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
		
		String str = "Javacilar cook afilli";
		
		int count[] = new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			
			count[str.charAt(i)]++;
			
			
		}
		char ch[] = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			
			int find = 0;
			
		
			for (int j = 0; j < ch.length; j++) {
				// if any matches found: Herhangi bir eslesme bulunursa
				
				if (str.charAt(i) == ch[j]) 
					find++;
			}
			if (find == 1) 
				System.out.println(str.charAt(i) + " = " + count[str.charAt(i)] + ", ");
			
		}

	}

}
