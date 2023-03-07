package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        rotateList(arrayList);

    }

    private static void rotateList(ArrayList<String> arrayList) {

        arrayList.add("New jersey");
        arrayList.add("New york");
        arrayList.add("Atlanta");
        arrayList.add("Florida");
        arrayList.add("Ohio");
        System.out.println("arrayList = " + arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}

