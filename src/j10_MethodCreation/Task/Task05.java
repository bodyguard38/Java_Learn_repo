package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task05 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Task-> girilen iki sayiyi secilen dort isleme gore hesaplayip print eden code method create ediniz.


        dortIslem();
        System.out.println("Code cok iyi devam");
    }

    private static void dortIslem() {
        System.out.print("1. sayiyi giriniz  :");
        double sayi1 = scan.nextDouble();

        System.out.print("2. sayiyi giriniz  :");
        double sayi2 = scan.nextDouble();

        System.out.print("Lutfen islem seciminizi giriniz :");
        char islem = scan.next().charAt(0);
        switch (islem) {
            case '+':
                topla(sayi1, sayi2);
                break;
            case '-':
                cikar(sayi1, sayi2);
                break;
            case '*':
                carp(sayi1, sayi2);
                break;
            case '/':
                bol(sayi1, sayi2);
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
        }


    }

    private static void bol(double sayi1, double sayi2) {
        System.out.println("sayi1/sayi2 = " + (sayi1 / sayi2));
    }

    private static void carp(double sayi1, double sayi2) {
        System.out.println("sayi1*sayi2 = " + (sayi1 * sayi2));
    }

    private static void cikar(double sayi1, double sayi2) {
        System.out.println("sayi1-sayi2 = " + (sayi1 - sayi2));
    }

    private static void topla(double sayi1, double sayi2) {
        System.out.println("sayi1+sayi2 = " + (sayi1 + sayi2));
    }
}
