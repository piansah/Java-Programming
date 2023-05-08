package main.java.com.Alpian.Pertemuan_6.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Buku {
    String judul, pengarang;
    long hargaBuku;

    public Buku(String judul, String pengarang, long hargaBuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }
    
    public void cetakBuku() {
        System.out.println("\nJudul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga Buku: Rp" + hargaBuku);
        System.out.println();
    }
}
