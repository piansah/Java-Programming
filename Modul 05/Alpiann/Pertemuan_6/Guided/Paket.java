package main.java.com.Alpian.Pertemuan_6.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Paket extends Buku implements InterfaceCD {
    long hargaPaket;
    InterfaceCD interfaceCD;
    
    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) {
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
    }
    
    public void hitungHargaPaket() {
        hargaPaket = super.hargaBuku + getHargaCD();
    }
    
    @Override
    public void cetakCD() {
        interfaceCD.cetakCD();
    }
    
    @Override
    public long getHargaCD() {
        return interfaceCD.getHargaCD();
    }
    
    public void cetakPaket() {
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket Buku dan CD: Rp" + hargaPaket + "\n");
    }
}
