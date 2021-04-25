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
public class Demo {

    public static void main(String[] args) {
        A superclass = new A();
        B subB = new B();

        System.out.println("SuperClass");
        subB.x = 15;
        subB.y = 25;
        subB.TampilkanNilaiXY();

        System.out.println("SubClass");
        subB.x = 20;
        subB.y = 30;
        subB.TampilkanNilaiXY();

        //member tambahan yg hanya ada pada subclass
        subB.z = 45;
        subB.TampilkanJumlah();
    }
}
