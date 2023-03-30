package J32_Enum.Enum03;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
         /*  TASK :
       1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
       2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
       3- 3 kitap tanımlayınız bir ArrayList e atınız.
       4- bir kategoriye gore listeletiniz.
        */

        Kitap ktb=new Kitap();
        ktb.name="Leyla mecnunun nesi oluyor";
        //ktb.kategori="roman";
        ktb.tur=Kategori.ROMAN;

        Kitap ktb2=new Kitap();
        ktb2.name="Agaya benden kusleme yiyelim";
        //ktb.kategori="rooman";
        ktb2.tur=Kategori.ROMAN;

        Kitap ktb3=new Kitap();
        ktb3.name="Halukca ebik gabik";
        //ktb.kategori="Roman";
        ktb3.tur=Kategori.ROMAN;
        ArrayList<Kitap> kutuphane=new ArrayList<Kitap>(Arrays.asList(ktb,ktb2,ktb3));//kitap obj atanmis kitap data type arraylist tanimlandi.

       // for (Kitap k:kutuphane ) {
       //     if(k.kategori.equalsIgnoreCase("roman")){
       //         System.out.println(k+" ");
       //     }
       // }
        for (Kitap k:kutuphane) {
            if(k.tur==Kategori.ROMAN){
                System.out.println(k.name);
            }
        }


    }
}
