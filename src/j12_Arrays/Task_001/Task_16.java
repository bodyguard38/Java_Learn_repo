package j12_Arrays.Task_001;

public class Task_16 {
    public static void main(String[] args) {
            /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
           */

        //Kodu aşağıya yazınız.
        String str = "$12 $23 $10 $2 $5 $2";

        str = str.replace("$", "");
        String[] arr = str.split(" ");

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum+= Integer.parseInt(arr[i]);
        }
        System.out.println("Sum : " + sum);
    }
}
