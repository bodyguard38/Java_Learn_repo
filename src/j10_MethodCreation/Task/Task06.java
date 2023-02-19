package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task06 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Task-> Girilen iki boyuta gore secilen geometrik seklin (kare dortgen ve ucgen)
        // alan ve cevre degerlerini print eden Method crreate ediniz

        geometrikHesapla();

    }//main sonu

    private static void geometrikHesapla() {
        System.out.println("1. sayi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("2. sayi giriniz");
        double sayi2 = scan.nextDouble();

        System.out.println("Geometrik sekil seciminizi yapiniz");

        String geoSekil = scan.next().toLowerCase();
        switch (geoSekil) {
            case "kare":
                kareAlanHesapla(sayi1, sayi2);
                kareCevreHesapla(sayi2, sayi1);
                break;
            case "dikdortgen":
                dikdortgenAlanHesapla(sayi1, sayi2);
                dikdortgenCevreHesapla(sayi2, sayi1);
                break;
            case "ucgen":
                ucgenAlanHesapla(sayi1, sayi2);
                ucgenCevreHesapla(sayi2, sayi1);
                break;
            default:
                System.out.println("Lutfen duzgun bir deger giriniz");
        }
    }

    private static void ucgenCevreHesapla(double sayi2, double sayi1) {
        System.out.println("Lutfen 3. kenari giriniz");
        double kenar3 = scan.nextDouble();
        System.out.println("ucgenin  cevresi: " + (sayi1 + sayi2+kenar3));
    }
    private static void ucgenAlanHesapla(double sayi1, double sayi2) {

        System.out.println("Yukseklik giriniz");
        double yksklik1 = scan.nextDouble();
        System.out.println("dikdortgenin  alanı: " + (sayi1 * yksklik1)/2);
    }
    private static void dikdortgenCevreHesapla(double sayi2, double sayi1) {
        System.out.println("dikdortgenin  cevresi: " + (sayi1 + sayi2)*2);
    }

    private static void dikdortgenAlanHesapla(double sayi1, double sayi2) {
        System.out.println("dikdortgenin  alanı: " + (sayi1 * sayi1));
    }

    private static void kareCevreHesapla(double sayi2, double sayi1) {
        System.out.println("karenin cevresi :"+ (sayi1*4));
    }

    private static void kareAlanHesapla(double sayi1, double sayi2) {
        if (sayi1 == sayi2) {
            System.out.println("karenin alanı: " + (sayi1 * sayi1));
        }else {
            System.out.println("karenn kenarlari esittir esit bir deger girin");
        }
    }

}//class sonu
