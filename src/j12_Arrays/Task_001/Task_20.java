package j12_Arrays.Task_001;

import java.util.Arrays;

public class Task_20 {
    public static void main(String[] args) {
        /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..
        int array[] = {1, 2, 3, 4};
        int[] newArray = {array[0], array[array.length - 1]};
        System.out.println("newArray contains  :"+Arrays.toString(newArray));
    }
}
