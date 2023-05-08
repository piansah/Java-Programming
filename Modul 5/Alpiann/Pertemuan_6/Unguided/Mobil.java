package main.java.com.Alpian.Pertemuan_6.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Mobil {
    String noPlat;
    String merk;
    float pajak;

    public Mobil(){

    }

    public Mobil(String noPlat, String merk, float pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }

    public void tampilInfo() {
        System.out.println("Nomor PLat           : " + this.noPlat);      
        System.out.println("Merk Mobil           : " + this.merk);
        System.out.println("Pajak                : Rp. " + this.pajak);
    }
}
