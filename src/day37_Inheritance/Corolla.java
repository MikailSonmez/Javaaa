package day37_Inheritance;

public class Corolla extends Toyota{

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";
	
	
	public static void main(String[] args) {
		
				Corolla 				arb1			=			new 	Corolla();
		// Class ismi && Data turu//variable objesi//assignment//keyword//Constructor
				
		// Java da obje olusturdugumuz her class ismi ayni zamanda bir data turu'dur
		// Bu ornegimiz icn Corolla hem class adi, hem de olusturdugumuz arb1 objesinin data type'dir
		// Java'da obje uretilen her bir class ayni zamanda non-primitive data turu olur
				
				
		System.out.println(arb1.calisiyorMu); // true
		System.out.println(arb1.tekerSayisi); // 4
		System.out.println(arb1.uretimYeri); // Turkiye
				
		Toyota arb2= new Corolla();
		
		System.out.println(arb2.calisiyorMu); // true
		System.out.println(arb2.tekerSayisi); // 0
		System.out.println(arb2.uretimYeri); // Japonya
		
		Araba arb3=new Corolla();
				
		System.out.println(arb3.calisiyorMu); // true
		
		Araba arb4= new Corolla();
		
		System.out.println(arb4.calisiyorMu); // true
		
		
	}

}
