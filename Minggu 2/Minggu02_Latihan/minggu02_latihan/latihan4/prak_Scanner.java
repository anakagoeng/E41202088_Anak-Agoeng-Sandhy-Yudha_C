/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu02_latihan.latihan4;

import java.util.Scanner;
/**
 *
 * @author AGUNG
 */
public class prak_Scanner {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int nilai_mtk, nilai_ipa, jumlah;
        
        System.out.print("Masukkan nilai mtk : ");
        nilai_mtk = input.nextInt();
        System.out.print("Masukkan nilai ipa : ");
        nilai_ipa = input.nextInt();
        
        System.out.print("Jumlah = "+ (nilai_mtk + nilai_ipa));
    }
}
