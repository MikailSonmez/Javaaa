package day12_IndexOf;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		// kullanicidan email adresini girmesini isteyin,
		// 	-mail @gmail.com icermiyorsa "lutfen gmail adersi giriniz"
		// 	-@gmail.com ile bitiyorsa "Email adresiniz kaydedildi" ,
		// 	-@gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin" yazdirin
		
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
