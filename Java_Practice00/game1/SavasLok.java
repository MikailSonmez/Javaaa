package game1;

public abstract class SavasLok extends Lokasyon{
	protected Canavar cav;
	protected String odul;
	
	SavasLok(Player player, String name, Canavar cav, String odul){
		super(player);
		this.name=name;
		this.cav=cav;
		this.odul=odul;
	}
	
	public boolean getLocation() {
		int canRndm = cav.sayac();
		
		System.out.println("Suan burdasiniz : " + this.getName());
		System.out.println("Dikkatli olun ! Burada " + canRndm + " tane "+ cav.getIsim() + " tehkilekisiyle karsi karsiyasiniz ..!!");
		System.out.println("<T>amam mi <D>evam mi : ");
		String secTus = scan.nextLine();
		// secTus= secTus.toupperCase();
		if (secTus.toUpperCase().equals("D")) {
			if (savasMeydani(canRndm)) {
				System.out.println(this.getName() + " Bolge dusmanlardan temizlendi tebrikler !");
				if (this.odul.equals("Yemek")) {
					System.out.println("yemek kazandiniz !");
					player.getEnv().setYiyecek(true);
				} else if(this.odul.equals("Su")){
					System.out.println("su kazandiniz !");
					player.getEnv().setSu(true);
				} else if (this.odul.equals("odun")) {
					System.out.println("odun kazandiniz ! ");
					player.getEnv().setOdun(true);
				}
				return true;
			}
			if (player.getSaglik() <= 0) {
				System.out.println("you are dead");
			}
		}
		return true;
	}
	public boolean savasMeydani(int canRndm) {
		
		for (int i = 0; i < canRndm; i++) {
			int sonCevSaglik= cav.getSaglik();
			playerDurumu();
			canavarDurumu();
			
			while (player.getSaglik() > 0 && cav.getSaglik() >0) {
				System.out.println("<S>aldir veya <T>opukla : ");
				String secDurum= scan.nextLine();
				
				if (secDurum.toUpperCase().equals("S")) {
					System.out.println("siz saldirdiniz ! umarim kazanirsiniz");
					cav.setSaglik(cav.getSaglik() - player.getTotalHasar());
					saldiriSonrasiDurum();
				}
				if (cav.getSaglik() > 0) {
					System.out.println();
					System.out.println("canavar size saldirdi ! umarim olmezsiniz !");
					player.setSaglik(player.getSaglik() - (cav.getHasar() - player.getEnv().getZirh()));
				} else {
					return false;
				}
				
				if (cav.getSaglik() < player.getSaglik()) {
					System.out.println(cav.getIsim() + " yendiniz, tebrikler !");
					player.setPara(player.getPara() + cav.getPara());
					System.out.println("guncel paraniz : "+ player.getPara());
					cav.setSaglik(sonCevSaglik);
				} else {
					return false;
				}
			}
			System.out.println("--------------");
		}
		return true;
	}
	
	public void playerDurumu () {
		System.out.println("oyuncunun son degerlrini\n.....");
		System.out.println("Saglik : " +player.getSaglik());
		System.out.println("Hasar : " + player.getHasar());
		System.out.println(" para : " + player.getPara());
		if (player.getEnv().getHasar()>0) {
			System.out.println("Silah  : " + player.getEnv().getSilahAdi());
		}
		if (player.getEnv().getZirh()>0) {
			System.out.println("zirh : " + player.getEnv().getZirhAdi());
		}
	}
	public void canavarDurumu () {
		System.out.println("\n" + cav.getIsim() + "Son degerleri\n..........");
		System.out.println("Saglik : " + cav.getSaglik());
		System.out.println("Hasar : " + cav.getHasar());
		System.out.println("Para : " + cav.getPara());
	}
	
	public void saldiriSonrasiDurum () {
		System.out.println("Oyuncunun kalan cani : " + player.getSaglik());
		System.out.println(cav.getIsim() + "Cani : " + cav.getSaglik());
		System.out.println();
	}

}
