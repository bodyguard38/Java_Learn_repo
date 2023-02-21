package j12_Arrays.Task_001;

import java.util.Arrays;

public class Task_02 {
    public static void main(String[] args) {
        /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
        */
        // Kodu aşağıya yazınız..
        int sayiArray[] = {13,15,14,16,16};
        Arrays.sort(sayiArray);
        System.out.println(Arrays.toString(sayiArray));

    }
}
