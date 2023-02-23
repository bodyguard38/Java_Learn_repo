package J15_Varargs.Taks;

public class Task03 {
    public static void main(String[] args) {

        // verilen String value lerin en cok karaktere sahip olani print eden method print ediniz.

        System.out.println("*****Task03*****");
        unUzunString("JavaCAN","JAvatar");

    }

    private static void unUzunString(String ... str ) {
        String uzunString ="";
        for(String w:str){
            if(w.length()>uzunString.length()){
                uzunString = w;
            }
        }
    }
}
