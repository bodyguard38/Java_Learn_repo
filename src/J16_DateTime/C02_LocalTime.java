package J16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        //LocalTime -> saat-dakika-saniye datalarini tutar.
        LocalTime nu = LocalTime.now();
        System.out.println("nu  :"+nu);

        System.out.println("nu.getHour() = " + nu.getHour());
        System.out.println("nu.getMinute() = " + nu.getMinute());
        System.out.println("nu.getSecond() = " + nu.getSecond());
        System.out.println("nu.getNano() = " + nu.getNano());

        //Tanimlanan bit time in oncesi minus() sonrasi plus() gitmek için.

        LocalTime time1=LocalTime.of(17,23,53);
        System.out.println(time1.plusHours(3));

        LocalTime loopBasi=LocalTime.now();
       int sayi=0;
        for (int i = 0; i <1000 ; i++) {
            sayi+=i;
        }

        LocalTime loopSonu=LocalTime.now();
        System.out.println("loopSonu = " + loopSonu);
        System.out.println("loopBasi = " + loopBasi);
        System.out.println("loop calisma suresi = " + (loopSonu.getSecond() - loopBasi.getSecond()));
    }
}
