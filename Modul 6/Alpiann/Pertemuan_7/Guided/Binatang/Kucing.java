package main.java.com.Alpian.Pertemuan_7.Guided.Binatang;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Kucing extends Binatang{
    private String nama;

    public Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }
    
    public void suara(){
        System.out.println("Mengeong");
    }
    
    public String toString(){
        return super.toString()+ "" +nama;
    }
    
}
