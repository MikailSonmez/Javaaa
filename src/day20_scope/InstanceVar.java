package day20_scope;

public class InstanceVar {

	
	int notMat=50;
	int notFen;
	// instance variable'larin scope'unda main method yoktur
		
	public static void main(String[] args) {
		
		// System.out.println(notMat); // main method static oldugu icin static
									// olmayan variable'lar main method'da direk
									// olarak kullanilamaz veya goruntulenemez
		// instance variable'lara main method'dan ulasmak istersek obje olusturup
		// obje uzerinden erisim saglayabiliriz
		
		// Scanner scan=new Scanner(System.in)
		// icinde oldugumun class'dan bir obje olusturalim
		InstanceVar celil=new InstanceVar();
		System.out.println(celil.notMat); // 50
		
		InstanceVar nihal=new InstanceVar();
		
		nihal.notMat=70;
		System.out.println(nihal.notMat);
		// instance variable'larda deger atamazsak java instance olarak atanan degeri
		// alir, bu class icin notMat=50 gibi nihali 70 yapinca 70 i aldi
		// istersek bu sekilde deger atayabiliriz bu durumda yeni deger gecerli olur
		
		System.out.println(celil.notMat); // 50
		// celil'in notunu degistirmek istiyorsak celil.notMat'a deger atamaliyiz
		celil.notMat=90;
		System.out.println(celil.notMat); // 90
		
		celil.method2(); // method2 static olmadigi icin main method'dan direk cagirilamaz
		
	}
	
	public static void staticMethod() {
		// System.out.println(notFen); // instance variable'lara static method'lardan
									// direkt ulasilamaz
	}
	
	public void method2() {
		System.out.println("method2'deki notfen : " + notFen); // bu method static olmadigi icin instance variable //0
									// 'lara direkt ulasabilir
		// instance variable olusturulurken deger atanmasa da olur
		// bu durumda java default degerler atar
		// int icin default deger 0'dir boolean icin false String icin null
		notFen=100;
		System.out.println("method2'deki notfen : " + notFen); //100
	}

}
