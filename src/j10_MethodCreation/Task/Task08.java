package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task08 {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         /*
          Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

         input: 2023
         output:false
         */

        System.out.println(leapYear());
    }

    private static boolean leapYear() {
        System.out.print("Please enter a year  :");
        int  year = Integer.parseInt(input.nextLine());
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;


    }
}
}
