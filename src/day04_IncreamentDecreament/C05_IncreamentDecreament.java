package day04_IncreamentDecreament;

public class C05_IncreamentDecreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// atama islemi varsa kalici degisir
		// atama islemi olmadan yapilan toplama, cikarma vs islemler sadece o satirda yapilir
		// sayinin degerini kalici olarak degistirmez
		
		int sayi1=10;
		
		System.out.println(sayi1+=5);
		// bu islem sayi1'in degerini 5 artirip sayi1'e assign ediyor
		// dolayisiyla sayi1'in degerini kalici olarak degisiyor
		
		System.out.println(sayi1); //15
		
		
		System.out.println(sayi1+12); // 27
		
		System.out.println(sayi1); //15
		
		sayi1++;
		// her ne kadar = isareti gorunmese de sayi1++ isleminde assign vardir kalicidir
		System.out.println(sayi1); //16
		
		System.out.println(sayi1+1); // 17
		
	}

}
