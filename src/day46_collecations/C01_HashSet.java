package day46_collecations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		// verilen bir array'deki tekrar eden sayilari silip
		// unique degerlerden olusan bir array olusturun
		
		int arr[]= {3,4,6,4,2,4,6,8,6,5,3,1,2,4,6,7};
		
		Set<Integer> benzersizSet=new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
		}
		System.out.println(benzersizSet); // [1, 2, 3, 4, 5, 6, 7, 8]
		
		Object[] tekrarsizArr = benzersizSet.toArray();// Set'i array'e cevirir
		
		System.out.println(Arrays.toString(tekrarsizArr)); //[1, 2, 3, 4, 5, 6, 7, 8]
	}
}
