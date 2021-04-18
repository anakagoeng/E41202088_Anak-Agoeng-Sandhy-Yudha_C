/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu06_tugas;

import java.util.Scanner;

/**
 *
 * @author AGUNG
 */
public class BinarySearch {
     public static int[] data = {1,5,50,35,65,70,20};
	public static int awal, tengah, akhir, temp, count;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//	Menampilkan data sebelum di sorting
		System.out.print("\nData    : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
		System.out.println("  ");
                
		//	Proses sorting
		sorting();
		
		//	Menampilkan Data setelah di sorting
		System.out.println();
		System.out.print("Sorting : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
                System.out.println("  ");
                
		//	Input data yang dicari
		System.out.print("\nData yang dicari : ");		
		int cari = scan.nextInt();
		
		//	Proses Metode Pencarian Binary Searching
		System.out.println();
		boolean temu = false;
		awal = 0;
		akhir = data.length - 1;
		temp = 0;
		count = 0;
		int iterasi = 0;
		System.out.println("Iter  Awl  Ahir  Tngh  Nil");
		while(temu != true)
		{								
			tengah = (awal + akhir) / 2;
			iterasi++;
			
			//	value == cari
			if(data[tengah] == cari)
			{
				System.out.print(iterasi+"   ");
				System.out.print("  " + awal +"   ");
				System.out.print("  " + akhir  +"   ");
				System.out.print("  " + tengah +"   ");
				System.out.print(data[tengah]+"\n");
				temu = true;
					break;
			}
			
			//	value < cari
			else if(data[tengah] < cari)
			{
				System.out.print(iterasi+"   ");
				System.out.print("  " + awal +"   ");
				System.out.print("  " + akhir +"   ");
				System.out.print("  " + tengah +"   ");
				System.out.print(data[tengah]+"\n");
				awal = tengah + 1;
				
			}
				
			//	value > cari
			else if(data[tengah] > cari)
			{
				System.out.print(iterasi+"   ");
				System.out.print("  " + awal +"   ");
				System.out.print("  " + akhir +"   ");
				System.out.print("  " + tengah +"   ");
				System.out.print(data[tengah]+"\n");
				akhir = tengah - 1;
			}
			
			//	Cek Worst Case
			if(temp != data[tengah])
				temp = data[tengah];
			else
				count++;
			
			//	batasan untuk worst case
			if(count == 3)
				break;
		}
		
		//	Output
		if(temu == true)
			System.out.println("\nData "+cari+" ditemukan pada index ke-"+tengah+"\n"+
			"dan Iterasi ke-"+iterasi);
		
		else
			System.out.println("\nData "+cari+" tidak ditemukan");
			
	}
	
	//	Sorting Ascending
	public static void sorting()
	{
		int temp = 0;
		for(int x = 0; x < data.length; x++)
		{
			for(int y = 0; y < data.length; y++)
			{
				if(x == y)
					continue;
				
				else
				{
					if(data[x] < data[y])
					{
						temp = data[y];
						data[y] = data[x];
						data[x] = temp;
						
					}
				}
			}
		}
	}
}
