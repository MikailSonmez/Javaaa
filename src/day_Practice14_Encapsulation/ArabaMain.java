package day_Practice14_Encapsulation;

public class ArabaMain {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Araba honda = new Araba(); // p'siz cons honda obj create edildi
		//  honda.setMotor(1300);
	    //  honda.setModel("civic");
	    //  honda.setYil(20212);
	    //  honda.getModel();
	    //  System.out.println(honda.getYil());
		
		Araba volvo = new Araba("xc9o", "beyaz",20,2020);
		Araba ww = new Araba("passat", "kirmizi",1600,-2021);
		System.out.println("sectiginiz arac volvo -> "+"yili : "+volvo.getYil()+" renk :"+volvo.getRenk()+" motor : " +volvo.getMotor());
		System.out.println("sectiginiz arac wW -> "+"yili : "+ww.getYil()+" renk : "+ww.getRenk()+" motor : "+ww.getMotor());
		// System.out.println(volvo); --> volvo referans degerlerini yazdirir.. // day_Practice14_Encapsulation.Araba@4d591d15
	
	}

}











/* 1- filedlar�(encapsulated) id, username, password, active (boolean), signedIn (boolean)
olan User isimli bir class create ediniz.
2- b�t�n fieldlar� parametre alan bir constructor tan�mlay�n�z.
4- UserMain isminde main i�in bir class create ediniz.
5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e atayiniz.
active ve signedIn default olarak true, false atayabilirsiniz.
id yi sistemde otomatik aliniz.,
6- e�er password 6 dan k���k olursa yeniden kullanici girisi isteyin.passwordun
6 karakterden k���k olup olmad���n� class�n i�inde kontrol ediniz.

farkli bir soru
*/