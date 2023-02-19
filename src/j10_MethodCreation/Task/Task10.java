package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        int sayi = scan.nextInt();

        int toplam = 0;

        for(int i = 1; i <=sayi; i++){
            if(i%2==1){
                toplam += i;
                System.out.print (i +" ");
            }
        }
        System.out.println("Tek Sayıların Toplamı = "+ toplam);
    }
}
