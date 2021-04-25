/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author AGUNG
 */
public class B extends A{

    int z;

    void TampilkanJumlah() {
        //subclass mengakses member dari superclass
        System.out.println("Jumlah : " + (x + y + z));
    }
}
