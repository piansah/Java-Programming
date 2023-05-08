package main.java.com.Alpian.Pertemuan_7.Guided.Binatang;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public abstract class Binatang {
    private String jenis;
    
    public Binatang(String jenis) {
        this.jenis=jenis;
    }
    
    protected abstract void suara();
    
    public String toString(){
        return "seekor" + jenis;
    }
}
