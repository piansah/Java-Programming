/*
Nama: Alif Alpian SahruL Muharom
NIM : 20102007
*/
package main.java.com.Alpian.postTest;

/**
 *
 * @author Alif Alpian
 */
public class Kerucut extends Lingkaran{
    private float tinggiKerucut;
    
    public void setKerucut (float x1, float y1, float jari2, float tinggi) {
        this.x = x1;
        this.y = y1;
        this.panjang = jari2;
        this.tinggiKerucut = tinggi;
    }
    
    public double sisiMiring() {
        return Math.sqrt((tinggiKerucut * tinggiKerucut) 
                + (panjang * panjang));
    }
    
    public float volumeKerucut() {
        return 0.33f * luasLingkaran() * tinggiKerucut;
    }
    
    public float luasKerucut() {
        return luasLingkaran() + (3.14f * panjang * (float)sisiMiring());
    }
    
    public void cetakKerucut() {
        cetakLingkaran();
        System.out.println("Sisi Miring Kerucut: " + sisiMiring());
        System.out.println("Volume Kerucut: " + volumeKerucut());
        System.out.println("Luas Kerucut: " + luasKerucut());
    }
}
