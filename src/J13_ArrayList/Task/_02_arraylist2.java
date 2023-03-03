package J13_ArrayList.Task;

import java.util.ArrayList;

public class _02_arraylist2 {
    public static void main(String[] args) {


      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        int sum = getSum(list);
        System.out.println("sum = " + sum);

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size() ; i++) {
            sum+=list.get(i);

        }
        return sum;


    }

    public static class _03_arraylist3 {

        /*
            getLength() isminde bir method oluşturun.
            Parametre olarak String ArrayList
            Return tipi Integer ArrayList
            ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

            Tüm elementlerin uzunluğunu döndürün

            Örneğin;
            ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
            Tüm Stringlerin uzunluklarını yazdırın;
            cevap: 10 ,  8 , 4 , 7 , 6 olmalı
         */

        public static void main(String[] args) {


        }
    }
}

