package j10_MethodCreation.Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task21 {
         static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
         */

       tamBasSayisi();
    }

    private static void tamBasSayisi() {
        System.out.print("Tam bir sayi giriniz: ");
        int tamSayi= input.nextInt();
        System.out.println(("Girilen tam sayinin basamak sayisi:"+String.valueOf(tamSayi).length()));
    }
}
