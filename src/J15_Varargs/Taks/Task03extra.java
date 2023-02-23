package J15_Varargs.Taks;

public class Task03extra {
    public static void main(String[] args) {
         /*
            Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
        */

        int sayi1 = 7;
        String str1="sefil javacı Haluk";//
        String str2="perfect javacı Abdulhamit";//
        String str3="beleştepe muhtarı CEREN hanım";//

        System.out.println(carpUzunStringSayi(sayi1, str1, str2, str3));

    }

    private static int carpUzunStringSayi(int sayi1, String ... str) {
        String uzunstr ="";
        for (String w:str){
            if (w.length()>uzunstr.length()){
                uzunstr=w;
            }
        }
        return sayi1+uzunstr.length();
    }

}
