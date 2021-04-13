package cui;

import java.util.Scanner;

public class Permainan_Java_1 {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		
		System.out.println("Kalo mau keluar ketik 'k'.\n");
		Thread.sleep(2000);
		System.out.println("Selamat Datang Di Permainan Kuuuu (Ridwan.Author)");
		System.out.println("\nMulaikan? y/n");
		String c = scan.next();
		if(c.equals("y")) {
			long pow = 0;
			long senang = 0;
			long duit = 0;
			int ch = 0;
			int st = 0;
			long str = 0;
			long kes = 0;
			int cheer = 10000;
			int strong = 20000; 
			int sword = 30000;
			
			System.out.println("Di hari yang cerah... mau ngapain ya?\n");
			Thread.sleep(2000);			
			do {
				pow += str;
				senang += kes;
				System.out.println("Fish/Chop/Check(Pow & Kesenangan)");
				System.out.print("Mau ngapain?f/c/check/shop = ");
				Thread.sleep(1000);
				String d = scan.nextLine();
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
					int t = 0;
					do{
						System.out.println("===Cheer Potion====  ++8kes");
						System.out.println("===Strong Potion===  ++8pow");
						System.out.println("=Sword{}===========  ++8pow(per)");
						
						System.out.println("==Cheer Potion=== 10rb");
						System.out.println("==Strong Potion=== 20rb");
						System.out.println("==Sword==========> 30rb");
						System.out.println("Mau Beli Apa? ");
						String player = scan.nextLine().toLowerCase();
						if(player.equals("cheer potion")) {
							if(duit >= cheer) {
								duit -= cheer;
								Thread.sleep(2000);
								System.out.println("Transaksi Berhasil");
								ch += 8;
								System.out.print("Mau Beli Lagi?y/n  ");
								String data = scan.nextLine();
								if(data.equals("y")) {
									
								}
								else if(data.equals("n")) {
									break;
								}
							}
							else if(duit < cheer) {
								System.out.println("Transaksi gagal");
								Thread.sleep(2000);
								System.out.println("Duit anda tidak cukup(duit = "+duit+")");
								Thread.sleep(2000);
								System.out.println("Mau Beli Yang Lain?");
								String data = scan.next();
								int loop5 = 0;
								do {
									if(data.equals("n")) {
										t = 1;
										break;
									}
									else if(data.equals("y")) {
										break;
									}
									else {
										System.out.println("no command..");
									}							
									
								}while(loop5 == 0);
							}
						}
						else if(player.equals("strong potion")) {
							if(duit >= strong) {
								duit -= strong;
								Thread.sleep(2000);
								System.out.println("Transaksi Berhasil");
								st += 8;
								System.out.print("Mau Beli Lagi?y/n  ");
								String data = scan.nextLine();
								if(data.equals("y")) {
									
								}
								else if(data.equals("n")) {
									break;
								}
							}
							else if(duit < cheer) {
								System.out.println("Transaksi gagal");
								Thread.sleep(2000);
								System.out.println("Duit anda tidak cukup(duit kamu = "+duit+")");
								Thread.sleep(2000);
								System.out.println("Mau Beli Yang Lain?");
								String data = scan.next();
								int loop5 = 0;
								do {
									if(data.equals("n")) {
										t = 1;
										break;
									}
									else if(data.equals("y")) {
										break;
									}
									else {
										System.out.println("no command..");
									}							
									
								}while(loop5 == 0);
							}
						}
						else if(player.equals("sword")) {
							if(duit >= sword) {
								duit -= sword;
								Thread.sleep(2000);
								System.out.println("Transaksi Berhasil");
								pow += 8;
								System.out.print("Mau Beli Lagi?y/n  ");
								String data = scan.nextLine();
								if(data.equals("y")) {
									
								}
								else if(data.equals("n")) {
									break;
								}
							}
							else if(duit < sword) {
								System.out.println("Transaksi gagal");
								Thread.sleep(2000);
								System.out.println("Duit anda tidak cukup(duit kamu = "+duit+")");
								Thread.sleep(2000);
								System.out.println("Mau Beli Yang Lain?");
								String data = scan.next();
								int loop5 = 0;
								do {
									if(data.equals("n")) {
										t = 1;
										break;
									}
									else if(data.equals("y")) {
										break;
									}
									else {
										System.out.println("no command..");
									}							
									
								}while(loop5 == 0);
								
						    }
						}
						else {
							System.out.println("maaf tidak di temukan perintah");
						}
					}while(t == 0);
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
				kes = 0;
				str = 0;
				if(ch > 0) {
					kes += ch;
				}
				else if(ch == 0){
					kes = 0;
				}
				
				if(st > 0) {
					str += st;
				}
				else if(st == 0){
					str = 0;
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
