package j12_Arrays;

import java.util.Arrays;

public class C02_Arrays_BinarySearch {
    public static void main(String[] args) {
        int sayiArray[] = {2,46,31,80,44,63,27,21,79};

        int sayi1 = 44;
        int sayi2 = 34;
        boolean flag = false; //bayrak asagi
        for (int i = 0; i <sayiArray.length ; i++) {
            if (sayiArray[i] == sayi2) {
               flag = true;// bayrak yukari
                break;
            }
        }
        if (flag) {
            System.out.println("Aranan sayi arrayde var");
        }else System.out.println("Aranan sayi mevcut degil");
    Arrays.sort(sayiArray);
        System.out.println("Arrays.binarySearch(sayiArray,34) = " + Arrays.binarySearch(sayiArray, 34));
        System.out.println("Arrays.binarySearch(sayiArray,35) = " + Arrays.binarySearch(sayiArray, 35));
        System.out.println("Arrays.binarySearch(sayiArray,44) = " + Arrays.binarySearch(sayiArray, 44));
        System.out.println("Arrays.binarySearch(sayiArray,31) = " + Arrays.binarySearch(sayiArray, 31));


    }
}
