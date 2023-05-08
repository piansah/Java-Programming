package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class TryCatch2 {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 10/x;
            int[] array = {10,11};
            y = array[x];
            System.out.println("Tidak terjadi Exception");
        } catch (ArithmeticException e) {
            System.out.println("Tidak dapat dibagi 0");
        }
        catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("Indeks di luar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
    }
}
