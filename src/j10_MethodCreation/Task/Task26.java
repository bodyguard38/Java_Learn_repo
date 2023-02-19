package j10_MethodCreation.Task;

import java.util.Scanner;


public class Task26 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> girilen bir ifadedeki tekrarli tum karakterleri yalnizca bir
        // kez print eden Method create ediniz.
        // input-> Javacanlara selam olsun
        //output-> Javcnlr semou

    tekrarsizPrint();

    }

    private static void tekrarsizPrint() {
        System.out.print("Lutfen bir string giriniz:");
        String str=input.nextLine();

        String tekrarsiz="";
        for (int i = 0; i <str.length(); i++) {
            if (!tekrarsiz.contains("" + str.charAt(i))) {
                tekrarsiz+=""+str.charAt(i);
            }
        }
        System.out.println(tekrarsiz);
    }

}

