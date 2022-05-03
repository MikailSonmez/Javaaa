package day34_accessModifier;

public class C06_Encapsulation {

	public static void main(String[] args) {
		
		
		C05 obj1=new C05();
		System.out.println(obj1.getAsgariMaas()); // 4000
		// obj1.getAsgariMaas()=3000; // getAsgariMaas() ile okuyabiliriz ama degistiremeyiz
		// C05 class'inda asgariMaas'i private yapip getter() kullandigim icin
		// asgari maasi gorebiliryorum ama degistiremiyorum
		
		// classic access modifier'larimiz ile bir variable'a ulasilabilirsek
		// istedigimiz zaman degistirme secenegimiz olur

	}

}
