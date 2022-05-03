package day43_Interface;

public interface C02_Interface {
	
	
	void motor(); // normal class'larda access modifier yazmassaniz java default access
	// modifier kabul eder, interface'de access modifier yazmazsaniz java public kabul eder
	
	
	int sayi=10; // public, final ve static olarak kabul etti
	// atama yapmak zorunlu
	
	// interface'de body'si olan bir method yazmak isteseniz
	// Java size 2 alternatif sunar
	// 1- method'un basina "default" keyword yazabilirisiniz
	//    ancak burada yazilan default access modifier degil
	//    Javan'in interface icin ozel kabul ettigi bir keyword'dur
	public default void kaporta() {
		System.out.println("default keyword sayesinde body olusturabildim");
	}
	
	public static void sanzuman() {
		
	}
}
