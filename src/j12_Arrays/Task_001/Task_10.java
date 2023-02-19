package j12_Arrays.Task_001;

public class Task_10 {
    public static void main(String[] args) {
         /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String s = "Hello World";
        String reverse = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse += s.charAt(i);
        }
        System.out.println("Reverse string : " + reverse);
    }
}
