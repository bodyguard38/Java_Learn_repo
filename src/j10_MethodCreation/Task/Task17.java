package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task17 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        tamSayiyiTersCevirme();
    }

    private static void tamSayiyiTersCevirme() {
        int toplam=0;
        System.out.println("Lutfen bir tamsayi deger giriniz     :");
        String sayi = input.nextLine();
        for (int i = sayi.length()-1; i >=0 ; i--) {
            System.out.print(sayi.charAt(i));

        }
    }




        }





