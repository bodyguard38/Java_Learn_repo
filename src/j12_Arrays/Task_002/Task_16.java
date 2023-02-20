package j12_Arrays.Task_002;

public class Task_16 {
    public static void main(String[] args) {
        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz
        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int Carpim = 1;
        for (int [] a:arr){
            Carpim *= a[a.length-1];
        }
        System.out.println("Carpim = "+Carpim);
    }
}
