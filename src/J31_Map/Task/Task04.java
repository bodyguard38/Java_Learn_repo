package J31_Map.Task;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task04 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence...");
        String kelime = input.nextLine();

        Map<Character, Integer> harfSayı = new TreeMap<>();

        for (int i = 0; i < kelime.length(); i++) {

            char c = kelime.charAt(i);

            if (harfSayı.containsKey(c)) {
                harfSayı.replace(c, harfSayı.get(c) + 1);
            } else {
                harfSayı.put(c, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : harfSayı.entrySet()) {
            System.out.println("Karakter " + entry.getKey() + " " + entry.getValue() + " kadar var...");
        }


    }


}

