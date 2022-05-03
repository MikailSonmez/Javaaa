package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabasi extends Isci{
	
	Ustabasi(){
		System.out.println("Ustabasi parametresiz costructor calisti");
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Ustabasi ust1=new Ustabasi();
		
		// Java da class olusturuldugunda otomatik
		// default constructor olustugu GIBI
		// Child class'da olusturulan her bir constructor'in
		// ilk satirda gizli super() constructor olusturur
		
		
		
		
		
	}

}
