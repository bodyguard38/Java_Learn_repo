package j12_Arrays.Task_002;

public class Task_15 {
    public static void main(String[] args) {

        //task-> arr  tum elemalarının çarpımını print eden code create edinz

        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };

        int toplam=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam*=arr[i][j];
            }
        }
        System.out.println("arr elemanların carpimi  : "+toplam);
    }
}
