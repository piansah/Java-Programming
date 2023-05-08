/*
Nama: Alif Alpian SahruL Muharom
NIM : 20102007
*/
package main.java.com.Alpian.postTest;

/**
 *
 * @author Alif Alpian
 */
public class Main {
    public static void main(String[] args) {
        Titik point1= new Titik();
        point1.setTitik(3,5);
        point1.cetakTitik();
        System.out.println(" ");
        
        Lingkaran Lingkaran1= new Lingkaran();
        Lingkaran1.setLingkaran(3,5,5);
        Lingkaran1.cetakLingkaran();
        System.out.println(" ");
        
        TabungTanpaTutup TabungTT1= new TabungTanpaTutup();
        TabungTT1.setTabungTanpaTutup(3,5,5,5);
        TabungTT1.cetakTabungTanpaTutup();
        System.out.println(" ");
        
        Kerucut Kerucut1= new Kerucut();
        Kerucut1.setKerucut(3,5,5,5);
        Kerucut1.cetakKerucut();
        System.out.println(" ");
        
        Bola Bola1= new Bola();
        Bola1.setBola(3,5,5);
        Bola1.cetakBola();
    }
}
