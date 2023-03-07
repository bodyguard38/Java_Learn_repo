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
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(5);
        arrList.add(4);
        arrList.add(6);
        arrList.add(2);
        arrList.add(1);

        int hillNum=hillNum(arrList);
        System.out.println("Hill number: " + hillNum);
    }

    private static int hillNum(ArrayList<Integer> arrList) {
        int prev = arrList.get(0);

        for (int i = 1; i < arrList.size()-1 ; i++) {
            int curr = arrList.get(i);
            int next = arrList.get(i+1);
            if (curr < prev && prev>next) {

                System.out.println(curr + " is less than " + prev + " and greater than " + next);
                return curr;
            }
            prev = curr;
        }

        return -1;
    }
}
