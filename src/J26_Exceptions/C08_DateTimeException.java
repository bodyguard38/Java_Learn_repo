package J26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

        //datetime exception-> tarih zamanvalue lerde olusan RTE



        try {
            LocalDate d1= LocalDate.of(2020, 2, 29);
            System.out.println("Bu satiri okuduysan code exception firlatti");
        }catch (DateTimeException e) {
            System.out.println("Agam hatali giris yaptin"+e.getMessage());
            System.out.println("Bu satiri okuduysan code exception firlatti ama handle ettik");
        }


        System.out.println("Agam bu print okuduysan app basarildir");


    }
}
