package j12_Arrays.Task_001;

public class Task_09 {
    public static void main(String[] args) {
         /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        int num[] = {15, 25, 22, 18,30 };
        int max = num[0];
        int secondMax = num[0];
        for (int i = 1; i < num.length ; i++) {
            if (num[i]>max){
                secondMax = max;
                max = num[i];
            }else if (num[i]>secondMax&&num[i]!=max){
                secondMax = num[i];
        }
        }
        System.out.println("The second largest element in the array is "+ secondMax);
}
}
