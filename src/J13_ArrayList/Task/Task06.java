package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Task06 {
    public static void main(String[] args) {

         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.
        */

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the element " + (i + 1)+ ":");
            arr[i]=  input.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }
}
