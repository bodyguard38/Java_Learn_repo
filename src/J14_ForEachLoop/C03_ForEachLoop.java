package J14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each

        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"gülsüm","musty",  "ayşe", "enise", "cüneyt", "ciğdem"};

       List<String> ortakList = new ArrayList<String>(); //bos liste

        for (String str1:arr1){
            for(String str2:arr2){
                if (str1.equalsIgnoreCase(str2)){
                    ortakList.add(str1);
                }
            }
        }
        if (ortakList.size() ==0){
            System.out.println("Olsa dukkan senin ortak eleman yok");
        }else System.out.println("Agam ortak elemanları: " + ortakList);
    }
}
