package j12_Arrays.Task_001;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
        /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..

        int toplam = 0;
        int sayiArray[] = {25,30,30,35,100};
        for (int i = 0; i < sayiArray.length ; i++) {
            toplam += sayiArray[i];


        }
        System.out.println("Toplam : "+toplam);
    }
}
