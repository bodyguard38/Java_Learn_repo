package j12_Arrays.Task_002;

import java.util.Arrays;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {

        // task-> girilen bir int array elamanlarından  ortlaamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Agam kaç elemanlı array istirsen : ");
        int arrayBoyut = input.nextInt();
        int arr[] = new int[arrayBoyut];//girilen eleman kadar boş array create edildi

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print(i + ". index array elemanınını giriniz : ");
            arr[i] = input.nextInt();
        }
        System.out.println("agam ahan da arrayin : " + Arrays.toString(arr));

        int arrToplam= 0;
        for (int i = 0; i < arrayBoyut; i++) {
            arrToplam+=arr[i];

        }
        System.out.println("arr eleman toplami" +arrToplam);

        int count = 0;
        for (int i = 0; i <arrayBoyut ; i++) {
            if(arr[i]>arrToplam/arrayBoyut){
                count++;
            }
        }
        System.out.println("arr nin ortalamayi gecen eleman sayisi : " + count);
    }
}
