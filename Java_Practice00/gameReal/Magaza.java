package game1;

public class Magaza extends NormalLok {
	Magaza(Player player){
		super(player,"Silah magazasindasiniz...!");
	}
	
	public boolean getLocation() {
		System.out.println(player.getIsim()+ " Karakterinin parasi : " + player.getPara());
		System.out.println("1. silahlar");
		System.out.println("2. zirhlar");
		System.out.println("3. cikis");
		System.out.println("seciminiz : ");
		int secim = scan.nextInt();
		int scmSilahID;
		int scmZirhAl;
		
		switch (secim) {
		case 1:
			scmSilahID = silahMenu();
			silahSatinAl(scmSilahID);
			break;
		case 2:
			scmZirhAl = zirhMenu();
			zirhSatinAl(scmZirhAl);
			break;
		case 3:
					System.out.println("demek gidiyrosun silahlara ihtiyacin oldugunda burdayim adamim");
			break;
		}
		return true;
	}
	
	public int silahMenu() {
		System.out.println("1. Uzun Namlulu Silah\t Para : 5 - Hasar : 8");
		System.out.println("2. Kilic\t Para : 8 - Hasar : 3");
		System.out.println("3. Ok\t Para : 3 - Hasar : 5");
		System.out.println("4. Cikis..");
		System.out.println("Silah seciminiz : ");
		int slhNo = scan.nextInt();
		return slhNo;
	}
	 public int zirhMenu(){
	        System.out.println("1. Hafif\t Para : 3 - Defans : 1 ");
	        System.out.println("2. Orta\t Para : 4 - Defans : 2 ");
	        System.out.println("3. Agir\t Para : 5 - Defans : 3 ");
	        System.out.println("4. Çýkýþ..");
	        System.out.println("Zirh seçiminiz : ");
	        int zirhNo =scan.nextInt();
	        return  zirhNo;
	    }
	public void silahSatinAl(int malzNo) {
		int hasar = 0, para=0;
		String silahAdi =null;
		
		switch (malzNo) {
		case 1:
			hasar=8;
			silahAdi ="Uzun Namlilu Silah";
			para =5;
			break;
		case 2:
			hasar =3;
			silahAdi ="Kilic";
			para=8;
			break;
		case 3:
			hasar = 5;
			silahAdi="Ok";
			para=3;
			break;
		case 4:
			System.out.println("Cikis..");
			break;
		default:
			System.out.println("Gecersiz islem !");
			break;
		}
		if (para>0) {
			if (player.getPara()>para) {
				player.getEnv().setHasar(hasar);
				player.getEnv().setSilahAdi(silahAdi);
				player.setPara(player.getPara()-para);
				System.out.println(silahAdi + " satin aldiniz..");
				System.out.println("kalan paraniz : " + player.getPara());
			} else {
				System.out.println("yetersiz bakiyer..!");
			}
		}
	}
	public void zirhSatinAl(int malzNo) {
		int zirh = 0, para=0;
		String zirhAdi = null;
		
		switch (malzNo) {
	case 1:
		zirh=1;
		zirhAdi ="hafif";
		para =3;
		break;
	case 2:
		zirh =2;
		zirhAdi ="orta";
		para=4;
		break;
	case 3:
		zirh = 3;
		zirhAdi="agir";
		para=5;
		break;
	case 4:
		System.out.println("Cikis..");
		break;
	default:
		System.out.println("Gecersiz islem !");
		break;
	}
		if (para>0) {
			if (player.getPara()>para) {
				player.getEnv().setHasar(zirh);
				player.getEnv().setSilahAdi(zirhAdi);
				player.setPara(player.getPara()-para);
				System.out.println(zirhAdi + "satin aldiniz..");
				System.out.println("kalan paraniz : " + player.getPara());
			} else {
				System.out.println("yetersiz bakiyer... !");
			}

		}
	}
}
