package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task25 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile


    public static void main(String[] args) {
        //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        faktoriyel();
    }

    private static void faktoriyel() {
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = input.nextInt();
        int factorial = 1;//int type variable tanımlandı

        for (int i = 1; i <= sayi; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
    }
}
