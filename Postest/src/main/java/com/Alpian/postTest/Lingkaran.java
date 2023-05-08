/*
Nama: Alif Alpian SahruL Muharom
NIM : 20102007
*/
package main.java.com.Alpian.postTest;

/**
 *
 * @author Alif Alpian
 */
public class Lingkaran extends Titik{
    protected float panjang;
    
    public void setLingkaran(float x1, float y1, float jari2) {
        this.x = x1;
        this.y = y1;
        this.panjang = jari2;
    }
    
    public float luasLingkaran() {
        return 3.14f * panjang * panjang;
    }
    
    public float kelilingLingkaran() {
        return 4 * 3.14f * panjang;
    }
    
    public void cetakLingkaran() {
        cetakTitik();
        System.out.println("Luas Lingkaran: " + luasLingkaran());
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran());
    }
}
