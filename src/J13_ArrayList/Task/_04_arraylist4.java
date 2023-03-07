package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {


        changeInArraylist();



    }

    private static void changeInArraylist() {
        ArrayList<String> renkList = new ArrayList<>();

        renkList.add("yellow");
        renkList.add("red");
        renkList.add("blue");
        renkList.add("red");
        renkList.add("blue");
        System.out.println("renkList = " + renkList);
        String s1 = "blue";
        String s2 = "yellow";

        for (int i = 0; i < renkList.size() ; i++) {
            if(renkList.get(i).equals(s1)){
                renkList.set(i, s2);
            }
        }
        System.out.println("renkList = " + renkList);
    }
}
