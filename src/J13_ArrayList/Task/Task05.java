package J13_ArrayList.Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        String[][] arrName = {{"Ali", "Veli", "Ayse"}, {"Hasan","Can"}, {"Suzan"}};

        combineAndSort(arrName);

    }

    private static void combineAndSort(String[][] arrName) {

        ArrayList<String> combined = new ArrayList<>();
             for (String[] arr : arrName) {
                 for (String s : arr) {
                     combined.add(s);
                 }
        }
        Collections.sort(combined);
        System.out.println(combined);
    }

}
