/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu04_tugas.tugas_no2;

/**
 *
 * @author AGUNG
 */
public class do_while {
    public static void main(String[] args){
        int angka = 1;

        System.out.println("         Do__While          ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        do {
            angka = angka * 2;
            if (angka > 100){
                break;
            }
            System.out.print(angka + "   ");
        } while (angka < 100);
        System.out.println("");
    }
}
