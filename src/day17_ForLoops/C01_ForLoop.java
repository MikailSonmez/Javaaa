package day17_ForLoops;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// interview question kullanicidan 100'den kucuk bir tamsayi isteyin
		// 1'den baslayarak girilen sayiya kadar tum sayilari yazdirin, ancak;
		// -sayi 3'un kati ise sayi yerine "Java" yazdirin
		// -sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin
		// -sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
		
		int num=scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (i%3==0 && num%5==0) {
				System.out.println("Java Guzeldir");
			} else if(i%3==0){
				System.out.println("Java");
			}else if(i%5==0){
				System.out.println("Guzeldir");
			}else if(!((i%5)==0) || !((i%3)==0)){ // I did that for get rid of from numbers
				System.out.println(" ");
			}
			
		}
		scan.close();
	}

}
