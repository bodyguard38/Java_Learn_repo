package J15_Varargs.Taks;

public class Task04 {
    public static void main(String[] args) {

        String strArr1[]= {"h", "a", "l", "u", "k"};
        String strArr2[]= {"a", "l", "i"};
        int sayi =3;

        concat(sayi,"javatar", "abdulhamit", "vaveyla", "ahanda");//javaTAR
    }

    private static void concat(int sayi, String...str) {
        String result = "";
        for (String w:str){
           result= result.concat(w.substring(0,3));

        }
        System.out.println(result);
    }
}
