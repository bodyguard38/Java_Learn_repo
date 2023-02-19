package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task24 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :1, 1, 2, 3, 5, 8, 13, 21, 34
        */
        printFibonacci();

    }

    private static void printFibonacci() {
        System.out.print("Please enter number  :");
        int maxNumber = input.nextInt();

        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=1, previousNumber = 0, nextNumber = 1;
        while(i <= maxNumber) {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
}
}
