package j08_Loops.Loop02_WhileLoop.Tasks;


import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
       int sayi=scanner.nextInt();
        int i=1;
       while(i<=10){
           System.out.println(sayi+"x"+i+"="+sayi*i);
           i++;
       }
    }
}
