/*
Nama: Alif Alpian SahruL Muharom
NIM : 20102007
*/
package main.java.com.Alpian.postTest;

/**
 *
 * @author Alif Alpian
 */
public class Titik {
    protected float x,y;
    
    public void setTitik(float x1, float y1) {
        this.x = x1;
        this.y = y1;
    }
    
    public void cetakTitik() {
        System.out.println("Titik\t: [" + x + "," + y + "]");
    }
}
