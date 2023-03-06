package J21_StaticKeyword;

public class C02_StaticBlok {//class level
    static String isim="halUK";
    static {//static blok
        System.out.println("1. blok update oncesi.");
        System.out.println("isim = " + isim);
        isim="Celine hanim";
        System.out.println("1. blok update sonrasi  isim = " + isim);
    }
    public static void main(String[] args) {//main level
        /*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */
        System.out.println("main method basladi");
        isim="Mustafa bey";
        System.out.println("isim = " + isim);
        System.out.println("Main method bitti");


    }//main sonu
    static {//static blok
        System.out.println("2. blok run oldu");
        System.out.println("2. blok update oncesi  isim = " + isim);
        isim="Ceren Patron";
        System.out.println("2. blok update sonrasi  isim = " + isim);
    }
}
