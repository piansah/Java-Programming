package main.java.com.Alpian.Pertemuan_7.Guided.Ekspresi_Wajah;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Ekspresi {
    public static void main(String[] args) {
        System.out.println("DEMO POLIMORFISME"); 
        System.out.println("========================="); 
        
        EkspresiWajah objEkspresi = new EkspresiWajah(); 
        Gembira objGembira = new Gembira();
        Sedih objSedih = new Sedih();
        
        EkspresiWajah[] ekspresi = new EkspresiWajah[3]; 
        ekspresi[0] = objEkspresi;
        ekspresi[1] = objGembira;
        ekspresi[2] = objSedih; 
        
        System.out.println("Ekspresi[0]:" + ekspresi[0].respons()); 
        System.out.println("Ekspresi[1]:" + ekspresi[1].respons()); 
        System.out.println("Ekspresi[2]:" + ekspresi[2].respons());
    }
}
