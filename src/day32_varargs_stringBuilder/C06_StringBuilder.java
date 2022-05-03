package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		// StringBuilder mutabladir atamaya gerek yoktur direkt yazinca list ve array gibi atar
		// String unmutabledir atama yapmadan degismez
		// Multi-thread icin StringBuffer kullanilir fakat yavastir
		
		@SuppressWarnings("unused")
		String str = "Ali Can";
		
		@SuppressWarnings("unused")
		String str2= new String("Veli Cem");
		
		StringBuilder sb = new StringBuilder("Yasasin Java");
		
		sb.append("!!!");
		
		System.out.println(sb); // Yasasin Java!!! StringBuilder list ve array gibi direkt
								// atama yapmadan !!! yi yazdirir
		sb.toString().toUpperCase();
		
		System.out.println(sb); // Yasasin Java!!! String'e cevirdik diye buyuk harf yapmadi
								// cunku atama yok buyuk harf yazdirmadi

	}

}
