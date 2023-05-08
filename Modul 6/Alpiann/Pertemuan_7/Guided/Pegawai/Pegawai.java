package main.java.com.Alpian.Pertemuan_7.Guided.Pegawai;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public abstract class Pegawai {
    private String namaPeg;
    
    // konstruktor
    public Pegawai(String namaPeg) {
        this.namaPeg = namaPeg;
    }
    
    // method (get) untuk mengembalikan nama pegawai
    public String getNamaPeg() {
        return namaPeg;
    }
    
    // Method abstract ini diwariskan ke semua kelas yang
    // diturunkan dari kelas abstrak ini
    public abstract double income();
    // fungsi abstract, hanya deklarasi, tanpa implementasi
}
