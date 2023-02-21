package j12_Arrays.Task_001;

import java.util.Arrays;

public class Task_01 {
    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String fruitArray[] = {"Apple", "Orange", "Banana", "Kiwi"};
        Arrays.sort(fruitArray);
        System.out.println(Arrays.toString(fruitArray));
    }
}
