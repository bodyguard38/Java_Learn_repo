package J13_ArrayList.Task;

import java.util.ArrayList;

import static java.lang.reflect.Array.getLength;

public class _03_arraylist3 {


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

            ArrayList<String> ArrayList = new ArrayList<>();

            ArrayList.add("New jersey");
            ArrayList.add("New york");
            ArrayList.add("Ohio");
            ArrayList.add("Florida");
            ArrayList.add("Boston");

           getLength(ArrayList);

        }

    private static void getLength(ArrayList<String> ArrayList) {
        System.out.println("ArrayList = " + ArrayList);

        for (String sehir : ArrayList) {
            System.out.print(sehir.length()+" ");
        }
    }

}
