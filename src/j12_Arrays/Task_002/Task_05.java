package j12_Arrays.Task_002;

import java.util.Arrays;

public class Task_05 {
    public static void main(String[] args) {

        // Task-> girilen int değeri tersten print eden code create ediniz.

            int[] numArray ={14,66,3,22,1,21,65,43};

        for (int i = numArray.length-1; i >=0 ; i--) {
            System.out.print(numArray[i] + " ");

        }

    }
}
