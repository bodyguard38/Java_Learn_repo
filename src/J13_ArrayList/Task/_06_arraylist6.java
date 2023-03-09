package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(5,4,6,2,1));

        hillNum(arrList);
        System.out.println(hillNum(arrList));

    }

    private static int hillNum(ArrayList<Integer> arrList) {
        int sayi = 0; //return etmek icin kullanilacak bulunan elemanlari bu listenin icine atacagiz

        for (int i = 1; i < arrList.size()-1 ; i++) {
            if(arrList.get(i) <arrList.get(i-1) && arrList.get(i) >arrList.get(i+1)) {
                sayi+=arrList.get(i);
            }
        }
        return sayi;


    }
}
