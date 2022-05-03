package day_Practice6_MethodCreation;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		 /*
	    Problem tanımı:
	    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
	    String parametreli return type li reverseWord isminde bir method yazınız
	     Test DAta :
	    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
	    Output : versin açıklığı zihin arkadaşlara Javacı Allah
	     */
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Cumle giriniz: ");
	        String str = scanner.nextLine();
	        
	        System.out.println(reverseWord(str));
	        
	        scanner.close();

	}

	private static String reverseWord(String str) {
		
	String[] arr = str.trim().split(" "); //split: her " " space den sonra her elemanı virgülle ayırır.
		
	String strTers= "";
	
	for (int i = arr.length -1; i >= 0; i--) {
		
		strTers += arr[i] + " ";
	}
		return strTers.trim();
	}

}
