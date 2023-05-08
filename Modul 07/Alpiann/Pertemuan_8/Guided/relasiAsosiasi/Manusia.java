package main.java.com.Alpian.Pertemuan_8.Guided.relasiAsosiasi;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Manusia {
    private String nama;
    private int umur;
    private Manusia ibu;
    private Manusia anak;
    
    public Manusia(){ }
    
    public Manusia(String nm, int umr){
        nama = nm;
        umur = umr;
        ibu = new Manusia();
        anak = new Manusia();
        
        ibu = null;
        anak = null;
    }
    
    public Manusia(String nm, int umr, Manusia ibu_angkat){
        nama = nm;
        umur = umr;
        ibu = new Manusia();
        anak = new Manusia();
        ibu = ibu_angkat;
        ibu_angkat.anak = this;
    }
    
    public void adopsi(Manusia anak_angkat){
        anak = anak_angkat;
        anak_angkat.ibu = this;
    }
    
    public void cetak(){
        System.out.println("\n- Data Pribadi -");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        
        if (ibu!=null) {
            System.out.println("Nama ibu : " + ibu.nama);
        } else if (anak!=null) {
            System.out.println("Nama anak : " + anak.nama);
        }
    }
}
