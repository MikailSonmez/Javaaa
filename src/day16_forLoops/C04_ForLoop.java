package day16_forLoops;

public class C04_ForLoop {

	public static void main(String[] args) {
		// 100 den baslayarak 50'ye(dahil) kadar olan sayilari
		// aralarinda virgul aralak ayni satirda yazdirin
		
		for (int i = 100; i > 50; i--) {
			System.out.print(i + ", ");
		}
		System.out.println(50);
		// 50 virgul gelmemesi icin sonrasinda // icine yazarsak yukaridaki kadar 50 yazar

	}

}
