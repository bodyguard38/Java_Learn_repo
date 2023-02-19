package j12_Arrays.Task_001;

public class Task_08 {
    public static void main(String[] args) {
         /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
        int  nums[] = {14, 19, 5, 21};
        int min =nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("The smallest number in the array is : " + min);
    }
}
