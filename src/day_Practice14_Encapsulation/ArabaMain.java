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











/* 1- filedlarý(encapsulated) id, username, password, active (boolean), signedIn (boolean)
olan User isimli bir class create ediniz.
2- bütün fieldlarý parametre alan bir constructor tanýmlayýnýz.
4- UserMain isminde main için bir class create ediniz.
5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e atayiniz.
active ve signedIn default olarak true, false atayabilirsiniz.
id yi sistemde otomatik aliniz.,
6- eðer password 6 dan küçük olursa yeniden kullanici girisi isteyin.passwordun
6 karakterden küçük olup olmadýðýný classýn içinde kontrol ediniz.

farkli bir soru
*/