package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6));

    tekrarsizListPrintEt(list);

    }

    private static void tekrarsizListPrintEt(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {

            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }

        }
        System.out.println(list1);

    }
}
