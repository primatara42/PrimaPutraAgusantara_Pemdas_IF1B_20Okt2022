package primaputraagusantara;

import java.util.Scanner;

public class Tugas10_PrimaPutraAgusantara 
{
	public static void main(String[] args) 
	{
		//INPUT
		Scanner input = new Scanner(System.in);
		String namaPembeli = null;
		char kodeSusu, kodeUkuran;
		int jumlahBeli;
		
		//OUTPUT
		String merkSusu = null, jenisUkuran = null;
		double harga = 0, jumlahPembayaran = 0, potongan, pajak, totalHarga;
		
		
		//TAMPILAN INPUT
		System.out.print("Masukkan Nama Pembeli \t\t: ");
		namaPembeli = input.nextLine();
		
		System.out.print("Masukkan Kode Susu [1/2/3] \t: ");
		kodeSusu = input.nextLine().charAt(0);
		
		System.out.print("Masukkan Kode Ukuran [S/M/L] \t: ");
		kodeUkuran = input.nextLine().charAt(0);
		
		System.out.print("Masukkan Jumlah Beli \t\t: ");
		jumlahBeli = input.nextInt();
		
		//PROSES
		if(kodeSusu == '1') //SUSU INDOMILK
		{
			merkSusu = "Indomilk";
			if(kodeUkuran == 'S')
			{
				jenisUkuran = "Small";
				harga = 5000;
			}
			
			else if(kodeUkuran == 'M')
			{
				jenisUkuran = "Medium";
				harga = 7500;
			}
			
			else if(kodeUkuran == 'L')
			{
				jenisUkuran = "Large";
				harga = 9500;
			}
		}
		
		else if(kodeSusu == '2') //SUSU DANCOW
		{
			merkSusu = "Dancow";
			if(kodeUkuran == 'S')
			{
				jenisUkuran = "Small";
				harga = 4500;
			}
			
			else if(kodeUkuran == 'M')
			{
				jenisUkuran = "Medium";
				harga = 6500;
			}
			
			else if(kodeUkuran == 'L')
			{
				jenisUkuran = "Large";
				harga = 8500;
			}
		}
		
		else if(kodeSusu == '3') //SUSU SUSTAGEN
		{
			merkSusu = "Sustagen";
			if(kodeUkuran == 'S')
			{
				jenisUkuran = "Small";
				harga = 9500;
			}
			
			else if(kodeUkuran == 'M')
			{
				jenisUkuran = "Medium";
				harga = 15500;
			}
			
			else if(kodeUkuran == 'L')
			{
				jenisUkuran = "Large";
				harga = 19500;
			}	
		}
		
		jumlahPembayaran = harga*jumlahBeli;
		
		
		if(jumlahBeli > 25)
		{
			potongan = jumlahPembayaran * 0.05;
		}
		
		else
		{
			potongan = jumlahPembayaran * 0;
		}
		
		pajak = jumlahPembayaran * 0.1;
		totalHarga = jumlahPembayaran - potongan + pajak;
		
		//OUTPUT
		System.out.println("\n\n\t\t STRUK PEMBAYARAN");
		System.out.println("Nama Pembeli \t\t: " + namaPembeli);
		System.out.println("Merk Barang \t\t: " + merkSusu);
		System.out.println("Jenis Ukuran \t\t: " + jenisUkuran);
		System.out.println("Jumlah Beli \t\t: " + jumlahBeli);
		System.out.println("Harga Barang \t\t: Rp." + harga);
		System.out.println("Jumlah Pembayaran \t: Rp." + jumlahPembayaran);
		System.out.println("Potongan \t\t: Rp." + potongan);
		System.out.println("Pajak \t\t\t: Rp." + pajak);
		System.out.println("Total Pembayaran \t: Rp." + totalHarga);
		
		
		
		
		
}
}

