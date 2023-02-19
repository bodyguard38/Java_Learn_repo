package j12_Arrays.Task_002;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

        //Task -> girilen int array elemanlari toplamini print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.print("Agam kaç elemanlı array istirsen : ");
        int arrayBoyut = input.nextInt();
        int arr[] = new int[arrayBoyut];//girilen eleman kadar boş array create edildi

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print(i + ". index array elemanınını giriniz : ");
            arr[i] = input.nextInt();
        }
        System.out.println("agam ahan da arrayin : " + Arrays.toString(arr));
        ;

        Arrays.sort(arr);//array elemanları k->b sortingen  -> [1,2,21,27,44]
        int toplam = 0;
        for (int i = 0; i <arrayBoyut ; i++) {
            toplam += arr[i];
        }
        System.out.println("toplam = " + toplam);

    }
    }

