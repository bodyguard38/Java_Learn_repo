package InterviewQuestion;

import java.util.Scanner;

public class OkekBulma {
    public static void main(String[] args) {
        //kullanicidan alinan iki sayinin okek ini bul
        //input 10,20
        //output 20
        //input 11,24
        //output 11*24
    Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz  :");
        int sayi1=scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz  :");
        int sayi2=scan.nextInt();

        int buyuk=Math.max(sayi1,sayi2);
        int ekok=0;

        for (int i = buyuk; i <=sayi1*sayi2 ; i++) {
            //iki sayidan buyuk olanla donguyu baslatildi sayilarin carpimina kadar devam edildi.
            if(i%sayi1==0&&i%sayi2==0){
                ekok=i;
                break;
            }
        }
        System.out.println("ekok :"+ekok);
    }
}
