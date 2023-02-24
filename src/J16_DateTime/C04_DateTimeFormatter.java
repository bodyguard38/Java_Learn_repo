package J16_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH-MM-SS");

        System.out.println("dtf.format(ldt) = " + dtf1.format(ldt));
        System.out.println("dtf2.format(ldt) = " + dtf2.format(ldt));

    }
}
