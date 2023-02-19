package j12_Arrays.Task_001;

public class Task_11 {
    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.
        int total = 0;
        int total1 = 0;
        int nums[] = {12,14,21,23,10,4};
        for (int i = 0; i <=nums.length-1 ; i++) {
            total += nums[i];

        }
        total1= total/ nums.length;
        System.out.println("Avarage of the numbers is : " + total1);
    }
}
