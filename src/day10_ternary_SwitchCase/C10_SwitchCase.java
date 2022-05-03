package day10_ternary_SwitchCase;

public class C10_SwitchCase {

	public static void main(String[] args) {
		// verilen sayiyi inceleyin
		// girilen sayi
		// 10 ise "iki basamakli en kucuk sayi
		// 100 ise " uc basamakli en kucuk sayi"
		// 1000 ise "dort basamakli en kucuk sayi"
		// diger durumlarda "girdiginiz sayiyi degistir" yazdirin
		
		int sayi=1000;
		
		switch(sayi) {
		
		case 10 :
			System.out.println("Iki basamkli en kucuk sayi");
			break;
		case 100 :
			System.out.println("Uc basamkli en kucuk sayi");
			break;
		case 1000 :
			System.out.println("Dort basamkli en kucuk sayi");
			break;
		default:
			System.out.println("Sayiyi degistirin");
		}

	}

}
