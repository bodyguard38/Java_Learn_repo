package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Vucut agirliginizi kg olarak giriniz : ");
        double kg = scan.nextInt();

        System.out.print("Lutfen boyunu cm olarak giriniz : ");
        double boy = scan.nextDouble();

        Double vke = (kg / (boy * boy))*10000;
        vke = Math.floor(vke);
        System.out.println("Vke endeksiniz  :"+vke);
    }
}
