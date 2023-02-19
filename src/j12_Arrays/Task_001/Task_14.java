package j12_Arrays.Task_001;

public class Task_14 {
    public static void main(String[] args) {
          /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String str = "Hello World";

        String result = str.replace("o", "K");
        System.out.println("Result: " + result);


    }
}
