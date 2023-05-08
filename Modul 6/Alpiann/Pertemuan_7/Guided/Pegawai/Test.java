package main.java.com.Alpian.Pertemuan_7.Guided.Pegawai;

import java.text.DecimalFormat;

/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Test {
    public static void main(String[] args) {
        Direktur d = new Direktur("Wahyu", 12_000_000.00, 7_500_000.00);
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        /*Objek referensi dari kelas abstrak pegawai (pgw) merefer objek
        dari kelas Direktur (d) yang diturunkan dari kelas abstrak Pegawai
        */
        System.out.println("\nDEMO INHERITANCE, ENCAPSULATION, POLYMORPHISM");
        System.out.println("----------------------------------------------\n");
        
        // Mencetak informasi Direktur ke console
        System.out.println("Nama    : " + d.nama() + "\n" 
                + "Jabatan  : " + d.jabatan() + "\n" 
                + "Gaji : " + digitPresisi.format(d.gajiPerBulan()) + "\n" 
                + "Dividen  : " + digitPresisi.format(d.labDividen()) + "\n"
                + "Total    : " + digitPresisi.format(d.income()) + "\n");
        System.exit(0);
    }
}
