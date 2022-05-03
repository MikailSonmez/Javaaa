package day34_accessDeneme;

import day34_accessModifier.C01;

public class C02_BaskaPackageChildClass extends C01{

	
	public static void main(String[] args) {
		
		C01 obj=new C01();
		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault); 
		// System.out.println(obj.sayiProtected); // main method'dan ulasamamamizin sebebi static klubu ile ilgili
											// static yapinca chill'da ulastik
		System.out.println(obj.sayiPublic); 
		

	}
	
	public void staticOlmayanMethod() {
		C01 obj=new C01();
		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault);
		// System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}

}
