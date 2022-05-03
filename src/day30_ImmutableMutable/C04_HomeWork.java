package day30_ImmutableMutable;

public class C04_HomeWork {

	public static void main(String[] args) {
		// soru
		
		String a="";
		
		a+=2;
		
		a+='c';
		
		a+=false;
		
		if (a=="2cfalse") {
			System.out.println("==");
		}
		
		if (a.equals("2cfalse")) {
			System.out.println("equals");
		}
		
		// equals verir

	}

}
