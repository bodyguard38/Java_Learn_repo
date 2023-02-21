package j12_Arrays.Task_001;

import java.util.Arrays;

public class Task_13 {
    public static void main(String[] args) {
         /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..
        int array[] = {1, 0, 0, 1, 0};

        int [] result = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i]== 0){
                result[count++]=0;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i]== 1){
                result[count++]=1;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
