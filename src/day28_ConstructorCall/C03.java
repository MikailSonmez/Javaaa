package day28_ConstructorCall;

public class C03 {

	public static void main(String[] args) {
		// C02 deki olaylar bastan basladi bu yuzden java bastan calisti
		// bu yuzden data base de saklariz
		// cunku java 0 dan baslar
				
		// java run time bir programdir
		// run tusuna bastigimizda java calismaya baslar ve islemleri yapar
		// javanin isi bittiginde (calisma tusu kirmizidan geriye dondugunde)
		// hersey basa doner
				
		// static variable ve method'lar bulunduklari class ile ilintilidir (obje ile degil class ile)
		// baska bir class'da iken C02'deki static variable veya method'a ulasmak istedigimizde
		// C02.staticVariableIsmi ve C02.staticMethodIsmi() yazmamiz yeterli olur
		
			C02 obje1= new C02();
			System.out.println("obje 1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
			// obje 1 icin x : 5 obje1 icin y : 10
				
			obje1.x++;
			C02.y++; // obje1.y++; boyle yazarsak
	// static bir variable'a class ismi uzerinden ulasmak yerine
	// istance variable'lar gibi obje ile ulasmaya calisirsaniz
	// Java CTE vermez ama solda ! isareti ile bizi uyarir
	// "static bir field olan C02.y'ye static yoldan ulas" der
			System.out.println("obje 1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
			// obje 1 icin x : 6 obje1 icin y : 11
				
			C02 obje2= new C02();
			System.out.println("obje 1 icin x : " + obje2.x + " obje1 icin y : " + C02.y);
			// obje 1 icin x : 5 obje1 icin y : 11
			// yeni objede instance variable eski halini(5) oldu static variable(11)
			// artmis hali olan 11 oldu
				
			obje2.x++;
			C02.y++;
			System.out.println("obje 1 icin x : " + obje2.x + " obje1 icin y : " + C02.y);
			// obje 1 icin x : 6 obje1 icin y : 12
				
			System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in"
					+ " x : " + obje1.x + " y : " + C02.y);
			// obje 2 olusturulduktan ve islemden sonra obje1'in x : 6 y : 12
			// staticler degisikligi class'a gore instance objeye gore degisir
				
				
			C02 obje3= new C02();
				
			obje3.x=20;
			C02.y=40;
				
			System.out.println("obje3'den sonra obje1'in x :" + obje1.x); //6
			System.out.println("obje3'den sonra obje1'in x :" + obje2.x); //6
			System.out.println("obje3'den sonra obje1'in x :" + obje3.x); //20
				
			System.out.println("obje3'den sonra obje1'in y :" + C02.y); //40
			System.out.println("obje3'den sonra obje1'in y :" + C02.y); //40
			System.out.println("obje3'den sonra obje1'in y :" + C02.y); //40


		}

}
