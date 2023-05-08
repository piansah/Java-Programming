package main.java.com.Alpian.Pertemuan_8.Guided.relasiAgregasi;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Pegawai {
    private String nama;
    private String NIP;
    
    public Pegawai(){
        System.out.println("Konstruktor pegawai dijalankan");
    }
    
    public Pegawai(String NIP, String nama){
        this.NIP = NIP;
        this.nama = nama;
        System.out.println("Konstruktor pegawai dijalankan");
    }
    
    public void tampilPegawai(){
        System.out.println("NIP : "+NIP+" , nama : "+nama);
    }
}
