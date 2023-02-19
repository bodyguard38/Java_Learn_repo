package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task09 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /*
     Task->  Saati saniyeye çeviren  method create ediniz
         */
        translation();
    }

    private static void translation() {
        System.out.print("Please enter hours to learn seconds  :");
        int hours = input.nextInt();
        int seconds = hours * 3600;
        System.out.println("You enter "+hours+" hour equals " +seconds+ " second" );
    }

}
