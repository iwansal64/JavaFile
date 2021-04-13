package cui;

import java.util.Scanner;
import java.util.Random;

public class Permainan_Java_1 {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int x = 0;
		
		System.out.println("Kalo mau keluar ketik 'k'.\n");
		Thread.sleep(2000);
		System.out.println("Selamat Datang Di Permainan Kuuuu (Ridwan.Author)");
		System.out.print("\nMulaikan? y/n  ");
		String c = scan.nextLine();
		if(c.equals("y")) {
			long duit = 0;
			int pow = 0;
			int senang = 0;
			int ch = 0;
			int st = 0;
			int str = 0;
			int kes = 0;
			int cheer = 10000;
			int strong = 20000; 
			int sword = 30000;
			int life = 15000;
			int health = 10;
			int time;
			int enemy;
			int token = 1;
			
			System.out.println("Di hari yang cerah... mau ngapain ya?\n");
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
				pow += str;
				senang += kes;
				System.out.println("Fish/Chop/Check(Pow & Kesenangan)");
				System.out.print("Mau ngapain?F/C/Check/Shop/Hunt\n/HuntAdvanced/HuntExpert/magic shop = ");
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
							int huntloop1 = 0;
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
							}while(huntloop1 == 0);
							
						}
						
						else if(enemy >= 4 && enemy <= 5){
							int huntloop2 = 0;
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
							}while(huntloop2 == 0);
						}
						else {
							int huntloop3 = 0;
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
							}while(huntloop3 == 0);
							
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
						System.out.println("===Life Potion=====  ++5health(per)");
						System.out.println("=Sword{}===========  ++8pow(per)");
						System.out.println("\n==Cheer Potion=== 10rb");
						System.out.println("==Strong Potion=== 20rb");
						System.out.println("==Life Potion===== 30rb");
						System.out.println("==Sword==========> 30rb");
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
						else if(player.equals("life potion")) {
							if(duit >= life) {
								System.out.println("Transaksi Berhasil");
								health = 10;
								System.out.println("darah di pulihkan");
								System.out.print("\nMau Beli Lagi?y/n  ");
								String data1 = scan.nextLine();
								if(data1.equals("y")) {
									
								}
								else if(data1.equals("n")) {
									break;
								}
							}
							else if(duit < life) {
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
						x = 1;
						Thread.sleep(2000);
						System.out.println("Game di tutup....");
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
				
				token = 1;
			}while(x == 0);
		}
		
		else {
			System.out.println("Kamu mau keluar ya :(");
			Thread.sleep(2000);
			System.out.println("Oke...");
		}
		
		
		

	}

}
