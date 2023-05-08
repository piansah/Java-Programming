package main.java.com.Alpian.Pertemuan_7.Guided.Binatang;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class Anjing extends Binatang{
    private String nama;

    public Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }
    
    public void suara(){
        System.out.println("Mengonggong");
    }
    
    public String toString(){
        return super.toString()+ "" +nama;
    }
    
}
