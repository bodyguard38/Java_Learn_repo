package J14_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int arr[][]={{2,3},{4},{5,6,7}};

        int carpim = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim = carpim * arr[i][j];
            }
        }
    //    System.out.println(carpim);
    //
    //    for (int a[] : arr) {
    //        for(int b : a) {
    //            carpim*=b;
    //        }
    //    }
        //   System.out.println("carpim = " + carpim);
    }
}
