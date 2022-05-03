package day32_varargs_stringBuilder;

public class C05_Varargs {

		public static void main(String[] args) {
		
		topla(5,10,13,0);
		
		// varargs'san once farkli parametreler kullanilabilir
		// ama varargs'dan sonra parametre yazilamaz
		// yazarsaniz java vararg son parametre olmalidir diye sizi uyarir
		// ve CTE verir
		}

		private static void topla(int... sayilar) { // String sonparametre bu yada int eklersek varargs'tan sonra kabul etmez
		
		int toplam=0;
		for (int each : sayilar) {
			
			toplam+=each;
		}
		System.out.println("girilen sayilarin toplami : " + toplam);
		// girilen sayilarin toplami : 51
			
	}

}
