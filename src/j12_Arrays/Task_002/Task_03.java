package j12_Arrays.Task_002;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
         /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int [] arr = {1,2,3,4};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i+1];
        }
        arr2[arr.length-1]=arr[0];
        System.out.println(Arrays.toString(arr2));
    }
}
