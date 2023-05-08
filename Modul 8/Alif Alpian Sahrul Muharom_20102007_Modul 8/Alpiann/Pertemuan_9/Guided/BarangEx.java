package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class BarangEx implements Externalizable {
    private String nama;
    private int jumlah;
    
    public BarangEx() { }
    
    public BarangEx(String nm, int jml) {
        nama = nm;
        jumlah = jml;
    }
    
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(nama);
        out.writeInt(jumlah);
    }
    
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.nama = (String) in.readObject();
        this.jumlah = in.readInt();
    }
    
    public String toString() {
        return "data barang: " + nama + "\n" + "jumlah barang: " + jumlah;
    }
    
    public static void simpanObject(BarangEx brg) throws IOException {
        FileOutputStream fos = new FileOutputStream("dtEx.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(brg);
        oos.flush();
    }
    
    public static BarangEx bacaObject() 
            throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("dtEx.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        return (BarangEx) ois.readObject();
    }
    
    public static void main(String[] args) 
            throws ClassNotFoundException, IOException {
        BarangEx awal = new BarangEx("sepatu", 2);
        simpanObject(awal);
        System.out.println(bacaObject());
    }
}
