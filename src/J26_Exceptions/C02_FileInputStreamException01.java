package J26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis;
        try {
            fis = new FileInputStream("C:\\Users\\ahmet\\JavaLearn\\src\\J26_Exceptions\\ebik");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int k;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        System.out.println("\nAgam kode guzel calisti dewammkee");
    }//main sonu
}//class sonu
