package J26_Exceptions;

import java.util.Scanner;

public class Task01 {
    /*
    Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password unuzu giriniz : ");
        String password = input.nextLine();

        try {
            if(password.length()< 6 || password.length() >10) {
                throw new IllegalArgumentException("Agam pass in 6 dan az yada 10 dan cok olmus");
            }else {
                System.out.println("Password gayet basarilidir");
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()+"Agam tekrar giresen");

        }



    }
}
