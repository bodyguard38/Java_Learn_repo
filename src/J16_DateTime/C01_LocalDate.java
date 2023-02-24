package J16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        //LocalDate-> sadece gun-ay-yil datalarini tutar.
        LocalDate bugun= LocalDate.now();//mevcut tarih datasi bugun e aktarildi
        System.out.println(bugun);

        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println(bugun.getMonth());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());

        LocalDate date1=LocalDate.of(2016,3 ,23);
        LocalDate date2=LocalDate.of(2014, Month.MAY ,19);

        //tanimlanan bir date in oncesi minus() ve sonrasi plus() gitme
        System.out.println("date1.plusDays(45) = " + date1.plusDays(45));
        System.out.println("date2.minusDays(33) = " + date2.minusDays(33));

        System.out.println(bugun.plusDays(11).minusWeeks(7).plusMonths(3).minusYears(5));


    }
}
