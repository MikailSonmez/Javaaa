package day00_Homeworks;

public class C47_HomeWork {
	
	
	public static void main(String[] args) {
		
		//3^4 = 81
		
		int us=4;
		int taban=3;
		int sonuc=1;
		
		/*for (int i = 1; i <=4 ; i++) {
			sonuc*=taban;
		}
		
		*/
		
		while (us!=0) {
			sonuc*=taban;
			us--;
		}
			
		System.out.println(sonuc);
		
	}
		
}
