/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu03_tugas.tugas_no5;

import java.util.Scanner;

/**
 *
 * @author AGUNG
 */
public class switchcase_menucafe {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String pembeli;
        int pilihan;
        String[] special_menu = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};

        System.out.println("      CAFE CERIA");
        System.out.println("    ANEKA MINUMAN");
        System.out.println("----------------------");
        System.out.println("    SPECIAL MENU :");
        for (int i = 0; i < special_menu.length; i++) {
            System.out.println("   " + (i + 1) + ". " + special_menu[i]);
        }
        System.out.println("----------------------");
        System.out.print("Masukkan nama pembeli : ");
        pembeli = input.nextLine();

        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah " + special_menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah " + special_menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah " + special_menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah " + special_menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah " + special_menu[pilihan - 1]);
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria");
                break;
            default:
                System.out.println("Masukkan pilihan berupa nomor pada menu!");
                System.out.println("Harap pilih kembali !");
                break;
        }
    }
}
