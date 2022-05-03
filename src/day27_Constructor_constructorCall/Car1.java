package day27_Constructor_constructorCall;

public class Car1 {

	int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}
	
	// ben 5 ozelligi birden degistiren bir constructor urettigimde
	// java default constructor'i siler
	// bu durumda daha onceden yazilan ve default constructoru'i kullanan tum kodlar coker
	// bu durumda kodlari duzeltmek icin javanin sildigi default constructor yerine
	// parametresiz bir constructor olusturmaliyim
	
	
	public Car1() {
		// parametresiz constructor uremenin syntax'i classAdi+() {}
	}
	
	
	
	/*public Car1(int i) { // bu satirdaki int km ile class level'daki int km 
							// farkli scope'lardadir
							// yukaridaki int km den farkli scopededir
						 	// C02 deki 35000 i buraya getirdi
		km=i;
	}*/

	
	
	public Car1(int i) { // C02 deki 35000 i buraya getirdi
		// TODO Auto-generated constructor stub
		km=i;
	}

	
	
	
	
	
	public Car1(int i, int j) {
		// TODO Auto-generated constructor stub
		yil=i;
		km=j;
		
		
	}

	public void hiz(int hiz) {
		System.out.println("araba saatte " + hiz + " km yapar");
	}
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}
}
