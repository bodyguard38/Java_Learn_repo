package InterviewQuestion;

import java.util.Scanner;

public class ObebBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz  :");
        int sayi1=scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz  :");
        int sayi2=scan.nextInt();

        int obeb=obebBulma(sayi1, sayi2);
        System.out.println("Obeb "+sayi1+" ve "+sayi2+" degeri : "+obeb);
    }

    private static int obebBulma(int sayi1, int sayi2) {
        while(sayi2!=0){
            int temp=sayi2;
            sayi2=sayi1%sayi2;
            sayi1=temp;
        }
        return sayi1;
    }
}
