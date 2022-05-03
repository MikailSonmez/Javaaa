package day000_Homeworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07 {

	public static void main(String[] args) {
		
		Integer [] arr= {1,2,3,45,6,8};
		
		largestArr(arr,5);
		System.out.println(largestArr(arr,5));
	}
	
	private static int largestArr(Integer [] arr, int i) {
		
		List<Integer> list=Arrays.asList(arr);
		Collections.sort(list);
		int large=list.get(i);
		return large;
	}

}
