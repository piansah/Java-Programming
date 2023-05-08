package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class TryCatch1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            System.out.println(array[11]);
            System.out.println("Ini adalah baris "
                    + "yang akan dijalankan exception");
        } catch (Exception e) {
            System.out.println("Terjadi sebuah array "
                    + "index out of bound");
        }
        System.out.println("Keluar dari catch");
    }
}
