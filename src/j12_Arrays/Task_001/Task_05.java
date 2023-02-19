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
      int nums[] = {5,6,8,12,14,19};
      int total = 0;
      for (int num : nums){
          if (num % 2 == 0){
              total+=num;
          }else{
              total-=num;
          }
      }
        System.out.println("the total is: "+total);
    }
}

