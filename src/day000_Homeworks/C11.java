package day000_Homeworks;

public class C11 {

	
		public static void main(String[] args) {
			/*
			 * Check if the integer is an Armstrong numbers
			 * Armstrong sayi: herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong sayidir
			 * 
			 * 
			 *  153= 1*1*1 + 5*5*5 + 3*3*3 = 153
			 *  370= 3*3*3 + 7*7*7 + 0*0*0 = 370
			 */
			
			
			int numara=153;
			int sayi;
			int total=0;
			int temp;
			sayi=numara;
			
			
			while (sayi!=0) {
				temp=sayi%10;
				total+=temp*temp*temp;
				sayi/=10;
			}
			
			if (total==numara) {
				System.out.println("armstrong sayidir");
			} else {
				System.out.println("armstrong sayi degildir");
			}
			
			
			
			
			
			
		}
}
