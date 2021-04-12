package cui;

import java.util.Scanner;

public class Permainan_Java_1 {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		long pow = 0;
		long senang = 0;
		long duit = 0;
		
		System.out.println("Kalo mau keluar ketik 'k'.\n");
		Thread.sleep(2000);
		System.out.println("Selamat Datang Di Permainan Kuuuu (Ridwan.Author)");
		System.out.println("\nMulaikan? y/n");
		String c = scan.next();
		if(c.equals("y")) {
			long cheer = 10000;
			long strong = 20000; 
			
			int str = 0;
			int kes = 0;
			pow += str;
			senang += kes;
			System.out.println("Di hari yang cerah... mau ngapain ya?\n");
			Thread.sleep(2000);			
			do {
				System.out.println("Fish/Chop/Check(Pow & Kesenangan)");
				System.out.print("Mau ngapain?f/c/check/shop = ");
				Thread.sleep(1000);
				String d = scan.next();
				if(d.equals("f")) {
					pow += 1;
					senang += 2;
					duit += 1000;
					System.out.println("Memancing sangat menyenangkan kamu!");
					System.out.println(" pow +1\nsenang +2\nduit +1\n");
				}
				else if(d.equals("c")) {
					pow += 2;
					duit += 2000;
					System.out.println("huuft sangat Melelahkan");
					System.out.println(" pow +2\n");
					System.out.println("Duit bertambah 2");
					
				}
				else if(d.equals("check")) {
					System.out.println("power kamu = "+pow+"\n"+"kesenangan kamu = "+senang+"\n");
					System.out.println("Duit kamu "+"Rp."+duit);
				}
				else if(d.equals("shop")) {
					System.out.println("===Cheer Potion====  ++4kes");
					System.out.println("===Strong Potion===  ++4pow");
					System.out.println("=Sword{}===========  ++3pow(per)");
					
					System.out.println("==Cheer Potion=== 10rb");
					System.out.println("==Strong Potion=== 20rb");
					System.out.println("==Sword==========> 25rb");
					System.out.println("Mau Beli Apa? ");
					String player = scan.nextLine().toLowerCase();
					if(player.equals("cheer potion")) {
						if(duit >= )
					}
					
				}
				else if(d.equals("k")) {
					System.out.print("Yakin Mau Keluar? :(\ny/n ");
					String data = scan.next();
					if(data.equals("y")) {
						System.out.println("Okey :)");
						x = 1;
						Thread.sleep(2000);
						System.out.println("Game di tutup....");
					}
					else if(data.equals("n")) {
						System.out.println("Okeyy");
					}
					else {
						System.out.println("Aku anggap kamu enggak mau keluar :D");
					}
					
				}
				else {
					System.out.println("Tidak dikenali perintah\n\n");
				}
				
				
			}while(x == 0);
		}
		else {
			System.out.println("Kamu mau keluar ya :(");
			Thread.sleep(2000);
			System.out.println("Oke...");
		}
		
		
		

	}

}
