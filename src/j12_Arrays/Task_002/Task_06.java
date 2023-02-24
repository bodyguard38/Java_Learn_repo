package j12_Arrays.Task_002;

import java.util.Arrays;

public class Task_06 {
    public static void main(String[] args) {

        // Task-> verilen bir int arrayi elemanlarını
        // buyukten kucuge siralayip return eden METHOD create ediniz
        int[] arr ={1,5,7,6,9,5,7};
        int [] sortedArr = sortDescending(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortDescending(int[] arr) {
        int len = arr.length;
        int[] sortedArr = new int[len];
        System.arraycopy(arr, 0, sortedArr, 0, len);
        Arrays.sort(sortedArr);
        int[] descendingArr = new int[len];
        for (int i = 0; i < len; i++) {
            descendingArr[i] = sortedArr[len - i - 1];
        }
        return descendingArr;
    }
}
