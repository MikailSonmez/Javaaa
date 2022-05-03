package game1;

import java.util.Scanner;

public class Game {

	Player player;
	
	static Lokasyon location = new Lokasyon() {
	@Override
	public boolean getLocation() {
		return false;
		}
	
	};
	Scanner scan=new Scanner(System.in);
	
	public void giris() {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("simdi oyun zamani");
	System.out.println("isminizi giriniz : ");
	String playerIsim = scan.nextLine();
	player = new Player(playerIsim);
	player.karakterSec();
	start();
	}
	 public void start(){
	        while(true){
	            System.out.println();
	            System.out.println("1. Evim -->  Burda dusman yok, guvendesin !");
	            System.out.println("2. Magara --> Dikkat Ayi cikabilirr !");
	            System.out.println("3. Orman --> Dikkat Wampir cikip sizi yiyebilir !");
	            System.out.println("4. Nehir --> Dikkat Zombi gelebilir !");
	            System.out.println("5. Magaza --> Burdan gerekli levazmati tedarik edebilirsin !");
	            System.out.println("6.  --> Hayatta kaldiysan sanslisin !");
	            System.out.println("Gitmek istedigin yer : ");
	            int sec = scan.nextInt();

	            while (sec <=0 || sec > 6){
	                System.out.println("Gecerli bir sayi giriniz !");
	                sec= scan.nextInt();
	            }

	            switch (sec){
	                case 1 :location = new Evim(player);
	                break;
	                case 2 :location = new Magara(player);
	                    break;
	                case 3 :location = new Orman(player);
	                    break;
	                case 4 :location = new Nehir(player);
	                    break;
	                case 5 :location = new Magaza(player);
	                    break;
	                case 6 :
	                    System.out.println("Tebrikler... Seninle savasmak bir keyifti..!");;
	                    location = new Lokasyon() {
	                        @Override
	                        public boolean getLocation() {
	                            return false;
	                        }
	                    };
	                    break;

	            }
	            if (!location.getLocation() || sec ==6 ){
	                System.out.println("Yeni maceralarda gorusmek uzere !!");
	                break;
	            }


	        }

	    }


	}
