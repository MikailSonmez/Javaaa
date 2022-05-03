package day00_Homeworks;

import java.util.Scanner;

public class C13_HomeWork {

	public static void main(String[] args) {
		// sayfa 110
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gmail adresi giriniz");
		
		String email=scan.next();
		
		int uzunluk=email.length();
		int index=email.lastIndexOf("@gmail.com");
		
		if (!email.contains("@gmail.com")) {
			
			System.out.println("lutfen gmail adresi giriniz");
			
		} else if(index==uzunluk-10){
			System.out.println("Email adresiniz kaydedildi");
		}else {
			System.out.println("lutfen yazimi kontrol edin");
			
		}
		scan.close();
	}

}
