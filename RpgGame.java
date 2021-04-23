package RpgGamePackage;

import java.util.Scanner;
import java.util.Random;

/*
 * Created On April 13 2021
 * 
 * Tuesday 10:00 am
 */

/*
 * 
 * @Author Ridwan B.S
 * 
 * Reference {
 * Buku = Esensi Esensi Bahasa Pemrograman Java, 
 * Youtube = Kelas Terbuka (Tutorial Java (Dasar) Playlist)
 * }
 */


public class RpgAdv {
	
	/* =====   Player   ===== */
	
	//Command Data
	static String data;
	
 	//Statistik Player
	static int pow = 0;
	static int senang = 0;
	static int hari = 1;
	static int jam = 0;
	static int magicStar = 0;
	static int maxhealth = 10;
	static int health = maxhealth;
	static int level = 0;
	static int lvl = 0;
	static int maxlevel = 0;
	static int token = 1;
	static int luck;
	static int RandomChat;
	
	//Penambahan Statistik
	static int ch = 0;
	static int st = 0;
	static int str = 0;
	static int kes = 0;
	
	//Harta dan Tahta (Termasuk Hasil Mining)
	static long duit = 0;
	static int permata = 0;
	static int mutiara = 0;
	static int ruby = 0;
	static int rubynow = 1;
	
	//Pengecekan Area
	public static boolean area1 = true;
	public static boolean area2 = false;
	public static boolean area3 = false;
	
	//Power 
	static int apiExp = 0;
	static int airExp = 0;
	static int anginExp = 0;
	static int lvlapi = 0;
	static int lvlangin = 0;
	static int lvlair = 0;
	static int powerApi;
	static int powerAir;
	static int powerAngin;
	public static boolean api = false;
	public static boolean air = false;
	public static boolean angin = false;
	
	/* ======  Harga Harga  ======= */
	static int cheer = 10000;
	static int strong = 20000; 
	static int sword = 30000;
	static int heal = 15000;
	static int life = 25000;
	static int magic = 40000;
	static int happy = 40000;
	static int uangloop = 40000;
	static int uangpow = 40000;
	static int pets = 50000;
	static int cart = 40000;
	static int alat = 30000;
	static int protectedcoin = 100000;
	
	//Pengecekan power & loop
	public static boolean magicbool = false;
	public static boolean powhap = false;
	public static boolean loopuang = false;
	public static boolean looppow = false;
	public static boolean kucing = false;
	public static boolean next = false;
	public static boolean cartbool = false;
	public static boolean alatbool = false;
	public static boolean protectedbool = false;
	public static String nama;
	
	public static void CheckManager() {
		System.out.println("======== Profil =======");
		if(nama.equalsIgnoreCase("Ridwan") || nama.equalsIgnoreCase("wannTzy")) {
			System.out.println("Namaewa = --"+nama+"--");
		}
		System.out.println("Token sekarang = "+token);
		if(maxlevel == 1) {
			System.out.println("|::|LEVEL SUDAH MAX|::|");
		}
		else if(maxlevel == 0){
			System.out.println("lvl = "+lvl);
			System.out.println("Level = "+level);
		}
		System.out.println("power kamu = "+pow+"\nkesenangan kamu = "+senang);
		System.out.println("Duit kamu "+"Rp."+duit);
		System.out.println("Darah kamu = "+health);
		
		System.out.println("\n======  Power  ======");
		System.out.println("Magic power = "+magicbool);
		System.out.println("Power happy = "+powhap);
		
		System.out.println("\n======  Loop   ======");
		System.out.println("Loop uang   = "+loopuang);
		System.out.println("Loop power  = "+looppow);
		
		System.out.println("\n======Keperluan======");
		System.out.println(" Protected  = "+protectedbool);
		System.out.println("   Cart     = "+cartbool);
		System.out.println("   Pet      = "+kucing);
	}
	
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("Kalo mau keluar ketik 'k'.\n");
		Thread.sleep(1000);
		System.out.println("Selamat Datang Di Permainan Kuuuu (Ridwan.Author)");
		System.out.print("Mulaikan? y/n  ");
		String c = scan.nextLine();
		if(c.equals("y")) {
			System.out.print("\nMasukan Nama kamuu = ");
			nama = scan.nextLine();
			Area1();
		}
		
		else {
			System.out.println("Kamu mau keluar ya :(");
			Thread.sleep(2000);
			System.out.println("Oke...");
			return;
		}
		
		
	}
	
	public static void Area1() throws Exception{
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		if(nama.equalsIgnoreCase("Ridwan")) {
			duit += 1000000;
			pow += 500;
			senang += 500;
		}
		else if(nama.equalsIgnoreCase("WannTzy")) {
			duit += 50000;
			protectedbool = true;
			level += 5;
			pow += 1000;
			maxhealth += 10;
			health = maxhealth;
		}
		//String Input
		String datastr;
		
		//Randomize Integer
		int time;
		int enemy;
		int mutiararan;
		int permataran;
		int ExpertDamage;
		System.out.println("Assalamualaikum....");
		Thread.sleep(2000);			
		do {
			//Enemy Lemah
			//Literal
			int ela = 3;
			int elh = 400;
			//Random
			int reward1;
			
			//Enemy Normal
			//Literal
			int ena = 5;
			int enh = 500;
			//Random
			int reward2;
			
			
			//Enemy Kuat
			//Literal
			int esa = 10;
			int esh = 600;
			//Random
			int reward3;
			
			
			//Enemy Adv 1
			//Literal
			int had1 = 700;
			int aad1 = 15;
			//Random
			int rewardad1;
			
			
			//Enemy Adv 2
			//Literal
			int had2 = 800;
			int aad2 = 25;
			//Random
			int rewardad2;
			
			
			//Enemy Adv 3
			//Literal
			int had3 = 1000;
			int aad3 = 30;
			//Random
			int rewardad3;
			
			//MINE PROPERTIES
			//RandomizeMine
			int turnmine;
			int hartamine;
			int lorong = 0;
			
			//Permata
			int duitpermata = 0;
			int duitmutiara = 0;
			int duitruby = 0;
			
			//Enemy Mine Normal
			//Literal
			int EnemymineNA = 25;
			int EnemymineNH = 40;
			//Random
			int rewardmine1;
			int enemymine;
			
			
			//Enemy Mine Strong
			//Literal
			int EnemymineSA = 40;
			int EnemymineSH = 60;
			//Random
			int rewardmine2;
			
			pow += str;
			senang += kes;
			
			
			if(area2 = false) {
				System.out.println("Fish/Chop/Check(Pow & Kesenangan)/Shop/Hunt/\nHuntAdvance/HuntExpert/Mine/Magic Shop/Tutor");
			}
			else if(area2 = true) {
				System.out.println("Fish/Chop/Check(Pow & Kesenangan)/Shop/Hunt/\nHuntAdvance/HuntExpert/Mine/Magic Shop/Tutor/Area2");
			}
			else {
				
			}
			Thread.sleep(1000);
			String d = scan.nextLine().toLowerCase();
			if (d.isEmpty()){
				System.out.println("Kenapa empty bos?");
			}
			else if(d.equals("f") || d.equals("fish")) {
				pow += 1;
				senang += 2;
				duit += 1000;
				System.out.println("Memancing sangat menyenangkan kamu!");
				System.out.println(" pow +1\nsenang +2\nduit +1\n");
			}
			else if(d.equals("c") || d.equals("chop")) {
				pow += 3;
				duit += 3000;
				health -= 2;
				System.out.println("huuft sangat Melelahkan");
				System.out.println(" pow +2\n");
				System.out.println("capek banget... health-2");
				System.out.println("Duit bertambah 3");
				
			}
			else if(d.equals("check")) {
				CheckManager();
			}
			else if(d.equals("tutor") || d.equals("tutorial") || d.equals("help")) {
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
				System.out.println("Di Magic Shop Barang Yang\nDi Jual Adalah Barang Expert");
				System.out.println("(Note : Magic Shop Terbuka Level 2)");
				
				System.out.println("===TUTORIAL POWER====");
				System.out.println("1.Happy Power");
				System.out.println("-Setiap Kesenangan Yang Kita Dapat Akan\nDi Konvnsikan Menjadi Power Saat");
				System.out.println("Terloop(Tanda Tandanya saat ada kalimat 'Fish/Chop/Check' dll");
				System.out.println("2.Magic Power");
				System.out.println("-Magic Power HAnya Bisa Dipakai Di Area 2");
			}
			else if(d.equals("magic shop") || d.equals("ms")) {
				if(level >= 2) {
					System.out.println("Magic..(\\\\|//)");
					Thread.sleep(2000);
					System.out.println("Shop---{--=-=--}");
					Thread.sleep(2000);
					System.out.print("1/2?  ");
					int data = scan.nextInt();
					if(data == 1) {
						int sudahpernahmagic = 0;
						do {
							if(sudahpernahmagic == 0) {
								System.out.println("1.=== life Pot ====");
								System.out.println("-Menambah Max HP \nHP + 2 -25rb");
								Thread.sleep(2000);
								System.out.println("2.== Happy Pow ====");
								System.out.println("-Konversi Kesenangan\nMenjadi Power -40rb");
								Thread.sleep(2000);
								System.out.println("3.== Protected ==");
								System.out.println("-Kalo Mati Bisa Ngulang -100rb");
								Thread.sleep(2000);
								System.out.println("4.==   Exit    ====");
								System.out.print("\nMau Beli Apa? 1,2,,3,4");
								System.out.println("duit ="+duit);
								sudahpernahmagic = 1;
							}
							else if(sudahpernahmagic == 1) {
								System.out.println("1.=== life Pot ====");
								System.out.println("-Menambah Max HP \nHP + 2 -25rb");
								System.out.println("2.== Happy Pow ====");
								System.out.println("-Konversi Kesenangan\nMenjadi Power -40rb");
								System.out.println("3.== Protected ==");
								System.out.println("-Kalo Mati Bisa Ngulang -100rb");
								System.out.println("4.==   Exit    ====");
								System.out.print("\nMau Beli Apa? 1,2,,3,4");
								System.out.println("duit ="+duit);
							}
							data = scan.nextInt();
							scan.nextLine();
							if(data == 1) {
								if(duit >= life) {
									duit -= life;
									maxhealth += 2;
									health = maxhealth;
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
							else if(data == 2) {
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
							else if(data == 3) {
								if(duit >= protectedcoin) {
									duit -= protectedcoin;
									protectedbool = true;
									System.out.println("Terbeli!");
									System.out.println("mau beli lagi?");
									datastr = scan.nextLine();
									if(datastr.equals("n")) {
										break;
									}
								}
								else if(duit < protectedcoin) {
									System.out.println("Tidak Cukup DUIT!");
									System.out.println("kesenangan -10");
									senang -= 10;
								}
							}
							else if(data == 4){
								break;
							}
							else {
								System.out.println("Kuanggap Exit Wkkww");
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
									System.out.println("Uang Akan Mendatangi mu setiap jam");
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
									System.out.println("Power Bertambah setiap jam");
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
				}
				else if(level < 3) {
					System.out.println("TiDAk BiSA MASUk");
					System.out.println("PERSYARATAN TiDAk\nTERPENUhi");
				}
				
			}
			else if(d.equals("tool")) {
				if(alatbool == true) {
					if(mutiara > 0 || permata > 0 || ruby > 0) {
						System.out.println("Mau Mecahin Yang Mana?");
						System.out.println("_Permata = "+permata);
						System.out.println("_Mutiara = "+mutiara);
						System.out.println("_Ruby    = "+ruby);
						String data = scan.nextLine().toLowerCase();
						if(data.equals("permata")) {
							if(permata > 0) {
								System.out.println("Mau Berapa Permata Yang Mau Kamu Pecah");
								Thread.sleep(2000);
								int berapapermata = scan.nextInt();
								if(permata >= berapapermata) {
									System.out.println("Memecah....");
									permata -= berapapermata;
									Thread.sleep(2000);
									System.out.println("Kamu Memecah "+berapapermata+" Permata");
									duitpermata += (berapapermata * (100000 + 20000));
									duit += duitpermata;
									Thread.sleep(2000);
									System.out.println("\nKamu Mendapat "+duitpermata);
								}
								else {
									System.out.println("Kamu Punya Permata "+permata);
									System.out.println("Masih Tidak Cukup");
								}
							}
							else {
								System.out.println("Permata kamu masih nol!");
							}
						}
						else if(data.equals("mutiara")){
							if(mutiara > 0) {
								System.out.println("Mau Berapa Mutiara");
							}
						}
					}
				}
				else if(alatbool == false) {
					System.out.println("Kamu tidak punya alatnya");
					System.out.println("Beli Di Shop Sana");
				}
			}
			else if(d.equals("mine")) {
				if(level >= 3 && token >= 10) {
					if(cartbool == true) {
						System.out.println("Kamu Memasuki Zona Mining");
						Thread.sleep(2000);
						System.out.println("Mine.. Mine.. Mine..");
						if(kucing == true) {
							System.out.println("Bersama Pets yang Unyuuu");
						}
						Thread.sleep(2000);
						int data = scan.nextInt();
						if(kucing == true) {
							luck = 1 + ran.nextInt(2);
							System.out.print("Kamu Bertemu 2 lorong");
							
						}
						else if(kucing == false) {
							luck = 1 + ran.nextInt(4);
							System.out.println("Kamu Bertemu 4 lorong");
						}
						if(data == luck) {
							System.out.println("Kamu memasuki lorong ke-"+data);
							Thread.sleep(2000);
							System.out.println("\nCriing Kamu menemukan Emas!");
							Thread.sleep(2000);
							System.out.println("Selamat!! Duit +100000 Pow +20 Senang +50");
							duit += 100000;
							pow += 20;
							senang += 50;
						}
						else if(data != luck) {
							System.out.println("Kamu memasuki lorong ke-"+data);
							Thread.sleep(2000);
							enemymine = 1 + ran.nextInt(2);
							if(enemymine == 1) {
								System.out.println("Kamu Menemukan Laba Laba!");
								turnmine = 1 + ran.nextInt(2);
								if(turnmine == 1) {
									System.out.println("Kamuu Menyerang Duluan!");
									boolean text = false;
									do {
										if(text == false) {
											
										}
										else {
											System.out.println("Kamu Menyerang Lagi");
										}
										EnemymineNH -= pow;
										if(EnemymineNH <= 0) {
											System.out.println("Kamu Menang!! Yey");
											Thread.sleep(2000);
											System.out.println("Kamu Mengalahkan Laba Laba Normal!");
											Thread.sleep(2000);
											rewardmine1 = 1 + ran.nextInt(3);
											if(rewardmine1 == 1) {
												System.out.print("Kamu Mendapatkan... ");
												hartamine = 1 + ran.nextInt(6);
												if(hartamine == 1 && hartamine <= 3) {
													permataran = 1 + ran.nextInt(3);
													permata += permataran;
													System.out.println("Permata +"+permataran+"!");
												}
												else if(hartamine == 4 && hartamine <= 5) {
													mutiararan = 1 + ran.nextInt(2);
													mutiara += mutiararan;
													System.out.println("Mutiara +"+mutiararan+"!!");
												}
												else if(hartamine == 6) {
													ruby += 1;
													System.out.println("RUBY! +"+rubynow);
												}
											}
										}
										else {
											System.out.println("Musuh Terkena Serangan!! ");
											System.out.println("Darah Musuh =Sekarang = "+EnemymineNH);
										}
										System.out.println("Musuh Menyerang!");
										health -= EnemymineNA;
										if(health <= 0) {
											System.out.println("Kamu Kalah :(");
											Thread.sleep(2000);
											System.out.println("Maaf");
											Thread.sleep(2000);
											System.out.println("level -3");
											Thread.sleep(2000);
											System.out.println("duit -50000");
											duit -= 50000;
											level -= 3;
										}
										else {
											System.out.println("Darah Kamu Sekarang = "+health);
										}
										text = true;
									}while(true);
									
								}
								else {
									System.out.println("Musuh Menyerang Duluan!");
									boolean text = false;
									do {
										if(text == false) {
											
										}
										else {
											System.out.println("Musuh Menyerang!");
										}
										health -= EnemymineNA;
										if(health <= 0) {
											System.out.println("Kamu Kalah :(");
											Thread.sleep(2000);
											System.out.println("Maaf");
											Thread.sleep(2000);
											System.out.println("level -3");
											Thread.sleep(2000);
											System.out.println("duit -50000");
											duit -= 50000;
											level -= 3;
										}
										else {
											System.out.println("Darah Kamu Sekarang = "+health);
										}
										
									}while(true);
								}
								
							}
							else if(enemymine == 2) {
								System.out.println("Kamu Menemukan Laba Laba BESAR!");
								turnmine = 1 + ran.nextInt(2);
								if(turnmine == 1) {
									System.out.println("Kamuu Menyerang Duluan!");
									boolean text = false;
									do {
										if(text == false) {
											
										}else {
											System.out.println("Kamu Menyerang Musuh Sekarang");
										}
										EnemymineSH -= pow;
										if(EnemymineSH == 0) {
											System.out.println("Kamu Menang!! Yey");
											Thread.sleep(2000);
											System.out.println("Kamu Mengalahkan Laba Laba BESAR!!");
											Thread.sleep(2000);
											rewardmine2 = 1 + ran.nextInt(3);
											if(rewardmine2 == 1) {
												System.out.println("Kamu dapat hartakarun!!");
												System.out.print("Kamu Mendapatkan... ");
												hartamine = 1 + ran.nextInt(6);
												if(hartamine == 1 && hartamine <= 3) {
													permataran = 1 + ran.nextInt(3);
													permata += permataran;
													System.out.println("Permata +"+permataran+"!");
												}
												else if(hartamine == 4 && hartamine <= 5) {
													mutiararan = 1 + ran.nextInt(2);
													mutiara += mutiararan;
													System.out.println("Mutiara +"+mutiararan+"!!");
												}
												else if(hartamine == 6) {
													ruby += 1;
													System.out.println("RUBY! +"+rubynow);
												}
											}
										}
										System.out.println("Musuh Menyrang!");
										health -= EnemymineSA;
										if(health <= 0) {
											System.out.println("Kamu Kalah Lawan Laba Laba Besar..");
											Thread.sleep(2000);
											System.out.println("Sorry.. Itu Memang Susah Dikalahin");
											Thread.sleep(2000);
											System.out.println("Level -3");
											Thread.sleep(1000);
											System.out.println("duit  -30000");
											level -= 3;
											duit -= 30000;
										}
										else {
											System.out.println("Darah Kamu Sekarang = "+health+"!");
										}
									}while(true);
									
								}
							}
						}
					}
					else if(cartbool == false) {
						System.out.println("Kamu Tidak Punya Kereta Mining");
					}
				}
				else {
					if(token < 10) {
						System.out.println("Token Tidak Cukup");
					}
					else if(level < 3) {
						System.out.println("Level Tidak Cukup");
					}
					else if(token < 10 && level < 3) {
						System.out.println("Token Dan Level Tidak Cukup");
					}
					else {
						
					}
				}
			}
			else if(d.equals("hunt") || d.equals("h")) {
				if(token < 3) {
					System.out.println("Kekurangan Token");
				}
				else if(token > 3) {
					System.out.println("\nKamu ngehunt..");
					Thread.sleep(2000);
					System.out.println("\nkamu yakin?...");
					System.out.println("dengan Hp = "+health);
					System.out.println("dan Kekuatan = "+pow);
					String data = scan.nextLine();
					if(data.equals("y") || data.isEmpty()) {
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
								if(health <= 0) {
									System.out.println("Kamu Kalah :(");
									Thread.sleep(2000);
									if(protectedbool == false) {
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else if(protectedbool == true) {
										System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
										duit = 0;
									}
								}
								else {
									System.out.println("\ndarah kamu sekarang "+health+" -"+ela);
									Thread.sleep(2000);
								}
								System.out.println("Sekarang Giliran kamu yang menyerang");
								elh -= pow;
								Thread.sleep(2000);
								if(elh <= 0) {
									System.out.println("Darah Musuh =="+elh+"  -"+pow);
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
									System.out.println("Darah Musuh ="+elh+" -"+pow);
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
									if(protectedbool == false) {
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else if(protectedbool == true) {
										System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
										duit = 0;
									}
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
									System.out.println("Darah Musuh ="+enh+" -"+pow);
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
									if(protectedbool == false) {
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else if(protectedbool == true) {
										System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
										duit = 0;
									}
								}
								else {
									System.out.println("\ndarah kamu sekarang "+health+" -"+esa+"!");
									Thread.sleep(2000);
								}
								System.out.println("Ini Waktunya Menyerang!");
								esh -= pow;
								Thread.sleep(2000);
								if(esh <= 0) {
									System.out.println("Musuh Kuat Kalah Dan Kamu Menang Yey!!");
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
									System.out.println("Darah Musuh ="+esh+" -"+pow);
								}
							}while(true);
							
						}
						
					}
					
					else {
						System.out.println("Oke.");
					}
				}
		    }
			else if(d.equals("hunt advanced") || d.equals("hunt advance")) {
				int loopad = 0;
				int pernahadvance = 0;
				if(token >= 5) {

					System.out.println("Kamu Memasuki Wilayah Advanced");
					Thread.sleep(2000);
					if(pernahadvance == 0) {
						System.out.println("Siap Lurr?");
					}
					else {
						System.out.println("Mau Hunting Lagi Lurr?");
					}
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
							do {
								System.out.println("Musuh Akan Menyerang");
								health -= aad1;
								if(health <= 0) {
									System.out.println("Kamu Kalah :(");
									Thread.sleep(2000);
									if(protectedbool == false) {
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else if(protectedbool == true) {
										System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
										duit = 0;
									}
								}
								else {
									System.out.println("\ndarah kamu sekarang "+health+" -"+aad1+"!");
									Thread.sleep(2000);
								}
								System.out.println("Waktu nya menyerang!!");
								int power = pow + ran.nextInt(pow*4);
								if(power >= (pow*2)) {
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
										System.out.println("Darah Musuh ="+had1+" -"+pow);
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
											lvl += 5;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
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
											lvl += 5;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
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
											lvl += 5;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											duit += 60000;
											pow += 50;
											senang += 65;
											System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
											Thread.sleep(3000);
											break;
										
									   } 
								    }
								}
							}while(true);
						}
						else if(enemy >= 4 && enemy <= 5 ) {
							do {

								System.out.println("Kamu Bertemu Musuh Normal!");
								Thread.sleep(2000);
								System.out.println("Musuh Akan Menyerang");
								health -= aad2;
								if(health <= 0) {
									System.out.println("Kamu Kalah :(");
									Thread.sleep(2000);
									if(protectedbool == false) {
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else if(protectedbool == true) {
										System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
										duit = 0;
									}
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
											lvl += 9;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
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
											lvl += 9;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
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
											lvl += 9;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											duit += 70000;
											pow += 55;
											senang += 73;
											System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
											Thread.sleep(3000);
											break;
										
									   } 
								    }
									else {
										System.out.println("Darah Musuh ="+had2+" -"+pow);
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
											lvl += 9;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
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
											lvl += 9;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
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
											lvl += 9;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											duit += 70000;
											pow += 55;
											senang += 73;
											System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
											Thread.sleep(3000);
											break;
										
									   } 
								    }
								}
							}while(true);
						}
						else if(enemy == 6) {
							do {

								System.out.println("Kamu Bertemu Musuh Kuat!!");
								Thread.sleep(2000);
								System.out.println("Musuh Akan Menyerang!!");
								health -= aad3;
								if(health <= 0) {
									System.out.println("Kamu Kalah :(");
									Thread.sleep(2000);
									if(protectedbool == false) {
										System.out.println("Kamu Pun Mati...");
										Thread.sleep(2000);
										System.out.println("Sorry..");
										Thread.sleep(1000);
										System.out.println("Game Di Tutup...");
										return;
									}
									else if(protectedbool == true) {
										System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
										duit = 0;
									}
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
											lvl += 15;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											else if(level == (level + 2)) {
												System.out.println("Selamat Kamu Naik 2 Level");
											}
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
											lvl += 15;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											else if(level == (level + 2)) {
												System.out.println("Selamat Kamu Naik 2 Level");
											}
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
											lvl += 15;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											else if(level == (level + 2)) {
												System.out.println("Selamat Kamu Naik 2 Level");
											}
											duit += 90000;
											pow += 75;
											senang += 90;
											System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
											Thread.sleep(3000);
											break;
										
									   } 
								    }
									else {
										System.out.println("Darah Musuh ="+had3+" -"+pow);
									}
								}
								else if(power < (pow+2)) {
									had3 -= pow;
									if(esh <= 0) {
										System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
										System.out.println("===Result===");
										rewardad3 = 1 + ran.nextInt(3);
										if(rewardad3 == 1) {
											System.out.println("--80Ribu");
											System.out.println("--60Pow");
											System.out.println("--75Kes");
											lvl += 15;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											else if(level == (level + 2)) {
												System.out.println("Selamat Kamu Naik 2 Level");
											}
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
											lvl += 15;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											else if(level == (level + 2)) {
												System.out.println("Selamat Kamu Naik 2 Level");
											}
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
											lvl += 15;
											if(level == (level + 1)) {
												System.out.println("Selamat Naik Level! Menjadi "+level);
											}
											else if(level == (level + 2)) {
												System.out.println("Selamat Kamu Naik 2 Level");
											}
											duit += 90000;
											pow += 75;
											senang += 90;
											System.out.println("\nKamu Jago...\nKamu Kembali ke tempat asal");
											Thread.sleep(3000);
											break;
										
									   }  
								    }
								}
							}while(true);
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
			}
			else if(d.equals("hunt expert")) {
				do {
					if(token >= 8) {
						System.out.println("Kamu Memasuki Wilayah Expert");
						if(health > 2) {
							do {
								RandomChat = 1 + ran.nextInt(3);
								if(RandomChat == 1) {
									System.out.println("Siap Siap Lurr . . .");
								}
								else if(RandomChat == 2) {
									System.out.println("Shhh...");
								}
								else {
									System.out.println("Hati Hati");
								}
								ExpertDamage = (1 + ran.nextInt(4)) * 10;
								Thread.sleep(2000);
								System.out.println("Duar!");
								health -= ExpertDamage;
								System.out.println("Darah kamu "+health);
								if(health <= 0) {
									System.out.println("Kamu Kalah");
								}
								else if(health > 0) {
									System.out.println("Tangguh juga");
								}
								luck = 1 + ran.nextInt(3);
								if(luck == 1) {
									System.out.println("Selesai!");
									luck = 1 + ran.nextInt(3);
									if(luck == 1) {
										System.out.println("Ruby 2, Duit 40000, Power +30");
										ruby += 2;
										duit += 40000;
										pow += 30;
									}
									else if(luck == 2) {
										System.out.println("Ruby 1, Duit 60000, Power +40");
										ruby += 1;
										duit += 60000;
										pow += 40;
									}
									else {
										System.out.println("Permata 3, Duit 50000, Senang +70");
										permata += 3;
										duit += 50000;
										senang += 70;
									}
								}
								else {
									System.out.println("Kamu Belum Menemukan Apa apa disini");
								}
								
							}while(true);
						}
						else if(health > 60) {
							
						}
					}
					else {
						System.out.println("Kamu Tidak Bisa Masuk..");
						Thread.sleep(2000);
						System.out.println("Token kamu tidak mencukupi(butuh 8 token)");
						Thread.sleep(3000);
						break;
					}
				}while(true);
			}
			else if(d.equals("shop")) {
				int t = 0;
				do{
					System.out.println("===Cheer Potion====  ++100kes(non permanent)");
					System.out.println("===Strong Potion===  ++100pow(non permanent)");
					System.out.println("=Sword{}===========  ++28pow(permanent)");
					System.out.println("===Heal Potion=====  (Health = MaxHealth)");
					System.out.println("===     Cart    ===  (Membuka Fitur Mine)");
					System.out.println("===     Alat    ===  (Pemecah permata)");
					System.out.println("\n==Cheer Potion=== 10rb");
					System.out.println("==Strong Potion===  20rb");
					System.out.println("==Heal Potion=====  30rb");
					System.out.println("==Sword==========>  30rb");
					System.out.println("==     Cart    ===  40rb");
					System.out.println("==     Alat    ===  30rb");
					System.out.println("\nMau Beli Apa? ");
					String player = scan.nextLine().toLowerCase();
					if(player.equals("cheer potion")) {
						if(duit >= cheer) {
							duit -= cheer;
							Thread.sleep(2000);
							System.out.println("Transaksi Berhasil");
							ch += 100;
							System.out.println("Kesenangan +100");
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
							String data1 = scan.nextLine();
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
					else if(player.equals("alat")) {
						if(alatbool == true) {
							System.out.println("Kamu Sudah Punya LoL :v");
						}
						else if(duit >= alat) {
							System.out.println("Transaksi Berhasil");
							health = maxhealth;
							duit -= alat;
							alatbool = true;
							System.out.println("Sekarang Kamu Bisa Memecah Permata");
							System.out.print("\nMau Beli Lagi?y/n  ");
							String data1 = scan.nextLine();
							if(data1.equals("y")) {
								
							}
							else if(data1.equals("n")) {
								break;
							}
						}
						else if(duit < alat) {
							System.out.println("Transaksi gagal");
							Thread.sleep(2000);
							System.out.println("Duit anda tidak cukup(duit kamu = "+duit+")");
							Thread.sleep(2000);
							System.out.println("Mau Beli Yang Lain?");
							String data1 = scan.nextLine();
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
							health = maxhealth;
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
							String data1 = scan.nextLine();
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
							st += 100;
							System.out.println("Power +100");
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
							String data1 = scan.nextLine();
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
							pow += 28;
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
							String data1 = scan.nextLine();
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
						if(cartbool = true) {
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
								String data1 = scan.nextLine();
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
			else if(d.equals("area2") || d.equals("area 2")) {
				if(area2 = true) {
					System.out.println("Kamu Memasuki Area2...");
					Thread.sleep(2000);
					Area2();
				}
				else if(area2 = false) {
					System.out.println("Kamu Harus Mencapai Level Max Di Area 1");
					Thread.sleep(2000);
					System.out.println("Dengan Mendapat level 30");
				}
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
			
			/* ------------   Game Manager   ------------*/
			
			// == Mereset Potion Non Permanen (Batas Waktu)
			kes = 0;
			str = 0;
			
			// === Potion Non Permanen Manager ===
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
			
			// ====     Power Manager     ====
			if(powhap = true) {
				pow += senang;
			}
			if(looppow = true) {
				pow += 1;
			}
			if(loopuang = true) {
				duit += 1000;
			}
			
			// === Penambahan Level Manager ===
			if(lvl >= 10) {
				lvl = 0;
				level += 1;
			}
			
			// =====   Max Level Manager  =====
			if(level >= 20) {
				maxlevel = 1;
			}
			if(health <= 0) {
				System.out.println("Kamu Mati..");
				if(protectedbool == false) {
					return;
				}
				else if(protectedbool == true) {
					System.out.println("Kamu Terselamatkan tapi duitnya ke reset");
					duit = 0;
				}
			} 
			else{
			}
			
			// === Level, Token dan lvl Manager ===
			if(level >= 0 && level <= 3) {
				lvl += 3;
				token += 3;					
			}
			else if(level >= 4 && level <= 8) {
				lvl += 2;
				token += 2;
			}
			else if(level >= 9 && level <= 12) {
				lvl += 1;
				token += 2;
			}
			else if(level >= 13 && level <= 16) {
				lvl += 1;
				token += 4;
			}
			else if(level > 16 && level < 30) {
				lvl += 1;
				token += 5;
			}
			else if(level == 30) {
				lvl = 0;
				token = 10;
				area2 = true;
				if(area1 == false) {
					
				}
				else if(area1 == true) {
					break;
				}
			}
			
			// ========    Jam dan Hari    ======== 
			
			
			
			
			// =====     Max Token Manager    =====
			if(token > 20) {
				token = 20;
			}
			
		}while(true);
		
		//Area 2
		System.out.println("Tiba Tiba...");
		Thread.sleep(2000);
		System.out.println("Kamu Memasuki Area2!");
		Thread.sleep(2000);
		Area2();
		
	}
	
	public static void Area2() throws Exception{
		//Constructor
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//Area Handling
		int Pernah = 0;
		
		
		boolean PernahDiUpApi = false;
		boolean PernahDiUpAir = false;
		boolean PernahDiUpAangin = false;
		boolean magic1 = false;
		
		String command;
		
		
		//Training
		//Rewards
		int duittr = 50000;
		//Random
		int tr;
		
		
		//Hunting
		//EnemyHealth
		int EnemyHealthEasy = 1100;
		int EnemyAttackEasy = 10;
		
		int EnemyHealthNormal = 2000;
		int EnemyAttackNormal = 15;
		
		int EnemyHealthStrong = 3000;
		int EnemyAttackStrong = 20;
		
		//Random
		int time;
		int EnemyRandom;
		
		//Rewards
		int reward1;
		int reward2;
		int reward3;
		
		System.out.println("Memasuki Area2...");
		Thread.sleep(2000);
		System.out.println("Selamat datang di Area 2");
		Thread.sleep(2000);
		System.out.println("Jika mau keluar ketik 'keluar'");
		Thread.sleep(2000);
		System.out.println("Jika mau kembali ke Area 1 ketik area 1");
		do {
			/* ======== Level Handling ========= */
			if(level >= 30 && level <= 33) {
				lvl += 5;					
			}
			else if(level >= 34 && level <= 38) {
				lvl += 4;
			}
			else if(level >= 39 && level <= 42) {
				lvl += 3;
			}
			else if(level >= 43 && level <= 46) {
				lvl += 2;
			}
			else if(level > 46 && level < 50) {
				lvl += 2;
			}
			else if(level == 60) {
				lvl = 0;
				area3 = true;
				if(area2 == false) {
					
				}
				else if(area1 == true) {
					break;
				}
			}
			
			/* ======== Power Handling ========= */
			if(loopuang == true) {
				duit += 1000;
			}
			if(looppow == true) {
				pow += 1;
			}
			if(powhap == true) {
				pow += senang;
			}
			
			
			
			if(apiExp > 10) {
				lvlapi += 1;
				apiExp -= 10;
			}
			else if(apiExp > 20) {
				lvlapi += 2;
				apiExp -= 20;
			}
			
			
			if(airExp > 10) {
				lvlair += 1;
				airExp -= 10;
			}
			else if(airExp > 20) {
				lvlair += 2;
				airExp -= 20;
			}
			
			
			if(anginExp > 10) {
				lvlangin += 1;
				anginExp -= 10;
			}
			else if(anginExp > 20) {
				lvlangin += 2;
				anginExp -= 20;
			}
			
			if(lvlapi == 1) {
				powerApi += lvlapi * 100000;
			}
			/* =========   GAME   ========= */
			if(air||api||angin == true) {
				if(magic1 = false) {
					pow += 100000;
				}
				else if(magic1 = true) {
				}
			}
			if(Pernah == 0) {
				Thread.sleep(1000);
				System.out.println("Command :");
				System.out.println("-Magic Area\n-Training\n-TebakanGame\n-Area 1");
				Pernah = 1;
			}
			else if(Pernah == 1) {
				System.out.print("Command = ");
			}
			String data = scan.nextLine();
			if(data.equalsIgnoreCase("Area 1")) {
				System.out.println("Memasuki area 1");
				Area1();
			}
			else if(data.equalsIgnoreCase("help")) {
				System.out.println("Command :");
				System.out.println("-Magic Area\n-Training\n-TebakanGame\n-Area 1");
			}
			else if(data.equalsIgnoreCase("check")) {
				System.out.println("======== Profil =======");
				System.out.println("Namaewa = "+nama);
				if(maxlevel == 1) {
					System.out.println("|::|LEVEL SUDAH MAX|::|");
				}
				else if(maxlevel == 0){
					System.out.println("lvl = "+lvl);
					System.out.println("Level = "+level);
				}
				System.out.println("power kamu = "+pow+"\nkesenangan kamu = "+senang);
				System.out.println("Duit kamu "+"Rp."+duit);
				System.out.println("Darah kamu = "+health);
				System.out.println("\n======  Power  ======");
				System.out.println("Magic power = "+magicbool);
				System.out.println("                _________");
				System.out.println("            Api   = "+api);
				System.out.println("            Air   = "+air);
				System.out.println("            Angin = "+angin);
				System.out.println("Power happy = "+powhap);
				System.out.println("\n======  Loop   ======");
				System.out.println("Loop uang   = "+loopuang);
				System.out.println("Loop power  = "+looppow);
				System.out.println("\n======Keperluan======");
				System.out.println("   Cart     = "+cartbool);
				System.out.println("   Pet      = "+kucing);
			}
			else if(data.equalsIgnoreCase("Training")) {
				tr = 1 + ran.nextInt(5);
				if(tr == 1) {
					Thread.sleep(2000);
					System.out.println("(*) Ini Namanya Apa?");
					command = scan.nextLine();
					if(command.equalsIgnoreCase("Bintang")) {
						System.out.println("Kamu Benar");
						System.out.println("Duit +50000");
						duit += duittr;
					}
					else if(command.equalsIgnoreCase("Perkalian")) {
						System.out.println("Sangat Tepat Sekali");
						System.out.println("Magic Star +1!");
						magicStar += 1;
					}
					else {
						System.out.println("Salah!");
					}
				}
				else if(tr == 2) {
					Thread.sleep(2000);
					System.out.println("llili");
					for(int i = 0;i<10;i++) {
						if(i == 0) {
							
						}
					}
				}
			}
			else if(data.equalsIgnoreCase("Magic Area") || data.equalsIgnoreCase("MagicArea")){
				System.out.println("Magic Area..");
				Thread.sleep(2000);
				System.out.println("1.Api");
				System.out.println("2.Air");
				System.out.println("3.Angin");
				data = scan.nextLine();
				if(data.equalsIgnoreCase("Api")) {
					if(api = true) {
						System.out.println("-Advance\n-Expert\n-Upgrade");
						data = scan.nextLine();
						if(data.equalsIgnoreCase("Advance") || data.equalsIgnoreCase("Adv")) {
							System.out.println("Training 1 Xp / Hunt 3 Xp");
							data = scan.nextLine();
							if(data.equalsIgnoreCase("tr") || data.equalsIgnoreCase("training")) {
								System.out.println("Training Started. . .");
								System.out.println("");
							}
							else if(data.equalsIgnoreCase("Hunt") || data.equalsIgnoreCase("h")) {
								System.out.println("Hunting. . .");
								time = 1 + ran.nextInt(6);
								time *= 1000;
								Thread.sleep(time);
								EnemyRandom = 1 + ran.nextInt(6);
								if(EnemyRandom >= 1 && EnemyRandom <= 3) {
									do {
										System.out.println("Kamu Bertemu musuh EZ");
										Thread.sleep(2000);
										System.out.println("kamu di serang");
										health -= EnemyAttackEasy;
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
											System.out.println("\ndarah kamu sekarang "+health+" -"+EnemyAttackEasy);
											Thread.sleep(2000);
										}
										System.out.println("Sekarang Giliran kamu yang menyerang");
										EnemyHealthEasy -= pow;
										Thread.sleep(2000);
										if(EnemyHealthEasy <= 0) {
											System.out.println("Musuh Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											reward1 = 1 + ran.nextInt(3);
											if(reward1 == 1) {
												System.out.println("--70Ribu");
												System.out.println("--40Pow");
												System.out.println("--20Kes");
												duit += 15000;
												pow += 30;
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
											System.out.println("Darah Musuh ="+EnemyHealthEasy+" -"+pow);
										}
									}while(true);
									
								}
								
								else if(EnemyRandom >= 4 && EnemyRandom <= 5){
									do {
										System.out.println("Kamu Bertemu Musuh Normal");
										Thread.sleep(2000);
										System.out.println("Kamu Di Serang!!");
										health -= EnemyAttackNormal;
										if(health <= 0) {
											System.out.println("Kamu Kalah :(");
											Thread.sleep(2000);
											if(protectedbool == false) {
												System.out.println("Kamu Pun Mati...");
												Thread.sleep(2000);
												System.out.println("Sorry..");
												Thread.sleep(1000);
												System.out.println("Game Di Tutup...");
												return;
											}
											else if(protectedbool == true) {
												System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
												duit = 0;
											}
										}
										else {
											System.out.println("\ndarah kamu sekarang "+health+" -"+EnemyAttackNormal);
											Thread.sleep(2000);
										}
										System.out.println("Giliran Kamu Coy Ayoo!");
										Thread.sleep(2000);
										System.out.println("Kamuu Menyerang");
										EnemyHealthNormal -= pow;
										if(EnemyHealthNormal <= 0) {
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
											System.out.println("Darah Musuh ="+EnemyHealthNormal+" -"+pow);
										}
									}while(true);
								}
								else {
									do {
										System.out.println("Kamu Bertemu Musuh Kuat!");
										Thread.sleep(2000);
										System.out.println("Kamu Di Serang!");
										health -= EnemyAttackStrong;
										Thread.sleep(2000);
										if(health <= 0) {
											System.out.println("Kamu Kalah :(");
											Thread.sleep(2000);
											if(protectedbool == false) {
												System.out.println("Kamu Pun Mati...");
												Thread.sleep(2000);
												System.out.println("Sorry..");
												Thread.sleep(1000);
												System.out.println("Game Di Tutup...");
												return;
											}
											else if(protectedbool == true) {
												System.out.println("Kamu Tak Jadi Mati tapi duit mu kereset ");
												duit = 0;
											}
										}
										else {
											System.out.println("\ndarah kamu sekarang "+health+" -"+EnemyAttackStrong+"!");
											Thread.sleep(2000);
										}
										System.out.println("Ini Waktunya Menyerang!");
										EnemyHealthStrong -= pow;
										Thread.sleep(2000);
										if(EnemyHealthStrong <= 0) {
											System.out.println("Musuh Normal Kalah Dan Kamu Menang Yey!!");
											System.out.println("===Result===");
											reward3 = 1 + ran.nextInt(3);
											if(reward3 == 1) {
												System.out.println("--30Ribu");
												System.out.println("--40Pow");
												System.out.println("--35Kes");
												duit += 30000;
												pow += 40;
												senang += 35;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(reward3 == 2) {
												System.out.println("--40Ribu");
												System.out.println("--45Pow");
												System.out.println("--40Kes");
												duit += 40000;
												pow += 45;
												senang += 40;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											}
											else if(reward3 == 3) {
												System.out.println("--50Ribu");
												System.out.println("--50Pow");
												System.out.println("--45Kes");
												duit += 50000;
												pow += 50;
												senang += 45;
												System.out.println("\nKamu Keren...\nKamu Kembali ke tempat asal");
												Thread.sleep(3000);
												break;
											
										   } 
									    }
										else {
											System.out.println("Darah Musuh ="+EnemyHealthStrong+" -"+pow);
										}
									}while(true);
									
								}
							}
						}
						else if(data.equalsIgnoreCase("Expert") || data.equalsIgnoreCase("Ex")) {
							System.out.println("Expert Game 5 Xp / Expert Hunt 8 Xp");
							data = scan.nextLine();
							if(data.equalsIgnoreCase("")) {
								
							}
							
						}
					}
					else if(api = false) {
						System.out.println("Kamu Tidak Memiliki Kekuatan Api");
					}
				}
				else if(data.equalsIgnoreCase("Air")) {
					if(air = true) {
						System.out.println("-Advance\n-Expert\n-Upgrade");
					}
					else if(air = false) {
						System.out.println("Kamu Tidak Memiliki Kekuatan Air");
					}
				}
				else if(data.equalsIgnoreCase("Angin")) {
					if(angin = true) {
						System.out.println("-Advance\n-Expert\n-Upgrade");
					}
					else if(angin = false) {
						System.out.println("Kamu Tidak Memiliki Kekuatan Angin");
					}
				}
			}
			else if(data.isEmpty()) {
				System.out.println("Kenapa Empty Boss?");
			}
			else {
				System.out.println("Command Tidak Ditemukan Ketik Help Untuk Mengetahui Command");
			}
		}while(true);
		
		System.out.println("You Win.This Is The Code. . . .");
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				System.out.println(". ");
				int y = 1 + ran.nextInt(3);
				Thread.sleep(y);
			}
		}
		System.out.println("For Int Index = 0");
		for(int i = 0;i < 5; i++) {
			System.out.println("");
			Thread.sleep(800);
			if(i == 50) {
				break;
			}
		}
	}

}
