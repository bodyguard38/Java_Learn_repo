package j12_Arrays.Task_002;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

        */
        int arr[] = {1,2,-3,4,-5,-6};
        arrTersIsaretle(arr);

    }

    private static void arrTersIsaretle(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] *= -1;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
