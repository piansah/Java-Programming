package main.java.com.Alpian.Pertemuan_6.Unguided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil("DD 1909 EA", "Avanza", 10000);
        Bus b = new Bus("R 123 A", "Toyota", 5000, 4, 7);
        Sedan s = new Sedan("R 456 B", "Honda Jazz", 3000, "Anti air", "Full AC", 6);
        MiniBus mb = new MiniBus("R 789 C", "Pajero", 15000, 9, 10, "Wagon", "Anti Air dan Api", "Full AC Full Senyum", 9);
        
        m.tampilInfo();

        b.tampilInfo();
        b.hitungPajak();

        s.tampilInfo();

        mb.tampilInfo();

    }
}
