package j12_Arrays.Task_001;

public class Task_18 {
    public static void main(String[] args) {
         /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.

        int nums[][] = {{5,2,1},{10,2,3,6},{1,2}};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                sum+= nums[i][j];
            }
        }
        System.out.println("Total  : " + sum);
    }
}
