package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		
		System.out.println(tarihSaat); // 2022-03-31T16:50:26.205919500
		
		System.out.println(tarihSaat.toString().startsWith("2022")); // true

	}

}
