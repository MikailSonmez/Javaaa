package day000_Homeworks;

public class C13 {

	
		public static void main(String[] args) {
			
			/*
		    Q4  From a given array find all pairs whose sum is a given number
		verilen bir arraydeki, toplami belirli bir sayi olan tüm çiftleri bulun
		           For example; 
		           input :  {4, 6, 5, -10, 8, 5, 20} ==> 10
		           Output :  4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10 
		 */
			
			
			int number=10;
			int arr[]= {4,6,5,-10,8,5,20};
			
			findPairs(arr,number);
		}

		private static void findPairs(int[] arr, int number) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i]+arr[j]==number) {
						System.out.println(arr[i] + "+" + arr[j] + "=" + number);
					}
				}
			}
			
		}
}
