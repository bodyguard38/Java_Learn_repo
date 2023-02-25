package j12_Arrays.Task_002;

public class Task_14 {
    public static void main(String[] args) {

         /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "ade1r4d3";

        rakamlarToplami(str);
    }

    private static void rakamlarToplami(String str) {
      int sum = 0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println("Sum of digit in  is  :" +sum);
    }
}
