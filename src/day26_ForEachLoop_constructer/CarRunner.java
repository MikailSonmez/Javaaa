package day26_ForEachLoop_constructer;

public class CarRunner {

	public static void main(String[] args) {
		// Car class'indan bir obje olusturalim
		
		Car 				car1		=		new 		Car();
		// class ismi		obje ismi	atama	keyword		// Constructer
		
		
		System.out.println(car1.km + " " + car1.model + " " +
						car1.renk + " " + car1.yil); // 0 null null 2000
		
		// Bir obje olustururken eger obje icin kendi class'inda belirlenen degerleri
		// kullanmak istiyorsam hicbir degeri kendim atamadan obje olusturabilirm
		// bu durumda hicbir parametre kullanilmadigi icin default constructor
		// yeterli olacaktir
		
		// Eger obje olusturdugum class'daki degeleri kullanmak yerine kendi degerlerimle
		// bir obje olusturmak istersem o zaman parametreli constructor olusturmam gerekir
		
		 // Car car2= new Car("Kirmizi", "Corolla");
		
		// Car class'inda iki String parametresi olan bir constructor olmadigi icin
		// bu obje olusturmayi simdi yapamayiz
	}

}
