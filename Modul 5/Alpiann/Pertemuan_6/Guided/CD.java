package main.java.com.Alpian.Pertemuan_6.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class CD {
    String ukuran;
    long hargaCD;

    public CD(String ukuran, long hargaCD) {
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }

    public long getHargaCD() {
        return hargaCD;
    }

    public void cetakCD() {
        System.out.println("Ukuran CD : "+ukuran);
        System.out.println("Harga CD : Rp "+hargaCD);
        System.out.println();
    }
}

