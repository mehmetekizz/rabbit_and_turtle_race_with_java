import java.util.Random;
public class Game {

	Random randomNum = new Random ();
	int kaplumbaga=1; //varsayilan konumlar
	int tavsan=1;	

	public void hareket() {
		while(true) {
			randomAtama();
			
			if(kaplumbaga>19) {System.out.println("KAPLUMBAÐA KAZANDI! OLLEY!!!");break;}
			else if(tavsan>19){System.out.println("TAVSAN KAZANDI! OLLEY!!!");    break;}	
			
			tavsanSabiti();
			kaplumbagaSabiti();
			
			kaplumbagaOnde();
			tavsanOnde();
			tavsanKaplumbagaAyný();
			System.out.println();
			}}
	
	public void tavsanSabiti() {if(tavsan<1) {tavsan = 1;}}
	public void kaplumbagaSabiti() {if(kaplumbaga<1) {kaplumbaga = 1;}}
	
	public void randomAtama() {
		int sayiK = randomNum.nextInt(102)+1;
		int sayiT = randomNum.nextInt(104)+1;
		
		if(sayiK>=1  && sayiK<=50)  {kaplumbaga += 3;}
		if(sayiK>=51 && sayiK<=71) {kaplumbaga -= 6;}
		if(sayiK>=72 && sayiK<=102){kaplumbaga += 1;}
		
		if(sayiT>=1  && sayiT<=20) {tavsan += 0;   }
		if(sayiT>=21 && sayiT<=41) {tavsan += 9;   }
		if(sayiT>=42 && sayiT<=52) {tavsan -=12;   }
		if(sayiT>=53 && sayiT<=83) {tavsan += 1;   }
		if(sayiT>=84 && sayiT<=104){tavsan -= 2;   }
	}
	
	public void kaplumbagaOnde() {
		if(kaplumbaga>tavsan) {
			for(int b=1; b<=tavsan-1; b++) {
				System.out.print("_ ");
			}
				System.out.print('T');
			for(int b=1; b<=kaplumbaga-tavsan-1;b++) {
				System.out.print("_ ");
			}
				System.out.print('K');
			for(int b=1; b<=20-kaplumbaga; b++) {
				System.out.print("_ ");
			}
			System.out.println();
			System.out.println("kaplumbaða= "+kaplumbaga);
			System.out.println("tavþan= "+tavsan);
		}}
	
	public void tavsanOnde() {
		if(tavsan>kaplumbaga) {
			for(int a=1; a<=kaplumbaga-1; a++) {
				System.out.print("_ ");
			}
				System.out.print('K');	
			for(int b=1; b<=tavsan-kaplumbaga-1;b++) {
				System.out.print("_ ");
			}
				System.out.print('T');
			for(int b=1; b<=20-tavsan; b++) {
				System.out.print("_ ");
			}
			System.out.println();
			System.out.println("kaplumbaða= "+kaplumbaga);
			System.out.println("tavþan= "+tavsan);
		}}
	
	public void tavsanKaplumbagaAyný() {
		if(tavsan==kaplumbaga) {
			for(int a=1; a<=kaplumbaga-1; a++) {
				System.out.print("_ ");
			}
			System.out.print("ouch");
			for(int b=1; b<=20-tavsan; b++) {
				System.out.print("_ ");
			}
			System.out.println();
			System.out.println("kaplumbaða= "+kaplumbaga);
			System.out.println("tavþan= "+tavsan);
		}}
}
