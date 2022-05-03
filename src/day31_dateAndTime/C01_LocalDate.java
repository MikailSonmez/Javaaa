package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih= LocalDate.now();
		
		System.out.println(tarih); // 2022-03-31
		
		System.out.println(tarih.getDayOfYear()); // 90
		System.out.println(tarih.getDayOfMonth()); // 31
		System.out.println(tarih.getDayOfWeek()); // THURSDAY
		System.out.println(tarih.getMonthValue()); // 3
		System.out.println(tarih.getMonth()); // MARCH
		
		
		System.out.println(tarih.plusDays(20)); // 2022-04-20
		System.out.println(tarih.plusMonths(5)); // 2022-08-31
		System.out.println(tarih.plusWeeks(15)); // 2022-07-14
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10)); //2033-02-10
		
		System.out.println(tarih.minusDays(20)); // 2022-03-11
		System.out.println(tarih.minusWeeks(20)); // 2021-11-11
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5)); // 2016-10-26

		System.out.println(tarih.minusYears(21).isLeapYear()); // false
		
		
		LocalDate dogumTarihi1= LocalDate.of(1998, Month.JANUARY, 12);
		LocalDate dogumTarihi2= LocalDate.of(2000, 01, 12);
		LocalDate dogumTarihi3= LocalDate.of(1985, 10, 10);
		
		System.out.println(dogumTarihi1 + ", " + dogumTarihi2); // 1998-01-12, 2000-01-12
		
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2)); // false
		System.out.println(dogumTarihi3.isBefore(dogumTarihi1)); // true

	}

}
