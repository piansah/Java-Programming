package main.java.com.Alpian.Pertemuan_7.Guided.Binatang;

import java.util.Random;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class CobaPolimorfisme {
    public static void main(String[] args) {
        Binatang[] peliharaanku = {
            new Burung("Hantu"),
            new Kucing("Persia"),
            new Anjing("Buldog"),
            new Kambing("Etawa")
        };
        
        Binatang kesayangan;
        Random pilihan = new Random();
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
        System.out.println("Binatang Kesayangan Ku : " + kesayangan);
        
        System.out.print("Suarannya : ");
        kesayangan.suara();
    }
}