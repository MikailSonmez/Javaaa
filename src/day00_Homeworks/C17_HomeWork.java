package day00_Homeworks;

import java.util.Scanner;

public class C17_HomeWork {

	public static void main(String[] args) {
		// sayfa 141
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 100 'den kucuk bir tam sayi yazin");
		
		int num=scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (i%3==0 && i%5==0) {
				System.out.println("Java Guzeldir");
			} else if(i%3==0){
				System.out.println("Java");
			}else if(i%5==0){
				System.out.println("Guzeldir");
			}else if(!((i%5)==0) || !((i%3)==0)){ // I did that for get rid of from numbers
				System.out.println(" ");
			} 
		if (num>100) {
		System.out.println("sayi 100 den buyuk"); {
			break;
		}
			
		}
		scan.close();
	}

}
}
