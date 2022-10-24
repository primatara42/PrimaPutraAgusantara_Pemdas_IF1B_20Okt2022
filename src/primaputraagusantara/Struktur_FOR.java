package primaputraagusantara;

import java.util.Scanner;

public class Struktur_FOR 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int jumlah;
		System.out.print("Massukan Input N : ");
		jumlah = input.nextInt();
		
		
		for(int i = 1; i <= jumlah; i++)
		{
			for(int j = 1; j<= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
