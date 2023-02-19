package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task18 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
          /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        kontrol();
    }

    private static void kontrol() {
        System.out.println("1. kenar   :");
        int a = input.nextInt();
        System.out.println("2. kenar   :");
        int b = input.nextInt();
        System.out.println("3. kenar   :");
        int c = input.nextInt();


    }
}
