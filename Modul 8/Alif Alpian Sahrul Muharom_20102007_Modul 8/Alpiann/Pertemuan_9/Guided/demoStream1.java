package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class demoStream1 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        System.out.print("Masukkan data : ");
        try {
            System.in.read(data);
        } catch (IOException e) {
            System.out.println("Terjadi Exception");
        }
        System.out.print("yang anda ketik adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]);
        }
    }
}