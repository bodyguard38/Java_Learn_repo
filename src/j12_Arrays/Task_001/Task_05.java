package j12_Arrays.Task_001;

import java.util.Arrays;

public class Task_05 {
    public static void main(String[] args) {
         /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.
        int toplam = 0;
        int Array[] = {5, 6, 8, 12, 14, 19};
        for (int i = 0; i < Array.length; i++) {
            if (i % 2 == 0) {
                toplam += Arrays.toString(Array).charAt(i);
            } else if (i % 2 == 1) {


            }

        }

        System.out.println("toplam = " + toplam);
    }
}

