package main.java.com.Alpian.Pertemuan_7.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public abstract class Employee {
    protected String nama, nip;
    protected long gajiPokok, komisi, gaji;

    public Employee(String nama, String nip, long gajiPokok, long komisi) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
    }
    
    public String nama() {
        return nama;
    }
    
    public String nip() {
        return nip;
    }
    
    public long gajiPokok() {
        return gajiPokok;
    }
    
    public long komisi() {
        return komisi;
    }
    
    public abstract long gaji();
}
