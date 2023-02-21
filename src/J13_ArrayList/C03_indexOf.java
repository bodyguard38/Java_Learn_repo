package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_indexOf {
    public static void main(String[] args) {
        // indexOf() method list icinde istenen eleman var ise index ini return eder olmayan elemani icin -1 basar

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println(ulkelist.indexOf("Amerigonya")); // 4
        System.out.println(ulkelist.indexOf("amerigonya")); //-1
        System.out.println(ulkelist.indexOf("patagonja"));  //-1
        ulkelist.add("Polkonya");
        System.out.println(ulkelist);
        System.out.println(ulkelist.indexOf("Polkonya"));  //-1
        System.out.println(ulkelist.lastIndexOf("Polkonya"));

    }
}
