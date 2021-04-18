/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu06_tugas;

/**
 *
 * @author AGUNG
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array_data = {8, 5, 7, 1, 9, 3};
        int smallest;
        int temp;
        int n = array_data.length;

        System.out.println("Before using selection sort: ");
        for (int x : array_data) {
            System.out.print(x + " ");
        }
        System.out.println();

        //code for selection sort
        for (int i = 0; i < n - 1; i++) {
            smallest = i;
            for (int j = i + 1; j < n; j++) {
//                System.out.println("A: " + array_data[smallest] + " > " + "B: " + array_data[j]);
                if (array_data[j] < array_data[smallest]) {
                    smallest = j;
                }
            }
            temp = array_data[i];
            array_data[i] = array_data[smallest];
            array_data[smallest] = temp;
        }

        System.out.println("After using selection sort: ");
        for (int k : array_data) {
            System.out.print(k + " ");
        }
    }
}
