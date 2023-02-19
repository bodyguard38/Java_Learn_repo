package j12_Arrays.Task_001;

public class Task_07 {
    public static void main(String[] args) {
        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
        int nums[] = {12, 2, 5, 15, 8};
        int max = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("The largest value in de array is : " + max);

    }
}
