package main.java.com.Alpian.Pertemuan_7.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class ProjectPlanner extends Employee{
    private long totalHasilProyek, pajak;

    public ProjectPlanner(long totalHasilProyek, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.totalHasilProyek = totalHasilProyek;
    }

    public long getTotalHasilProyek() {
        return totalHasilProyek;
    }
    
    public long pajak() {
        return pajak = gajiPokok * 5/100;
    }
    
    @Override
    public long gaji() {
        return gaji = gajiPokok + (komisi * totalHasilProyek) - pajak();
    }
    
    public void cetakPP() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total Hasil Proyek: " + totalHasilProyek);
        System.out.println("Gaji: " + gaji());
    }
}
