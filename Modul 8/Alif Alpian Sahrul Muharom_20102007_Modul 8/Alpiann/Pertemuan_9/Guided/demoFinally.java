package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class demoFinally {
    public static void main(String[] args) {
        int x = 3;
        int[] array = {10, 11, 12};
        try {
            System.out.println(array[x]);
            System.out.println("Tidak terjadi kesalahan exeption");
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
            System.out.println("Terjadi exeption");
            //System.out.println(array[x-4]);
        }
        finally{
            // finally berarti baris ini akan tetap dijalankan meskipun 
            //terjadi kesalahan atau tidak terjadi kesalahan.
            System.out.println("Program selesai dijalankan");
        }
    }
}
