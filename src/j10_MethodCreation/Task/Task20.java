package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task20 {
    static Scanner scan= new Scanner(System.in);
    static int toplamDolar=0;
    static int toplamEuro=0;
    String s="";
    public static void main(String[] args) {
          /*
         task->
         Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

         [$1 $12 €34 €56 $45 €78]
         dolarToplami: 58
         euroToplami: 168
         */

        hesapla();


    }

    private static void hesapla() {
        System.out.println("Kac adet para gireceksiniz");
        int kacTane= scan.nextInt();
        for (int i = 1; i <=kacTane ; i++) {


        }
    }
}
