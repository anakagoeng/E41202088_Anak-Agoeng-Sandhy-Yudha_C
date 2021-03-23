/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu03_tugas.tugas_no4;

import java.util.Scanner;

/**
 *
 * @author AGUNG
 */
public class nota_belanja {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pembeli;
        int barang[] = new int[5];
        int harga_barang, jumlah_total = 0;

        System.out.println("--------------------------------------------");
        System.out.println("        Kharisma Agung Plaza ( KAP )        ");
        System.out.println("          Promo Belanja Berhadiah           ");
        System.out.println("     Khusus Pembelian 5 Barang Pertama      ");
        System.out.println("     Dengan harga minimum Rp. 10000,00      ");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        pembeli = input.nextLine();
        System.out.println("");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            harga_barang = input.nextInt();
            barang[i - 1] = harga_barang;
            jumlah_total = jumlah_total + harga_barang;
        }
        System.out.println("Total harga pembelian atas nama " + pembeli + " adalah Rp. " + jumlah_total);
        System.out.println("");

        if (barang[0] >= 10000 || barang[1] >= 10000 || barang[2] >= 10000 || barang[3] >= 10000 || barang[4] >= 10000) {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            System.out.println("--------------------------------------------");
            System.out.println("                Terimakasih                 ");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
        } else {
            System.out.println("---------------------------------------------");
            System.out.println("                 Terimakasih                 ");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza  ");
        }
    }
}
