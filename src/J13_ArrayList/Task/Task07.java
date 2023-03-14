package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        String[] isimler = {"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        System.out.print("Original List : " );
        printArr(isimler);

        String temp=isimler[2];
        isimler[2]=isimler[7];
        isimler[7]=temp;

        System.out.print("Update list : ");
        printArr(isimler);

    }

    private static void printArr(String[] isimler) {
        for (String s:isimler) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
