package day10_ternary_SwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// eger calisan kadinsa 60 yasindan buyuk oldugunde emekli olabilir,
		// calisan erkekse 65 yasindan buyukse emekli olabilir
		
		// her seferinde scanner olusturmak yerin
		// test datalarimizi variable olarak da olusturabiliriz
		// ve kodun yazimi bittiginde bu test datalarini degistererek
		// kodlarimizi test edebiliriz
		
		char cinsiyet ='E';
		int yas=60;
		
		String sonuc=cinsiyet=='E' ? (yas>=60) ? "Emekli olabilirsin": "Emekli olamazsin":
									 (yas>=65) ? "Emekli olabilirsin": "Emekli olamazsin";
		
		System.out.println(sonuc);
	}

}
