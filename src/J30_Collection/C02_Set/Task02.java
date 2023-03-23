package J30_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {

        //interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
        // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
        // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...
        Long hsBasla=System.currentTimeMillis();//hashSet baslama zamani atandi.

        HashSet<String> hs=new HashSet<>();
        hs.add("Celine");
        hs.add("Ahmet");
        hs.add("HArika");
        hs.add("Ismail");
        hs.add("Sumeyye");
        hs.add("Murat");
        hs.add("Haluk");

        long hsBitir = System.currentTimeMillis();//HashSet bitme zamani atandi.
        System.out.println("(hashSet run suresi = " + (hsBitir - hsBasla));

        System.out.println("   ***   ");
        long tsBasla = System.currentTimeMillis();
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Celine");
        ts.add("Ahmet");
        ts.add("Harika");
        ts.add("Ismail");
        ts.add("Sumeyye");
        ts.add("Murat");
        ts.add("Haluk");
        long tsBitir = System.currentTimeMillis();//TreeSet bitme zamani atandi.
        System.out.println("treeSet run suresi = " + (tsBitir - tsBasla));
        //Iyi bir javacan icin gelisMAC lazim :)






    }
}
