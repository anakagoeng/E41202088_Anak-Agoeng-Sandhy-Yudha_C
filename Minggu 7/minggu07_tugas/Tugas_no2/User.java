/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu07_tugas.tugas_no2;

/**
 *
 * @author AGUNG
 */
public class User {

    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inches", 100);
        String[] semuaChannels = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS", "TPI", "TV 7",
            "TVRI", "TV G", "AN TV"};

        System.out.println("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());

        tv.getChannels();
        tv.setChannels(semuaChannels);
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.tv);
        tv.playCD();
        tv.setDistray("The Matrix");
        tv.playCD();
    }
}
