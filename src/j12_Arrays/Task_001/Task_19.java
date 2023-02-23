package j12_Arrays.Task_001;

import java.util.Arrays;

public class Task_19 {
    public static void main(String[] args) {
         /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String [][] states ={
                {"new jersey","atlanta","ohio"},
                {"Pittsburgh","ohio","new york","ohio"},
                {"ohio","new york"}
        };
        for (int i = 0; i < states.length ; i++) {
            for (int j = 0; j < states[i].length ; j++) {
                if (states[i][j].equals("ohio")){
                    states[i][j] = "Florida";
                }
                System.out.print(states[i][j]+" ");
            }

        }



    }
}
