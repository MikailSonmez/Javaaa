package day34_accessModifier;


public class C01 {

	private int sayiPrivate=10;
	// private class uyelerine sadece icinde bulundugu class'dan ulasabiliriz
	
	int sayiDefault=20;
	// default class uyelerine sadece icinde bulundugu package'dan ulasilabilir
	// dafault access modifier'in diger ismi de package access modifier'dir
	
	protected int sayiProtected=30; // static yapinca child class'la ulasti bi hata var ama ilerde cozcez
	
	// protected class uyelerine icinde bulunduguu package'daki tum class'lar
	// ve baska package'lardaki child class'lar ulasabilir
	
	public int sayiPublic=40;
	// public class uyelerine tum package'lardaki tum class'lardan ulasilabilir
	
	
	public static void main(String[] args) {
		
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}
	
	public void staticOlmayanMethod() {
		
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}

}
