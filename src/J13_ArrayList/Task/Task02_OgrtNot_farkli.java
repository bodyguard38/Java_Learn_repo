package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Scanner;


public class Task02_OgrtNot_farkli {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        ArrayList<Integer> notlar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("KAc tane not girmek istiyorsunuz?:");
        int notSayisi = scanner.nextInt();
        int toplam = 0;

        for (int i = 0; i <notSayisi ; i++) {
            System.out.println("Notlari giriniz:");
            int not = scanner.nextInt();
            notlar.add(not);
            toplam += not;
        }
        int ortalama = toplam / notSayisi;
        int sayac=0;

        for (int i = 0; i < notlar.size() ; i++) {
            if(notlar.get(i) == ortalama){
                sayac++;
            }
        }
        System.out.println("Notlar ortalamasi  :"+ortalama);
        System.out.println("Ortalamayi gecen ogrenci sayisi = " + sayac);
    }

}
