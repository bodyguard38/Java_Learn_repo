package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
         Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz:");
        String adsoyadi = scanner.nextLine();

        char ad1= adsoyadi.toUpperCase().charAt(0);
        char ad2= adsoyadi.toUpperCase().charAt(adsoyadi.indexOf(" ")+1);
        char soyadi= adsoyadi.toUpperCase().charAt(adsoyadi.lastIndexOf(" ")+1);

        System.out.println(ad1+"."+ad2+"."+soyadi+".");

    }
}
