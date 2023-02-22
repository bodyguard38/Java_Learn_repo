package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' ve 'A' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimList = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        System.out.println("isimList = " + isimList);

        ArrayList<String> aOlmayanIsimList = new ArrayList<>();
        for (int i = 0; i <isimList.size() ; i++) {
            if (!isimList.get(i).toLowerCase().contains("a")){
                aOlmayanIsimList.add(isimList.get(i));
            }
        }
        System.out.println(aOlmayanIsimList);
        isimList.clear();
        System.out.println("isimList = " + isimList);
        isimList.addAll(aOlmayanIsimList);
        System.out.println("isimList = " + isimList);


    }
}
