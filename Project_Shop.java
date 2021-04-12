package cui;

import java.util.Scanner;

public class Project_Shop {

	public static void main(String[] args) throws Exception{
		
		
		Scanner scan = new Scanner(System.in);
		
		int saldo = 0;
		int t = 1;
		int bakso,tahu,keju;
		do {
			bakso = 20000;
			tahu = 15000;
			keju = 10000;
			System.out.println("-BARANG YANG DI JUAL-\n");
			Thread.sleep(500);
			System.out.println("----BAKSO  - RP.20.000");
			System.out.println("----TAHU   - Rp.15.000");
			System.out.println("----KEJU   - RP.10.000");
			Thread.sleep(2000);
			System.out.println("\n====Saldo  = Rp."+saldo);
			Thread.sleep(500);
			System.out.println("\n\n__Command__\n\n");
			Thread.sleep(500);
			System.out.println("-Bakso = b");
			System.out.println("-Tahu  = t");
			System.out.println("-Keju  = k");
			System.out.println("-saldo = s");
			Thread.sleep(500);
			String x = scan.nextLine().toLowerCase();
			if(x.equals("b")) {
				if(saldo < bakso) {
					System.out.println("Maaf saldo anda tidak cukup.");
				}
				else {
					System.out.println("Kamu Membeli Bakso...");
					saldo -= bakso;
					System.out.println("Saldo anda sekarang = "+saldo);
					Thread.sleep(2000);
					System.out.println("Terimakasih~~");
				}
			}
			else if(x.equals("t")) {
				if(saldo < tahu) {
					System.out.println("Maaf saldo anda tidak cukup.");
				}
				else {
					System.out.println("Kamu Membeli Tahu...");
					saldo -= tahu;
					Thread.sleep(2000);
					System.out.println("Saldo anda sekarang = "+saldo);
					Thread.sleep(2000);
					System.out.println("Terimakasih~~");
				}
			}
			else if(x.equals("k")) {
				if(saldo < keju) {
					System.out.println("Maaf saldo anda tidak cukup.");
				}
				else {
					System.out.println("Kamu Membeli Keju...");
					saldo -= keju;
					Thread.sleep(2000);
					System.out.println("Saldo anda sekarang = "+saldo);
					Thread.sleep(2000);
					System.out.println("Terimakasih~~");
				}
			}
			else if(x.equals("s")) {
				System.out.println("Saldo Kamu Sekarang = "+saldo);
				Thread.sleep(2000);
				System.out.print("\nMau Ngisi Saldo Sekarang?y/n ");
				Thread.sleep(2000);
				String data = scan.nextLine();
				if(data.equals("y")) {
					int loop1 = 1;
					do {
						
						int loop2 = 0;
						do {
							System.out.println("Masukan Saldo.");
							long y = scan.nextInt();
							saldo += y;
							System.out.println("\nSaldo sekarang = "+saldo);
							Thread.sleep(2000);
							int loop3 = 0;
							do {
								System.out.print("Mau lagi? ");
								String mau = scan.nextLine();
								if(mau.equals("y")) {
									break;
								}
								else if(mau.equals("n")) {
									System.out.println("Oke.");
									loop2 = 2;
									break;
								}
								
							}while(loop3 == 0);
						}while(loop2 == 0);
						
						loop1 = 2;
					}while(loop1 == 1);
					
				}
				else if(data.equals("n")) {
					System.out.println("oke");
				}			
			}
			if(x.equals("s")) {
				
				System.out.print("Mau belanja sekarang?y/n");
				String u = scan.nextLine();
				if(u.equals("y")) {
					continue;
				}
				else if(u.equals("n")) {
					System.out.println("Yakin?(saldo yang anda masukan akan hilang)y/n");
					String h = scan.nextLine();
					if(h.equals("y")) {
						System.out.println("\nOke.");
						return;
					}
					else if(h.equals("n")) {
						System.out.println("\nOke");
						continue;
					}
				}
				
			}
			System.out.print("\nKamu Mau Beli Lagi?y/n  ");
			String k = scan.nextLine().toLowerCase();
			if(k.equals("n")) {
				System.out.println("Terimakasih Sudah Berkunjung");
				break;
			}
			else {
				System.out.println("\n");
			}
			
		}while(t == 1);
		
	}

}
