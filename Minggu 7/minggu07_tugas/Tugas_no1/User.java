/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu07_tugas.tugas_no1;

/**
 *
 * @author AGUNG
 */
public class User {

    public static void main(String[] args) {
        Televisi tv = new Televisi("TV Tempoe Doloe, 14 inches", 10);
        String[] semuaChannels = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS", "TPI", "TV 7",
            "TVRI", "TV G", "AN TV"};
        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS", "TPI", "TV 7"};
        System.out.println("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());

        tv.getChannels();
        tv.setChannels(semuaChannels);
        tv.setChannels(channelFavorit);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
}
