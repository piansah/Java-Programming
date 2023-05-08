package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
class BarangSer implements Serializable {
    private String nama;
    private int jumlah;

    public BarangSer(String nm, int jmlh){
        nama = nm;
        jmlh = jumlah;
    }

    public void tampil(){
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jumlah Barang : " + jumlah);
    }
    
    public void simpanObject(BarangSer ob){
        try {
            FileOutputStream fos = new FileOutputStream("dataBarang.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ob);
            oos.flush();
        } catch (IOException ioe) {
            System.out.println("Error"+ioe);
        }
    }
    
    public void bacaObject(BarangSer obb){
        try {
            FileInputStream fis = new FileInputStream("dataBarang.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while ((obb = (BarangSer)ois.readObject())!=null) {
                obb.tampil();
            }
        } catch (IOException ioe) {
            System.exit(1);
        } catch (Exception e){
            System.exit(1);
        }
    }
    
    public static void main(String[] args) {
        BarangSer a1 = new BarangSer("Motor", 5);
        a1.simpanObject(a1);
        a1.bacaObject(a1);
    }
}
