package day20_scope;

public class StaticVariables {

	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
	public static void main(String[] args) {
		// static variable'lara main method'dan direk ulasilabilir mi? EVET
		
		System.out.println(no); //20
		no++;
		System.out.println(no); //21
		staticMethod();
		// staticMethod da artip geldi
		System.out.println(no); //22
		
		StaticVariables obje=new StaticVariables();
		obje.staticOlmayanMethod();
		// staticOlmayanMethod'dan artip geldi
		System.out.println(no); // 24
	}
	
	public static void staticMethod(){
		// static variable'lara main method'dan direk ulasilabilir mi? EVET
		no++;
		System.out.println("static method'da sayi : " + no);  // 22
	}
	public void staticOlmayanMethod() {
		// static variable'lara main method'dan direk ulasilabilir mi? EVET
		// static variable'lara static olan ve olmayan tum method'lardan ulasilabilir
		// bu yuzden static variable'lara CLASS VARIABLE denir
		no++;
		System.out.println("static olmayan method'da no : " + no); //23
		no++;
	}

}
