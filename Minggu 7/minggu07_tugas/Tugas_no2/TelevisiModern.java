/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu07_tugas.tugas_no2;

import minggu07_tugas.tugas_no1.Televisi;

/**
 *
 * @author AGUNG
 */
public class TelevisiModern extends Televisi {

    static final String TELETEXT = "Teletext";
    static final String tv = "Televisi";

    private String modusTampilan;
    private String cdPlay;
    private String discTray;

    TelevisiModern(String deskripsi, int maxChannel) {
        super(deskripsi, maxChannel);
    }

    public void setModusTampilan(String modusTampilan) {
        System.out.println("Modus Tampilan : " + modusTampilan);
        this.modusTampilan = modusTampilan;
    }

    public void setHalamanTeletext(int halamanTeletext) {
        System.out.println("Berpindah ke Halaman Teletext " + halamanTeletext);
    }

    public void playCD() {
        if (discTray == null) {
            System.out.println("Tidak ada CD di dalam disctray!");
        } else {
            System.out.println("Memutar Film  " + discTray);
        }
    }

    public void setDistray(String discTray) {
        this.discTray = discTray;
    }
}
