package day22_Arrays;

public class C04_MultiDimensionalArray_Soru {

	public static void main(String[] args) {
		// Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
				// ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
		int arr[][]=new int [2][3];
		
		arr [0][0]=1;
		arr [0][1]=2;
		arr [0][2]=3;
		
		arr [1][0]=4;
		arr [1][1]=5;
		arr [1][2]=6;
		int carpim=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
					carpim*=arr[i][j];
				System.out.print(carpim);
			}
			
			
		}
	}

}
