package main.java.com.Alpian.Pertemuan_7.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class SalariedEmployee extends Employee {
    private long upahMingguan;

    public SalariedEmployee(long upahMingguan, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.upahMingguan = upahMingguan;
    }

    public long getUpahMingguan() {
        return upahMingguan;
    }
    
    @Override
    public long gaji(){
        return gaji = upahMingguan;
    }
    
    public void cetakSE() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Upah Mingguan: " + gaji());
    }
}
