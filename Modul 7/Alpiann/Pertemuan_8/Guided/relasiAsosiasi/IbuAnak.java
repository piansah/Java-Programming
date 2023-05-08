package main.java.com.Alpian.Pertemuan_8.Guided.relasiAsosiasi;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class IbuAnak {
    public static void main(String[] args) {
        Manusia ibu1 = new Manusia("Linda",18);
        Manusia anak1 = new Manusia("Cece", 20);
        
        Manusia ibu2 = new Manusia("Diana", 40);
        Manusia anak2 = new Manusia("Khoiron",17, ibu2);
        
        System.out.println("=============================\n");
        ibu1.cetak();
        anak1.cetak();
        
        System.out.println("==============================\n");
        ibu1.adopsi(anak1);
        ibu1.cetak();
        anak1.cetak();
        
        System.out.println("===============================\n");
        ibu2.cetak();
        anak2.cetak();
        
    }
}
