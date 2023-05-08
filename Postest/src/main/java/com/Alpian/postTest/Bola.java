/*
Nama: Alif Alpian SahruL Muharom
NIM : 20102007
*/
package main.java.com.Alpian.postTest;

/**
 *
 * @author Alif Alpian
 */
public class Bola extends Lingkaran{
    public void setBola(float x1,float y1,float jari2) {
        this.x = x1;
        this.y = y1;
        this.panjang = jari2;
    }
    
    public float volumeBola() {
        return (4 * (3.14f * panjang * panjang * panjang)/3);
    }
    
    public float luasBola() {
        return (4 * (3.14f * panjang * panjang) /3);
    }
    
    public void cetakBola() {
        cetakLingkaran();
        System.out.println("Volume Bola: " + volumeBola());
        System.out.println("Luas Bola: " + luasBola());
    }
}
