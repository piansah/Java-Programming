package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class demoStream2 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        int panjang = 0;
        System.out.print("Masukkan data : ");
        try {
            panjang = System.in.read(data);
            System.out.print("yang anda ketik : ");
            System.out.write(data);
            System.out.print("Panjang karakter : " + panjang);
            System.out.print("\nindex ke -1 sebanyak 3 : ");
            System.out.write(data,1,3);
            System.out.print("\n");
            
        } catch (IOException e) {
            System.out.println("Terjadi exception");
        }
    }
}
