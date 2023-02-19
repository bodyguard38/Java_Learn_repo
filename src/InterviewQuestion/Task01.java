package InterviewQuestion;

public class Task01 {
    public static void main(String[] args) {
         /*Task -> Verilen string ifadede bir kez yazilan harfleri print eden code create ediniz
        String str = "vobbecobdcbbaiitkk";
         */

        for (String str = "vobbecobdcbbaiitkk"; !str.isEmpty() ; str = str.replace(str.charAt(0) + "" , ""))
           System.out.print(str.lastIndexOf(str.charAt(0)) == 0 ? str.charAt(0) : "");
        System.out.println();
        for(String str1 = "agghlvvvvookkllmetrr"; !str1.isEmpty() ;str1 = str1.replace(str1.charAt(0) + "","")){
            System.out.print(str1.lastIndexOf(str1.charAt(0)) == 0 ? str1.charAt(0) : "");        }
    }
}
