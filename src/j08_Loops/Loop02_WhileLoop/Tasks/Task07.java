package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 7 sayının en buyugunu print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        int bigest = 0, count = 1;

        while (count <= 7) {
            System.out.print(count+". enter a number :");
            int num = sc.nextInt();
            bigest = num > bigest? num : bigest;
            count++;
        }
        System.out.println("the biggest number is " + bigest);

    }
}
