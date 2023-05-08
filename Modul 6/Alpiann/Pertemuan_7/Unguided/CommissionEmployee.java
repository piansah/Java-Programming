package main.java.com.Alpian.Pertemuan_7.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class CommissionEmployee extends Employee{
    private long totalPenjualan;

    public CommissionEmployee(long totalPenjualan, String nama, String nip, long gajiPokok, long komisi) {
        super(nama, nip, gajiPokok, komisi);
        this.totalPenjualan = totalPenjualan;
    }

    public long getTotalPenjualan() {
        return totalPenjualan;
    }
    
    @Override
    public long gaji() {
        return gaji = (gajiPokok + (komisi * totalPenjualan));
    }
    
    public void cetakCE(){
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Total Penjualan: " + totalPenjualan);
        System.out.println("Komisi: " + komisi);
        System.out.println("Gaji: " + gaji());
    }
}
