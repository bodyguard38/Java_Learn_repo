package j12_Arrays.Task_002;

public class Task_13 {
    public static void main(String[] args) {

         /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */
        int [] arr = {18, 22, 31, 42, 5,-15,24,-3};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%3==0){
                sum ++;
            }
        }
        System.out.println("Number of numbers divisible by 3 : "+sum);
    }
}
