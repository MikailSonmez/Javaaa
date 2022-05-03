package day13_stringManipulations;

public class C07_substring2 {

	public static void main(String[] args) {
		// 
		
		String str1= "Java OOP konsepti kullanir";
		
		System.out.println(str1.substring(5,11)); // OOP ko

		System.out.println(str1.substring(3,4)); // a
		
		System.out.println(str1.substring(8,8)); // hiclik verir
		
		System.out.println(str1.substring(8,2)); // runtimeerror yururlulukte error
							// diger error compile time errordur kod alti cizili olunca verir

	}

}
