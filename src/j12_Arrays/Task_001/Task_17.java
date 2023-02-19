package j12_Arrays.Task_001;

public class Task_17 {
    public static void main(String[] args) {
         /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.

        int arr[][] = {{2,3,2},{4,1,5},{7,2,5}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]==2) {
                    arr[i][j]=6;                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
