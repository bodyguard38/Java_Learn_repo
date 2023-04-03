package InterviewQuestion;

public class ReversingStringCodes {
    public static void main(String[] args) {
        String str = "javaCAN &JAVATAR";
        tersCevir(str);
    }

    private static void tersCevir(String str) {
        String s3="";

        for (int i = 0; i <str.length() ; i++) {
            s3=str.charAt(i)+s3;
        }
        System.out.println(s3);
    }
}
