package main.java.com.Alpian.Pertemuan_8.Guided.relasiAgregasi;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Relasi {
    public static void main(String[] args) {
        Perusahaan Per = new Perusahaan("Stark Industries");
        Pegawai pegawai1,pegawai2,pegawai3;
        
        pegawai1 = new Pegawai("A001","Nazar");
        pegawai2 = new Pegawai("A002","Zayyan");
        pegawai3 = new Pegawai("A003","Farhan");
        
        Per.insertPegawai(pegawai1);
        Per.insertPegawai(pegawai2);
        Per.insertPegawai(pegawai3);
        
        System.out.println("");
        
        Per.tampilPerusahaan();
    }
}
