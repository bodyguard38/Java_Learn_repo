package j12_Arrays.Task_001;

public class Task_15 {
    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String s = "Removes white space from both ends of a string";

        String words[] = s.trim().split("\\s+");
        int wordscount = words.length;

        System.out.println("Number of words: " + wordscount);
    }
}
