package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List_Size_Empty {

	public static void main(String[] args) {
		// verilen bir array'dan istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
		
		int arr[]= {3,4,5,6,3,5};
		int silinecekEleman=6;
		
		List<Integer> gecici=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != silinecekEleman) {
				gecici.add(arr[i]);
			}
		}
		System.out.println(gecici); // [3, 4, 5, 3, 5]
		// list olarak istenmeyen eleman haric tum elemanlari goruruz
		
		// sonucu array olarak istiyorsak
		// listedegkileri yeni array'e ekleyebiliriz
		
		int yeniArray[]= new int[gecici.size()];
		
		for (int i = 0; i < yeniArray.length; i++) {
			
			yeniArray[i]= gecici.get(i);
			
		}
		// yeni array'imizi yazdiralim
		System.out.println(" Array olarak : " +Arrays.toString(yeniArray));
		//  Array olarak : [3, 4, 5, 3, 5]
	}

}
