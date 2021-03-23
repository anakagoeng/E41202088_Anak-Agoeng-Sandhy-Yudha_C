/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu03_tugas.tugas_no2;

import java.util.Scanner;

/**
 *
 * @author AGUNG
 */
public class array_random {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array;
        System.out.print("Masukkan jumlah deretan array: ");
        array = input.nextInt();
        int[] array_random = new int[array];

        for (int i = 0; i < array; i++) {
            array_random[i] = (int) (Math.random() * 10);
        }
        for (int j = 0; j < array; j++) {
            System.out.print(array_random[j] + "   ");
        }
    }
}
