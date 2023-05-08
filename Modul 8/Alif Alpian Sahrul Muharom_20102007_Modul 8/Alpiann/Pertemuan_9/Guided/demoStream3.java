package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class demoStream3 {
    public static void main(String[] args) throws IOException {
        char data;
        String str = "";
        BufferedReader buff = new BufferedReader(new 
        InputStreamReader(System.in)); 
        
        System.out.println("Ketik: ");
        data = (char) buff.read();
        while (data != '\n') {
            str += data;
            data = (char) buff.read();
        }
        System.out.println("Yang diketik: " + str);
        System.out.println("Program Selesai");
    }
}
