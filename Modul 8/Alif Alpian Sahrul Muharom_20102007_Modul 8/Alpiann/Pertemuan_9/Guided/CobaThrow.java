package main.java.com.Alpian.Pertemuan_9.Guided;
/**
 *
 * @author
 * Alif Alpian Sahrul Muharom
 * 20102007
 * IF-08-0
 */
public class CobaThrow {
    public static void methodLain() {
        try {
            throw new ArrayIndexOutOfBoundsException(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan exception "
                    + "dalam method methodLain()");
            throw e;
        }
    }
    
    public static void main(String[] args) {
        try {
            methodLain();
        } catch (Exception e) {
            System.out.println("Penanganan exception "
                    + "dalam method main()");
        }
    }
}
