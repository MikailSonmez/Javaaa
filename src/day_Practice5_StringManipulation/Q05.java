package day_Practice5_StringManipulation;

public class Q05 {

	public static void main(String[] args) {
		/*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
     */
		
		String str1="$13.99";
		// regex karakter ile
		// str1=str1.replaceAll("\\D, ""); // rakamlar disindaki hersey "" ile degistirildi
		// replace methodu ile
		str1=str1.replace("$", "");
		System.out.println(str1); // 13.99
		
		String str2= "$10.55";
		// str2=str2.replaceAll("\\D", "");
		str2=str2.replace("$", ""); // $ yerine "" ile degistirildi
		System.out.println(str2); // 10.55
		
		// str1 ve str2 icerigi sayi olan String'lerdir
		// Eger iceriginin tamamen sayi oldugunu bildigimiz String varsa
		// parseDouble() veya parseInteger() methodu kullanabiliriz
		// ancak primitive data tipleri method'a sahip olmadiklarindan wrapper class kullanmam lazim
		
		System.out.println(str1+str2); //13.9910.55 // string topladi
		
		double sayi1= Double.parseDouble(str1); // bu method olmazsa stringi aritmetik toplayamazsiniz
		double sayi2= Double.parseDouble(str2);
		double toplam= (sayi1+sayi2);
		System.out.println("$" + toplam); // $24.54

	}

}
