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
        int i = 1;
        int j = 2;
        
        System.out.println("         Do__While          ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        do {
            System.out.print(i + "   ");
            i = i * 2;
            i *= 2;
        } while (i <= 100);
        System.out.println("");
        System.out.println("Perkalian 2 tiap bilangan (1-100)");
        System.out.println("============================");
        
        do {
            System.out.print(j + "   ");
            j += 2;
        } while (j <= 100);
        System.out.print("");
        
    }
}
