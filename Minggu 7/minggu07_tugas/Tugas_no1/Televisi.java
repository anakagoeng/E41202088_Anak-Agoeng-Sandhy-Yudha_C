/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu07_tugas.tugas_no1;

import java.util.Arrays;

/**
 *
 * @author AGUNG
 */
public class Televisi {

    private String name;
    private int maxChannel;
    private String[] channels;

    public Televisi() {
    }

    public Televisi(String name, int maxChannel) {
        this.name = name;
        this.maxChannel = maxChannel;

    }

    public String getDeskripsi() {
        return name;
    }

    public void setVolume(int volume) {
        System.out.println("Intensitas volume yang sekarang : " + volume);

    }

    public void setChannelAktif(int activeChannel) {
        if (activeChannel >= maxChannel) {
            System.out.println("Channel yang Anda inginkan belum diset! ");
        } else {
            System.out.printf("Pindah channel ke : %s\n", channels[activeChannel]);
        }
    }

    public void getChannels() {
        if (channels == null) {
            System.out.println("Belum ada Channel yang  diset! ");
        } else {
            System.out.println(Arrays.toString(channels));
        }
    }

    public void setChannels(String[] channels) {
        if (channels.length > maxChannel) {
            System.out.println("Maaf tv ini hanya dapat menyimpan channel " + maxChannel);
        } else {
            System.out.println("Informasi channel berhasil diupdate!");
            this.channels = channels;
        }
    }
}
