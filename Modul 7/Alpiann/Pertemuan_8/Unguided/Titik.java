package main.java.com.Alpian.Pertemuan_8.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Titik {
    double x, y;
    Titik t2;
    
    public Titik(){}
    
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double hitungJarak(Titik t2){
        double jarak = Math.sqrt(Math.pow(t2.x - this.x, 2) + Math.pow(t2.y - this.y, 2));
        return jarak;
    }
    
    public void tampil() {
        System.out.println("Titik x = " + x);
        System.out.println("Titik y = " + y);
    }
}
