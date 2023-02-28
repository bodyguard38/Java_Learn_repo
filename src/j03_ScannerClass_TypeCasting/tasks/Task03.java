package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours do u sleep a day?");
        int sleepTime = scanner.nextInt();

        int month=sleepTime*30;
        int year=sleepTime*365;
        int fortyYear=sleepTime*40*365;

        System.out.println("month = " + month);
        System.out.println("year = " + year);
        System.out.println("fortyYear = " + fortyYear);
    }
}
