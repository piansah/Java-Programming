package main.java.com.Alpian.Pertemuan_7.Guided.Binatang;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Burung extends Binatang{
    private String nama;

    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }
    
    protected void suara() {
        System.out.println("Berkicau");
    }
    
    public String toString(){
        return super.toString() + "" +nama;
    }
}
