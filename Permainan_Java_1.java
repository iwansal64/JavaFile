package cui;

import java.util.Scanner;
import java.util.Random;

public class Permainan_1 {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		boolean nextlv = false;
		
		System.out.println("Kalo mau keluar ketik 'k'.\n");
		Thread.sleep(2000);
		System.out.println("Selamat Datang Di Permainan Kuuuu (Ridwan.Author)");
		System.out.print("\nMulaikan? y/n  ");
		String c = scan.nextLine();
		if(c.equals("y")) {
			//Statistik Player
			long duit = 0;
			int pow = 0;
			int senang = 0;
			int health = 10;
			int ch = 0;
			int st = 0;
			int str = 0;
			int kes = 0;
			int magicpow = 0;
			int level = 0;
			int lvl = 0;
			
			//Harga Harga
			int cheer = 10000;
			int strong = 20000; 
			int sword = 30000;
			int heal = 15000;
			int life = 25000;
			int magic = 40000;
			int happy = 40000;
			int uangloop = 40000;
			int uangpow = 40000;
			int pets = 50000;
			int cart = 40000;
			int nextlvl = 100000;
			
			//Randomize Integer
			int time;
			int enemy;
			int token = 1;
			
			//String Input
			String datastr;
			
			//Boolean power & loop
			boolean magicbool = false;
			boolean powhap = false;
			boolean loopuang = false;
			boolean looppow = false;
			boolean kucing = false;
			boolean next = false;
			boolean cartbool = false;
			
			System.out.println("Assalamualaikum....");
			Thread.sleep(2000);			
			do {
				int ela = 3;
				int ena = 5;
				int esa = 10;
				int had1 = 20;
				int had2 = 30;
				int had3 = 40;
				int elh = 15;
				int enh = 20;
				int esh = 25;
				int aad1 = 15;
				int aad2 = 25;
				int aad3 = 30;
				int reward1;
				int reward2;
				int reward3;
				int rewardad1;
				int rewardad2;
				int rewardad3;
				pow += (magicpow * 2);
				health += (magicpow + 2);
				senang += (magicpow * 2);
				pow += str;
				senang += kes;
				System.out.println("Fish/Chop/Check(Pow & Kesenangan)");
				System.out.print("Mau ngapain?F/C/Check/Shop/Hunt\n/HuntAdvanced/HuntExpert/magic shop/tutor? = ");
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
					pow += 3;
					duit += 3000;
					health -= 2;
					System.out.println("huuft sangat Melelahkan");
					System.out.println(" pow +2\n");
					System.out.println("capek banget... health-2");
					System.out.println("Duit bertambah 3");
					
				}
				else if(d.equals("check")) {
					System.out.println("power kamu = "+pow+"\n"+"kesenangan kamu = "+senang+"\n");
					System.out.println("Duit kamu "+"Rp."+duit);
					System.out.println("Darah kamu = "+health);
					System.out.println("Token sekarang = "+token);
					System.out.println("lvl = "+lvl);
					System.out.println("Level = "+level);
				}
				else if(d.equals("tutor")) {
					System.out.println("====TUTORIAL LEVEL====");
					System.out.println("1 lvl = 0.1level");
					System.out.println("1 level = 10 lvl\n\n");
					
					System.out.println("====TUTORIAL FARMING====");
					System.out.println("-Fish(f):Memancing");
					System.out.println("+1rb\n+2senang\n+1pow");
					System.out.println("\n-Chop(c):Menebang");
					System.out.println("+3rb\n3pow\n-2health");
					System.out.println("\n-Mine(m):Menambang");
					System.out.println("+5rb\n+5pow\n-3health\n(Note : Harus Level 3)");
					
					System.out.println("====TUTORIAL SHOP====");
					System.out.println("Ada dua shop disini");
					System.out.println("1.SHOP(shop)");
					System.out.println("2.MAGIC SHOP(magic shop)");
					System.out.println("Di Shop Barang Yang Di Jual\nNormal");
					System.out.println("Di Magic Shop BArang Yang\nDi Jual Adalah Barang Expert");
					System.out.println("(Note : Magic Shop Terbuka Level 2)");
				}
				else if(d.equals("magic shop")) {
					if(level >= 2) {
						System.out.println("Magic..(\\\\|//)");
						Thread.sleep(2000);
						System.out.println("Shop---{--=-=--}");
						Thread.sleep(2000);
						System.out.print("1/2/3?  ");
						int data = scan.nextInt();
						if(data == 1) {
							do {
								System.out.println("1.====Magic Pot====");
								System.out.println("-Memperkuat Magic\nPower (Jika ada) -40rb");
								Thread.sleep(2000);
								System.out.println("2.=== life Pot ====");
								System.out.println("-Menambah Max HP \nHP + 2 -25rb");
								Thread.sleep(2000);
								System.out.println("3.== Happy Pow ====");
								System.out.println("-Konversi Kesenangan\nMenjadi Power -40rb");
								System.out.print("\nMau Beli Apa? ");
								data = scan.nextInt();
								if(data == 1) {
									if(magicbool = false) {
										System.out.println("Tidak Punya Magic.");
										System.out.println("Mau Beli Yang Lain? y/n");
										datastr = scan.nextLine();
										if(datastr.equals("n")) {
											break;
										}
										
									}
									else if(magicbool = true) {
										if(duit >= magic) {
											duit -= magic;
											magic += 10;
											System.out.println("Terbeli!");
											System.out.println("mau beli lagi?");
											datastr = scan.nextLine();
											if(datastr.equals("n")) {
												break;
											}
										}
										else if(duit < magic) {
											System.out.println("Tidak Cukup DUIT!");
											System.out.println("kesenangan -10");
											senang -= 10;
										}
									}
								}
								else if(data == 2) {
									if(duit >= life) {
										duit -= life;
										health += 2;
										System.out.println("Terbeli!");
										System.out.println("mau beli lagi?");
										datastr = scan.nextLine();
										if(datastr.equals("n")) {
											break;
										}
									}
									else if(duit < life) {
										System.out.println("Tidak Cukup DUIT!");
										System.out.println("kesenangan -10");
										senang -= 10;
									}
								}
								else if(data == 3) {
									if(duit >= happy) {
										duit -= happy;
										powhap = true;
										System.out.println("Terbeli!");
										System.out.println("mau beli lagi?");
										datastr = scan.nextLine();
										if(datastr.equals("n")) {
											break;
										}
									}
									else if(duit < happy) {
										System.out.println("Tidak Cukup DUIT!");
										System.out.println("kesenangan -10");
										senang -= 10;
									}
								}
								else {
									break;
								}
								
							}while(true);
						}
						else  if(data == 2) {
							do {
								System.out.println("1.=== Uang Waktu ===");
								System.out.println("-Setelah satu kali\nloop uang akan\nbertambah 1 -40rb");
								System.out.println("2.=== Power Waktu===");
								System.out.println("-Setelah satu kali\nloop power akan\nbertambah 1 -40rb");
								System.out.println("3.====   Pet    ====");
								System.out.println("-HaHa Kucing Lucu\nUntuk menemani adv & Mine -50rb");
								System.out.print("\nMau Beli Apa? ");
								data = scan.nextInt();
								if(data == 1) {
									if(duit >= uangloop) {
										duit -= uangloop;
										loopuang = true;
										System.out.println("Terbeli!");
										System.out.println("Uang Akan Mendatangi mu setiap hari");
									}
									else if(duit < uangloop) {
										System.out.println("Tidak Cukup Uang");
									}
								}
								else if(data == 2) {
									if(duit >= uangpow) {
										duit -= uangpow;
										looppow = true;
										System.out.println("Terbeli!");
										System.out.println("Power Bertambah setiap hari");
									}
									else if(duit < uangpow) {
										System.out.println("Tidak Cukup Uang");
									}
								}
								else if(data == 3) {
									if(duit >= pets) {
										duit -= pets;
										kucing = true;
										System.out.println("Terbeli Yeee");
										System.out.println("Kucing Unyu Mengikutimu setiap hari");
									}
									else if(duit < pets) {
										System.out.println("Duit Kurang");
									}
								}
								else {
									break;
								}
								
								
							}while(true);
						}
						else if(data == 3) {
							do {
								System.out.println("====  NEXT  ====");
								System.out.println("-Pindah Ke Yang \nLebih Baik~ -100rb");
								String datamng = scan.nextLine();
								if(datamng.equals("y")) {
									if(duit >= nextlvl) {
										System.out.println("Kamu Memilih Migrasi...");
										Thread.sleep(2000);
										System.out.println("Kamu Capek Disini terus...");
										Thread.sleep(2000);
										datastr = scan.nextLine();
										System.out.println("Bye");
										next = true;
										break;
									}
									else if(duit < nextlvl) {
										System.out.println("Mungkin Kamu Capek\nTapi Duit Kamu Kurang :v");
										break;
									}
								}
								
							}while(true);
						}
					}
					else if(level < 3) {
						System.out.println("TiDAk BiSA MASUk");
						System.out.println("PERSYARATAN TiDAk\nTERPENUhi");
					}
					
				}
				else if(d.equals("mine")) {
					if(level >= 3) {
						System.out.println("Kamu Memasuki Zona Mining");
					}
				}
				else if(d.equals("hunt")) {
					System.out.println("\n Kamu ngehunt..");
					Thread.sleep(2000);
					System.out.println("\nkamu yakin?...");
					System.out.println("dengan kesenangan = "+senang);
					System.out.println("dan Kekuatan = "+pow);
					String data = scan.nextLine();
					if(data.equals("y")) {
						System.out.println("Oke kalo kamu yakin");
						System.out.println("Kita ngeHunt!");
						time = 1 + ran.nextInt(6);
						time *= 1000;
						Thread.sleep(time);
						enemy = 1 + ran.nextInt(6);
						if(enemy >= 1 && enemy <= 3) {
							do {
								System.out.println("Kamu Bertemu musuh lemah");
								Thread.sleep(2000);
								System.out.println("kamu di serang");
								health -= ela;
								Thread.sleep(2000);
								if(health == 0) {
									System.out.println("Kamu Kalah :(");
									Thread.sleep(2000);
									System.out.println("Kamu Pun Mati...");
									Thread.sleep(2000);
									System.out.println("Sorry..");
									Thread.sleep(1000);
									System.out.println("Game Di Tutup...");
									return;
								}
								else {
									System.out.println("\ndarah kamu sekarang "+health+" -"+ela);
									Thread.sleep(2000);
								}
								System.out.println("Sekarang Giliran kamu yang menyerang");
								elh -= pow;
								Thread.sleep(2000);
								if(elh <= 0) {
									System.out.println("Musuh Kalah Dan Kamu Menang Yey!!");
									System.out.println("===Result===");
									reward1 = 1 + ran.nextInt(3);
									if(reward1 == 1) {
										System.out.println("--15Ribu");
										System.out.println("--10Pow");
										System.out.println("--20Kes");
										duit += 15000;
										pow += 10;
										senang += 20;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									}
									else if(reward1 == 2) {
										System.out.println("--20Ribu");
										System.out.println("--12Pow");
										System.out.println("--25Kes");
										duit += 20000;
										pow += 12;
										senang += 25;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									}
									else if(reward1 == 3) {
										System.out.println("--25Ribu");
										System.out.println("--15Pow");
										System.out.println("--30Kes");
										duit += 25000;
										pow += 15;
										senang += 30;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									}
								}
								else {
									System.out.println("Darah Musuh "+elh+" -"+pow);
								}
							}while(true);
							
						}
						
						else if(enemy >= 4 && enemy <= 5){
							do {
								System.out.println("Kamu Bertemu Musuh Normal");
								Thread.sleep(2000);
								System.out.println("Kamu Di Serang!!");
								health -= ena;
								if(health <= 0) {
									System.out.println("Kamu Kalah :(");
									Thread.sleep(2000);
									System.out.println("Kamu Pun Mati...");
									Thread.sleep(2000);
									System.out.println("Sorry..");
									Thread.sleep(1000);
									System.out.println("Game Di Tutup...");
									return;
								}
								else {
									System.out.println("\ndarah kamu sekarang "+health+" -"+ena);
									Thread.sleep(2000);
								}
								System.out.println("Giliran Kamu Coy Ayoo!");
								Thread.sleep(2000);
								System.out.println("Kamuu Menyerang");
								enh -= pow;
								if(enh <= 0) {
									System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
									System.out.println("===Result===");
									reward2 = 1 + ran.nextInt(3);
									if(reward2 == 1) {
										System.out.println("--25Ribu");
										System.out.println("--15Pow");
										System.out.println("--30Kes");
										duit += 25000;
										pow += 15;
										senang += 30;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									}
									else if(reward2 == 2) {
										System.out.println("--30Ribu");
										System.out.println("--20Pow");
										System.out.println("--35Kes");
										duit += 30000;
										pow += 20;
										senang += 35;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									}
									else if(reward2 == 3) {
										System.out.println("--35Ribu");
										System.out.println("--23Pow");
										System.out.println("--40Kes");
										duit += 35000;
										pow += 23;
										senang += 40;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									
								   } 
							    }
								else {
									System.out.println("Darah Musuh "+enh+" -"+pow);
								}
							}while(true);
						}
						else {
							do {
								System.out.println("Kamu Bertemu Musuh Kuat!");
								Thread.sleep(2000);
								System.out.println("Kamu Di Serang!");
								health -= esa;
								Thread.sleep(2000);
								if(health <= 0) {
									System.out.println("Kamu Kalah :(");
									Thread.sleep(2000);
									System.out.println("Kamu Pun Mati...");
									Thread.sleep(2000);
									System.out.println("Sorry..");
									Thread.sleep(1000);
									System.out.println("Game Di Tutup...");
									return;
								}
								else {
									System.out.println("\ndarah kamu sekarang "+health+" -"+ena+"!");
									Thread.sleep(2000);
								}
								System.out.println("Ini Waktunya Menyerang!");
								esh -= pow;
								Thread.sleep(2000);
								if(esh <= 0) {
									System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
									System.out.println("===Result===");
									reward3 = 1 + ran.nextInt(3);
									if(reward3 == 1) {
										System.out.println("--30Ribu");
										System.out.println("--20Pow");
										System.out.println("--35Kes");
										duit += 30000;
										pow += 20;
										senang += 35;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									}
									else if(reward3 == 2) {
										System.out.println("--40Ribu");
										System.out.println("--25Pow");
										System.out.println("--40Kes");
										duit += 40000;
										pow += 25;
										senang += 40;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									}
									else if(reward3 == 3) {
										System.out.println("--50Ribu");
										System.out.println("--30Pow");
										System.out.println("--45Kes");
										duit += 50000;
										pow += 30;
										senang += 45;
										System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
										Thread.sleep(3000);
										break;
									
								   } 
							    }
								else {
									System.out.println("Darah Musuh "+esh+" -"+pow);
								}
							}while(true);
							
						}
						
					}
					
					else {
						System.out.println("Oke.");
					}
				
					
			    }
				else if(d.equals("hunt advanced")) {
					int loopad = 0;
					do {
						if(token >= 5) {
							System.out.println("Kamu Memasuki Wilayah Advanced");
							Thread.sleep(2000);
							System.out.println("Kamu dah siap?");
							String data = scan.nextLine().toLowerCase();
							if(data.equals("y")){
								System.out.println("Okee");
								Thread.sleep(2000);
								System.out.println("Kamu Mencari Musuh");
								time = 1 + ran.nextInt(3);
								Thread.sleep(time);
								System.out.println("Sudah Ketemu!");
								enemy = 1 + ran.nextInt(6);
								if(enemy >= 1 && enemy <= 3) {
									System.out.println("Kamu Bertemu Musuh Ez");
									Thread.sleep(2000);
									System.out.println("Musuh Akan Menyerang");
									health -= aad1;
									if(health <= 0) {
										System.out.println("Kamu Kalah :(");
										Thread.sleep(2000);
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else {
										System.out.println("\ndarah kamu sekarang "+health+" -"+aad1+"!");
										Thread.sleep(2000);
									}
									System.out.println("Waktu nya menyerang!!");
									int power = pow + ran.nextInt(pow+4);
									if(power >= (pow+2)) {
										System.out.println("\nCRITICAL!\n");
										had1 -= pow;
										if(esh <= 0) {
											System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											rewardad1 = 1 + ran.nextInt(3);
											if(rewardad1 == 1) {
												System.out.println("--50Ribu");
												System.out.println("--40Pow");
												System.out.println("--45Kes");
												duit += 50000;
												pow += 40;
												senang += 45;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad1 == 2) {
												System.out.println("--55Ribu");
												System.out.println("--45Pow");
												System.out.println("--50Kes");
												duit += 55000;
												pow += 45;
												senang += 50;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad1 == 3) {
												System.out.println("--60Ribu");
												System.out.println("--50Pow");
												System.out.println("--65Kes");
												duit += 60000;
												pow += 50;
												senang += 65;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											
										   } 
									    }
										else {
											System.out.println("Darah Musuh "+had1+" -"+pow);
										}
									}
									else if(power < (pow+2)) {
										had1 -= pow;
										if(esh <= 0) {
											System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											rewardad1 = 1 + ran.nextInt(3);
											if(rewardad1 == 1) {
												System.out.println("--50Ribu");
												System.out.println("--40Pow");
												System.out.println("--45Kes");
												duit += 50000;
												pow += 40;
												senang += 45;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad1 == 2) {
												System.out.println("--55Ribu");
												System.out.println("--45Pow");
												System.out.println("--50Kes");
												duit += 55000;
												pow += 45;
												senang += 50;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad1 == 3) {
												System.out.println("--60Ribu");
												System.out.println("--50Pow");
												System.out.println("--65Kes");
												duit += 60000;
												pow += 50;
												senang += 65;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											
										   } 
									    }
									}
								}
								else if(enemy >= 4 && enemy <= 5 ) {
									System.out.println("Kamu Bertemu Musuh Normal!");
									Thread.sleep(2000);
									System.out.println("Musuh Akan Menyerang");
									health -= aad2;
									if(health <= 0) {
										System.out.println("Kamu Kalah :(");
										Thread.sleep(2000);
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else {
										System.out.println("\ndarah kamu sekarang "+health+" -"+aad2+"!");
										Thread.sleep(2000);
									}
									System.out.println("Waktu nya menyerang!!");
									int power = pow + ran.nextInt(pow+4);
									if(power >= (pow+2)) {
										System.out.println("\nCRITICAL!\n");
										had2 -= pow;
										if(esh <= 0) {
											System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											rewardad2 = 1 + ran.nextInt(3);
											if(rewardad2 == 1) {
												System.out.println("--60Ribu");
												System.out.println("--50Pow");
												System.out.println("--55Kes");
												duit += 60000;
												pow += 50;
												senang += 55;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad2 == 2) {
												System.out.println("--65Ribu");
												System.out.println("--53Pow");
												System.out.println("--65Kes");
												duit += 65000;
												pow += 53;
												senang += 65;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad2 == 3) {
												System.out.println("--70Ribu");
												System.out.println("--55Pow");
												System.out.println("--73Kes");
												duit += 70000;
												pow += 55;
												senang += 73;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											
										   } 
									    }
										else {
											System.out.println("Darah Musuh "+had2+" -"+pow);
										}
									}
									else if(power < (pow+2)) {
										had2 -= pow;
										if(esh <= 0) {
											System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											rewardad2 = 1 + ran.nextInt(3);
											if(rewardad2 == 1) {
												System.out.println("--60Ribu");
												System.out.println("--50Pow");
												System.out.println("--55Kes");
												duit += 60000;
												pow += 50;
												senang += 55;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad2 == 2) {
												System.out.println("--65Ribu");
												System.out.println("--53Pow");
												System.out.println("--65Kes");
												duit += 65000;
												pow += 53;
												senang += 65;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad2 == 3) {
												System.out.println("--70Ribu");
												System.out.println("--55Pow");
												System.out.println("--73Kes");
												duit += 70000;
												pow += 55;
												senang += 73;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											
										   } 
									    }
									}
								}
								else if(enemy == 6) {
									System.out.println("Kamu Bertemu Musuh Kuat!!");
									Thread.sleep(2000);
									System.out.println("Musuh Akan Menyerang!!");
									health -= aad3;
									if(health <= 0) {
										System.out.println("Kamu Kalah :(");
										Thread.sleep(2000);
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else {
										System.out.println("\ndarah kamu sekarang "+health+" -"+aad3+"!");
										Thread.sleep(2000);
									}
									System.out.println("Waktu nya menyerang!!");
									int power = pow + ran.nextInt(pow+4);
									if(power >= (pow+2)) {
										System.out.println("\nCRITICAL!\n");
										had3 -= pow;
										if(esh <= 0) {
											System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											rewardad3 = 1 + ran.nextInt(3);
											if(rewardad3 == 1) {
												System.out.println("--80Ribu");
												System.out.println("--60Pow");
												System.out.println("--75Kes");
												duit += 80000;
												pow += 60;
												senang += 75;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad3 == 2) {
												System.out.println("--87Ribu");
												System.out.println("--65Pow");
												System.out.println("--80Kes");
												duit += 87000;
												pow += 65;
												senang += 80;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad3 == 3) {
												System.out.println("--90Ribu");
												System.out.println("--75Pow");
												System.out.println("--90Kes");
												duit += 90000;
												pow += 75;
												senang += 90;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											
										   } 
									    }
										else {
											System.out.println("Darah Musuh "+had3+" -"+pow);
										}
									}
									else if(power < (pow+2)) {
										had3 -= pow;
										if(esh <= 0) {
											System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											rewardad1 = 1 + ran.nextInt(3);
											if(rewardad1 == 1) {
												System.out.println("--50Ribu");
												System.out.println("--40Pow");
												System.out.println("--45Kes");
												duit += 50000;
												pow += 40;
												senang += 45;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad1 == 2) {
												System.out.println("--55Ribu");
												System.out.println("--45Pow");
												System.out.println("--50Kes");
												duit += 55000;
												pow += 45;
												senang += 50;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(rewardad1 == 3) {
												System.out.println("--60Ribu");
												System.out.println("--50Pow");
												System.out.println("--65Kes");
												duit += 60000;
												pow += 50;
												senang += 65;
												System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											
										   } 
									    }
									}
								}
							}
						}
						else {
							System.out.println("Kamu Tidak Bisa Masuk..");
							Thread.sleep(2000);
							System.out.println("Token kamu tidak mencukupi(butuh 5 token)");
							Thread.sleep(3000);
							break;
						}
					}while(loopad == 0);
				}
				else if(d.equals("hunt expert")) {
					int loophuntex = 0;
					do {
						if(token >= 8) {
							System.out.println("Kamu Memasuki Wilayah Expert");
						}
						else {
							System.out.println("Kamu Tidak Bisa Masuk..");
							Thread.sleep(2000);
							System.out.println("Token kamu tidak mencukupi(butuh 8 token)");
							Thread.sleep(3000);
							break;
						}
					}while(loophuntex == 0);
				}
				else if(d.equals("shop")) {
					int t = 0;
					do{
						System.out.println("===Cheer Potion====  ++8kes");
						System.out.println("===Strong Potion===  ++8pow");
						System.out.println("===Heal Potion=====  ++5health(per)");
						System.out.println("=Sword{}===========  ++8pow(per)");
						System.out.println("===     Cart    ===  ++Mine");
						System.out.println("\n==Cheer Potion=== 10rb");
						System.out.println("==Strong Potion===  20rb");
						System.out.println("==Life Potion=====  30rb");
						System.out.println("==Sword==========>  30rb");
						System.out.println("==     Cart    ===  40rb");
						System.out.println("\nMau Beli Apa? ");
						String player = scan.nextLine().toLowerCase();
						if(player.equals("cheer potion")) {
							if(duit >= cheer) {
								duit -= cheer;
								Thread.sleep(2000);
								System.out.println("Transaksi Berhasil");
								ch += 8;
								System.out.print("Mau Beli Lagi?y/n  ");
								String data1 = scan.nextLine();
								if(data1.equals("y")) {
									
								}
								else if(data1.equals("n")) {
									break;
								}
							}
							else if(duit < cheer) {
								System.out.println("Transaksi gagal");
								Thread.sleep(2000);
								System.out.println("Duit anda tidak cukup(duit = "+duit+")");
								Thread.sleep(2000);
								System.out.println("Mau Beli Yang Lain?");
								String data1 = scan.next();
								int loop5 = 0;
								do {
									if(data1.equals("n")) {
										t = 1;
										break;
									}
									else if(data1.equals("y")) {
										break;
									}
									else {
										System.out.println("no command..");
									}							
									
								}while(loop5 == 0);
							}
						}
						else if(player.equals("heal potion")) {
							if(duit >= heal) {
								System.out.println("Transaksi Berhasil");
								health = 10;
								duit -= heal;
								System.out.println("darah di pulihkan");
								System.out.print("\nMau Beli Lagi?y/n  ");
								String data1 = scan.nextLine();
								if(data1.equals("y")) {
									
								}
								else if(data1.equals("n")) {
									break;
								}
							}
							else if(duit < heal) {
								System.out.println("Transaksi gagal");
								Thread.sleep(2000);
								System.out.println("Duit anda tidak cukup(duit kamu = "+duit+")");
								Thread.sleep(2000);
								System.out.println("Mau Beli Yang Lain?");
								String data1 = scan.next();
								int loop5 = 0;
								do {
									if(data1.equals("n")) {
										t = 1;
										break;
									}
									else if(data1.equals("y")) {
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
								String data1 = scan.nextLine();
								if(data1.equals("y")) {
									
								}
								else if(data1.equals("n")) {
									break;
								}
							}
							else if(duit < cheer) {
								System.out.println("Transaksi gagal");
								Thread.sleep(2000);
								System.out.println("Duit anda tidak cukup(duit kamu = "+duit+")");
								Thread.sleep(2000);
								System.out.println("Mau Beli Yang Lain?");
								String data1 = scan.next();
								int loop5 = 0;
								do {
									if(data1.equals("n")) {
										t = 1;
										break;
									}
									else if(data1.equals("y")) {
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
								String data1 = scan.nextLine();
								if(data1.equals("y")) {
									
								}
								else if(data1.equals("n")) {
									break;
								}
							}
							else if(duit < sword) {
								System.out.println("Transaksi gagal");
								Thread.sleep(2000);
								System.out.println("Duit anda tidak cukup(duit kamu = "+duit+")");
								Thread.sleep(2000);
								System.out.println("Mau Beli Yang Lain?");
								String data1 = scan.next();
								int loop5 = 0;
								do {
									if(data1.equals("n")) {
										t = 1;
										break;
									}
									else if(data1.equals("y")) {
										break;
									}
									else {
										System.out.println("no command..");
									}							
									
								}while(loop5 == 0);
								
						    }
						}
						else if(player.equals("cart")) {
							if(cartbool = false) {
								if(duit >= cart) {
									duit -= cart;
									Thread.sleep(2000);
									System.out.println("Transaksi Berhasil");
									cartbool = true;
									System.out.print("Mau Beli Lagi?y/n  ");
									String data1 = scan.nextLine();
									if(data1.equals("y")) {
										
									}
									else if(data1.equals("n")) {
										break;
									}
								}
								else if(duit < cart) {
									System.out.println("Transaksi gagal");
									Thread.sleep(2000);
									System.out.println("Duit anda tidak cukup(duit kamu = "+duit+")");
									Thread.sleep(2000);
									System.out.println("Mau Beli Yang Lain?");
									String data1 = scan.next();
									int loop5 = 0;
									do {
										if(data1.equals("n")) {
											t = 1;
											break;
										}
										else if(data1.equals("y")) {
											break;
										}
										else {
											System.out.println("no command..");
										}							
										
									}while(loop5 == 0);
									
							    }
							}
							else {
								System.out.println("Kamu Dah Punya Weh");
							}
						}
						else if(player.equals("n")) {
							break;
						}
						else {
							System.out.println("maaf tidak di temukan perintah");
						}
					}while(t == 0);
				}	
				
				else if(d.equals("k")) {
					System.out.print("Yakin Mau Keluar? :(\ny/n ");
					String data1 = scan.next();
					if(data1.equals("y")) {
						System.out.println("Okey :)");
						Thread.sleep(2000);
						System.out.println("Game di tutup....");
						return;
					}
					else if(data1.equals("n")) {
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
				if(powhap = true) {
					pow += senang;
				}
				if(looppow = true) {
					pow += 1;
				}
				if(loopuang = true) {
					duit += 1000;
				}
				if(next = true) {
					nextlv = true;
					break;
				}
				if(lvl == 10) {
					lvl = 0;
					level += 1;
				}
				lvl += 1;
				token = 1;
			}while(true);
		}
		
		else {
			System.out.println("Kamu mau keluar ya :(");
			Thread.sleep(2000);
			System.out.println("Oke...");
			return;
		}
		
		System.out.println("Kamu Akhirnya Menang...");
		Thread.sleep(2000);
		System.out.print("Ini Pass kamu =");
		Thread.sleep(1000);
		System.out.print("1");
		Thread.sleep(1000);
		System.out.print("3");
		Thread.sleep(1000);
		System.out.print("2");
		Thread.sleep(1000);
		System.out.print("4");
		Thread.sleep(1000);
		System.out.print("5");
		Thread.sleep(1000);
		System.out.print("9");
		Thread.sleep(2000);
		System.out.print("..");
		Thread.sleep(1000);
		System.out.print("bye");
			
		
		
		

	}

}
