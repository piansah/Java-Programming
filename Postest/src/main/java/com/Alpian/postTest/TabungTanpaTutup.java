/*
Nama: Alif Alpian SahruL Muharom
NIM : 20102007
*/
package main.java.com.Alpian.postTest;

/**
 *
 * @author Alif Alpian
 */
public class TabungTanpaTutup extends Lingkaran{
    private float tinggiTabung;
    
    public void setTabungTanpaTutup(float x1, float y1, float 
            jari2, float tinggi) {
        this.x = x1;
        this.y = y1;
        this.panjang = jari2;
        this.tinggiTabung = tinggi;
    }
    
    public float volumeTabungTanpaTutup() {
        return luasLingkaran() * tinggiTabung;
    }
    
    public float luasTabungTanpaTutup() {
        return luasLingkaran() + (kelilingLingkaran() + tinggiTabung);
    }
    
    public void cetakTabungTanpaTutup() {
        cetakLingkaran();
        System.out.println("Volume Tabung Tanpa Tutup: " 
                + volumeTabungTanpaTutup());
        System.out.println("Luas Tabung Tanpa Tutup: " 
                + luasTabungTanpaTutup());
    }
}
