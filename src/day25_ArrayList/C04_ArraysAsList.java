package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array'i Arrays class'indan yardim alarak
		// liste'e cevirebiliriz
		
		String arr[]= {"A","b","C","d"};
		
		List<String> arraydenList = Arrays.asList(arr);
		
		System.out.println("List : " + arraydenList); // [A, b, C, d]
		
	// arraydenList.add("F"); // Run Time Error : UnsupportedOperationException : Desteklenmeyen Islem
						// CTE olmasi icin syntax\te problem olmasi lazim, ancak bu yazimda
						// syntax hatasi yok
		// bu sekilde Arrays class'inndan yardim alarak array'i list'e cevirirsek
		// olusturdugumuz list'in boyutu sabit olur
		// dolayisiyla add() veya clear() gibi method'lari calistirmak istersek
		// UnsupportedOperationException hatasi verir
		
		arr[1]="Z";
		System.out.println("Array'i degistirdikten sonra, array = " + Arrays.toString(arr));
		// Array'i degistirdikten sonra, array = [A, Z, C, d]
		System.out.println("Array'i degistirdikten sonra, list = " + arraydenList);
		// Array'i degistirdikten sonra, list = [A, Z, C, d]
		
		arraydenList.set(3, "D");
		System.out.println("Array'i degistirdikten sonra, list2 = " + arraydenList);
		// Array'i degistirdikten sonra, list2 = [A, Z, C, D]
		System.out.println("Array'i degistirdikten sonra, array2 = " + Arrays.toString(arr));
		// Array'i degistirdikten sonra, array2 = [A, Z, C, D]

	}

}
