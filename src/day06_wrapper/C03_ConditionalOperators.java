package day06_wrapper;


public class C03_ConditionalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// System.out.println(5+3==8 || 6+5==10 || 7-2==3); // true
		
		// System.out.println(5+3==8 && 6+5==10 && 7-2==3);  // false
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c ; // or isareti 1 tane true varsa true
		
		System.out.println(sonuc); // true
		
		// && isareti & de kullanilabilir ancak arada bir nuans var
		// && de 1 tane false buldum mu durur
		// & de false bulsa da sona kadar calisir
		
		// System.out.println(5+3==8 && 6+5==10 && 7-2==3); // false
		
		// System.out.println(5+3==8 & 6+5==10 & 7-2==3); // false
		
		int yas=50;
		int boy=180;
		char cinsiyet = 'M';
		
		System.out.println(yas<30 && boy>170 && cinsiyet== 'M'); //
		//1. false oldugu icin digerlerine bakmaz
		
		
	}

}
