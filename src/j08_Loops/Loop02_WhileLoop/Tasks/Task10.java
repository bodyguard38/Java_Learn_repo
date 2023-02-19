package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz  : ");
        int tamSayi = input.nextInt();

        int i=1;
        while(tamSayi>i){
            System.out.print(i+" ");
            i+=2;
        }
    }
}
