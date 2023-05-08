package main.java.com.Alpian.Pertemuan_6.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Bus extends Mobil {
    int kapasitasPenumpang, kapasitasBagasi;

    public Bus(){

    }

    public Bus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi){
        super(noPlat, merk, pajak);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }

    public void infoBus() {
        System.out.println("Kapasitas Penumpang  : " + this.kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi     : " + this.kapasitasBagasi);
        System.out.println("Total Pajak          : Rp. " + hitungPajak());
    }

    @Override
    public void tampilInfo() {
        System.out.println("\nInfo Kendaraan:");
        super.tampilInfo();
        infoBus();
    }

    public float hitungPajak() {
        return (this.pajak + (this.pajak * this.kapasitasPenumpang * this.kapasitasBagasi * 0.00005f));
    }
}

