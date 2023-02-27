package J17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive(Class array list-> refrans ) data turlerinde obj kemdisi değil de dataları geğişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
        */
        // Task -> lis elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update dip print method create ediniz.
        //1. method-> with for each 2. method-> set(index,value)

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("list = " + list);
        listUpdate1(list);//[24, 20, 87]
        listUpdate2(list);

        System.out.println("list = " + list);

    }

    private static void listUpdate2(ArrayList<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            list.set(i, list.get(i) - 7);
        }
        System.out.println("list = " + list);
    }

    private static void listUpdate1(ArrayList<Integer> list) {

        for(int w:list){
            w+=10;
        }
        System.out.println("list = " + list);
    }
}
