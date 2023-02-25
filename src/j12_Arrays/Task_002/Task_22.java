package j12_Arrays.Task_002;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        /*  Write a Java program to get a String from user as input and find the maximumCounts
         occurring character in that string.    (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string  : ");

        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <input.length() ; i++) {
            char c = input.charAt(i);
            if(Character.isLetter(c)){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }

        char maxChar =' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if(count > maxCount){
                maxChar = c;
                maxCount = count;

            }
        }
        System.out.println("The maximum occuring character in\""+ input + "\" is : " + maxChar);
    }
}
