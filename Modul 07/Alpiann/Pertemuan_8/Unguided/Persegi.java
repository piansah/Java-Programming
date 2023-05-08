package main.java.com.Alpian.Pertemuan_8.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Persegi extends Titik{
    public double sisiPSG;
    
    public Persegi(double x1, double y1, double x2, double y2){
        super.x = x1; 
        super.y = y1;
        t2 = new Titik (x2, y2);
    }
    public double hitungLuas(){
        sisiPSG = super.hitungJarak(t2);
        double Luas = sisiPSG * sisiPSG;
        return Luas;
    }
    public void tampil(){
        System.out.println("== DATA Persegi ==");
        System.out.println("Point         : [" + super.x + ", " + super.y + "]");
        System.out.println("Sisi Segitiga : " + sisiPSG);
        System.out.println("Luas Segitiga : " + hitungLuas());
        System.out.println("");
    }
}