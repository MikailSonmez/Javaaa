package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_UpperCaseLowerCase {

	public static void main(String[] args) {
		// verilen stringin tamamini buyuk veya kucuk harfe cevirir
		
		String isim="aLI"; // Ali olarak yazdiralim
		System.out.println(""+isim.toUpperCase().charAt(0)+
						isim.toLowerCase().charAt(1)+ isim.toLowerCase(Locale.ENGLISH).charAt(2));
		
		// turkce lokal harfler kullanarak tamamini kucuk harfe cevirelim
		System.out.println(isim.toLowerCase(Locale.ENGLISH));
	}

}
