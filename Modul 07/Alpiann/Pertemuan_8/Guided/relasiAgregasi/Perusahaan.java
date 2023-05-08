package main.java.com.Alpian.Pertemuan_8.Guided.relasiAgregasi;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Perusahaan {
    private String namaPerusahaan;
    private Pegawai Pegawai[];
    private int counter;
    
    public Perusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
        counter=0;
        Pegawai = new Pegawai[3];
    }
    
    public void insertPegawai(Pegawai p){
        Pegawai[counter]=p;
        counter++;
    }
    
    public void tampilPerusahaan(){
        System.out.println("Perusahaan "+ namaPerusahaan + "\nMemiliki pegawai : ");
        for (int i = 0; i < counter; i++) {
            Pegawai[i].tampilPegawai();
        }
        
    }
}
