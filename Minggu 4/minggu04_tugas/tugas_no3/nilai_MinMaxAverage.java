/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu04_tugas.tugas_no3;

import java.util.Scanner;

/**
 *
 * @author AGUNG
 */
public class nilai_MinMaxAverage {

    public static void main(String[] args) {
        int banyak_data, nilai_data, average, jumlah_nilai = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak data nilai = ");
        banyak_data = input.nextInt();

        int[] nilai = new int[banyak_data];
        for (int i = 0; i <= banyak_data - 1; i++) {
            System.out.print("Masukkan data nilai ke-" + (i + 1) + " = ");
            nilai_data = input.nextInt();
            nilai[i] = nilai_data;
        }
        System.out.println("");

        int nilai_min = nilai[0];
        int nilai_max = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < nilai_min) {
                nilai_min = nilai[i];
            } else if (nilai[i] > nilai_max) {
                nilai_max = nilai[i];
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            jumlah_nilai = jumlah_nilai + nilai[i];
        }
        average = jumlah_nilai / nilai.length;

        System.out.println("Nilai minimum = " + nilai_min);
        System.out.println("Nilai maksimum = " + nilai_max);
        System.out.println("Nilai rata-ratanya = " + average);

    }
}
