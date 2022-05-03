package day34_accessDeneme;

import day34_accessModifier.C01;

public class C01_BaskaPackage {

	
	public static void main(String[] args) {
		
		C01 obj=new C01();
		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault); // sadece ayni package'dakiler ulasilabilir
		// System.out.println(obj.sayiProtected); // ayni package'daki class'lar ve child class'lar ulasabilir
		System.out.println(obj.sayiPublic);
	}
}
