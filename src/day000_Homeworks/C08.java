package day000_Homeworks;

public class C08 {
	
	
		public static void main(String[] args) {
			
			int [] arr = {1,2,57,4,56,3,5,8};
			
			enBykSayi(arr,7);
			System.out.println(enBykSayi(arr,7));
		}

		private static int enBykSayi(int[] arr, int i) {
			int dp;
			for (int j = 0; j < i; j++) {
				for (int j2 = j+1; j2 < i; j2++) {
					if (arr[j]>arr[j2]) { // amac en buyuk sayiyi j2'nin yerlestirme. if'de yapilan islem j indeksi j2'den buyukse birbiriyle yer degistiriyor
						dp=arr[j];			// j2 < i(7) oldugu icin j2 son indeksteki 8 sayisina gelemiyor ve en buyuk sayi sondan bir onceki sayiya yerlestiriliyor
						arr[j]=arr[j2];
						arr[j2]=dp;
					}
				}
			}
			return arr[arr.length-2];
		}
}
