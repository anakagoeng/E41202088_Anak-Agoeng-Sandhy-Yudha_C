/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu04_tugas.tugas_no1;

import java.util.Scanner;

/**
 *
 * @author AGUNG
 */
public class urutan_bilanganGenap_ascending {

    public static void main(String[] args) {
        int bilangan_awal, bilangan_akhir;
        Scanner input = new Scanner(System.in);

        System.out.println("Menentukan Urutan Bilangan Genap");
        System.out.println("------------------------------------");
        System.out.print("Masukkan batas awal bilangan :");
        bilangan_awal = input.nextInt();
        System.out.print("Masukkan batas akhir bilangan :");
        bilangan_akhir = input.nextInt();

        for (int i = bilangan_awal; bilangan_awal <= bilangan_akhir; bilangan_awal++) {
            if (bilangan_awal % 2 == 0) {
                System.out.print(bilangan_awal + " ");
            }
        }
    }
}
