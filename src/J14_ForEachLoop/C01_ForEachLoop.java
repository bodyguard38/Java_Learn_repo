package J14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
    for-each loop for loop'un gelilmş halıdir.
    1. clean code- yazım kolaylığı
    2. code okuma kolaylıgı
    3. hata yapma riskini azaltır.

    */
        List<Integer> sayiList = new ArrayList<>(List.of(16, 21, 33, 54, 15, 45,58));

        System.out.println("****   Task01   ****");
        //Task01 -> list elemanlarini ayri satirda print ediniz.
        for (int i = 0; i < sayiList.size() ; i++) {
            System.out.print(sayiList.get(i)+" ");
        }
        System.out.println();
        for (Integer ebikGabik : sayiList) {
            System.out.print(ebikGabik+" ");
        }
        System.out.println();
        System.out.println("   ***   Task02   ***   ");
        // task 02-> list tek elemanlarını ilk 3 eleman hariç print eden code create ediniz.

          for(Integer m : sayiList.subList(3, sayiList.size())) {
              if (m % 2 == 1) {
                  System.out.print(m+" ");
              }
          }
          // Task03 -> list elemanlarini 2 ve 5 index dahil toplamini print eden code create ediniz.
            int sum = 0;

          for (Integer m : sayiList.subList(2,6)) {
              sum+=m;
          }
        System.out.println();
        System.out.println(sum);
    }
}
